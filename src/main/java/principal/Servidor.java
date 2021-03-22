/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import tareas.HiloCliente;

/**
 *
 * @author Antonio
 */
public class Servidor {

   
    public static void main(String[] args) {
        ExecutorService executor=Executors.newCachedThreadPool();
        //creamos el objeto servidor, por un puerto libre, en este caso el 8000
        try(ServerSocket server=new ServerSocket(9000);){
            System.out.println("Esperando llamadas...");
            //el programa se queda bloqueado en esta instrucción, a la espera
            //de recibir una petición de conexión desde otra app
            while(true){
                Socket socket=server.accept();
                System.out.println("Llamada recibida....");
                //creamos una instancia de la clase que atenderá a cada cliente
                //y la ponemos en ejecución concurrente con el resto
                executor.submit(new HiloCliente(socket));
              
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}

/*
LocalDateTime fechaHora = LocalDateTime.now();
        Ficha ficha = new Ficha(0, 1, 34.5, fechaHora);
        TemperaturasFactory.getTemperaturasService().introducirTemperatura(ficha);
*/
