/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import model.Ficha;

/**
 *
 * @author josemanuelmendez
 */
public class TemperaturasServiceImpl implements TemperaturasService {
    
    @Override
    public boolean introducirTemperatura(Ficha ficha) {
         boolean resultado = false;

        try(Connection con=DatosLocator.getConnection()){
       
            String sql="insert into ficha(idSensor, temperatura, fechaHora)";
            sql+="values(?,?,?)";
 //           java.sql.Timestamp sqlTS = new java.sql.Timestamp(convert(ficha.getFechaHora()));
            PreparedStatement ps=con.prepareStatement(sql);
                ps.setInt(1, ficha.getSensor());
                ps.setDouble(2, ficha.getTemperatura());
                ps.setTimestamp(3,Timestamp.valueOf(ficha.getFechaHora()) ); 
 
               
               
                //ejecutamos instruccion
                ps.execute();
                return true;
       
        }catch(SQLException ex){
                ex.printStackTrace();
                return false;
        }
    }
    
    @Override
    public List<Ficha> obtenerTemperatura() {
        List<Ficha> fichas = new ArrayList<Ficha>();
        return fichas;
    }
    
//    public static java.sql.Date convert(java.util.Date date)
//    {
//        return new java.sql.Date(date.getTime());
//    }
    
    
}
