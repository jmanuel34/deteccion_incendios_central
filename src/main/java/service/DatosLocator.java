/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Antonio
 */
public class DatosLocator {
    private static String cadenaCon="jdbc:mysql://localhost:3306/centraltemperaturas?serverTimezone=UTC";
    private static String user="root";
    private static String pwd="root";

    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(cadenaCon, user, pwd);
    } 
}
