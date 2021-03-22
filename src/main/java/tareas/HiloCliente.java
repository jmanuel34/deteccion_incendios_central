/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import model.Ficha;
import service.TemperaturasFactory;
import utilidades.Utilidades;


/**
 *
 * @author Antonio
 */
public class HiloCliente implements Runnable{
    private final Socket socket;
    public HiloCliente(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        PrintStream ps=null;
        //usar una variable ya creada en un try con recursos solo es válido desde Java 9
        try(socket){//obtenemos los objetos para lectura y escritura
            InputStream entrada=socket.getInputStream();
            OutputStream salida=socket.getOutputStream();
            ps=new PrintStream(salida);
            //leemos el dato que nos envia el cliente y lo trasnformamos en un objeto pedido
            BufferedReader bf=new BufferedReader(new InputStreamReader(entrada));
            String json= bf.readLine();
            Ficha ficha=Utilidades.obtenerFicha(json);
            TemperaturasFactory.getTemperaturasService().introducirTemperatura(ficha);
            //enviamos respuesta           
            ps.println("Temperatura de "+ficha.getSensor()+" introducida");
        }
        catch(IOException ex){
            ex.printStackTrace();
            ps.println("error en el registro del pedido");
        }
    }
    
}
