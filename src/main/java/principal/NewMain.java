/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.time.LocalDateTime;
import model.Ficha;
import service.TemperaturasFactory;

/**
 *
 * @author josemanuelmendez
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        LocalDateTime fechaHora = LocalDateTime.now();
        Ficha ficha = new Ficha(0, 1, 34.5, fechaHora);
        TemperaturasFactory.getTemperaturasService().introducirTemperatura(ficha);
    }
    
}
