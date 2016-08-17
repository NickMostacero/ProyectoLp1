/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cmalaspina1
 */
public class Conexion {
   private static String URL = "jdbc:mysql://localhost:3306/bd-registrouser01tabla";
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USER = "root";
    private static String CLAVE = "branduxroot";
    private static Connection cx = null;
    
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, CLAVE);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return cx;
    }
    
    public static void cerrar (){
        if (cx != null){
            cx = null;
        }
    }
}

