/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.intsuperior.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Conexion {
    private static Connection con=null;
    private static String url="jdbc:mysql://localhost:3306/db_hosterialaguacoto";
    private static String user="root";
    private static String passwd="Aronalejo.12..";
    
    public static Connection getConexion(){
        
        try {
            con=DriverManager.getConnection(url,user, passwd);
           // JOptionPane.showMessageDialog(null,"conexion exitosa");
            
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
           
            
        }
        return con;
    }
}
    

   
    

