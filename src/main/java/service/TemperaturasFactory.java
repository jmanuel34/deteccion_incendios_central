/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author josemanuelmendez
 */
public class TemperaturasFactory {
    public static TemperaturasService getTemperaturasService(){
        return new TemperaturasServiceImpl();
    }
    
}