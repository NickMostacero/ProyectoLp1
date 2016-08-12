/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import util.Conexion;

/**
 *
 * @author cmalaspina1
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conex();
    }
    public static void conex()
    {
        Connection cx = Conexion.getConnection();
        if (cx != null)
        {
            System.out.println("si");
        }else
        {
            System.out.println("no");
        }
        }
}
