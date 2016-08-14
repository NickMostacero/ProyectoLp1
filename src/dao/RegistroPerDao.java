/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.RegistroPer;
import interfaces.Operaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import util.Conexion;

/**
 *
 * @author Tupac
 */
public class RegistroPerDao implements Operaciones<RegistroPer>{

    private ResultSet rs;
    private PreparedStatement ps;
    private Connection cx;
     private String Create ="INSERT INTO persona(idpersona, Nombre, Apellidos,Edad, NumCel, Correo, Cargo) VALUES (NULL, ?, ?, ?, ?, ?, ?);";
     private String update ="UPDATE persona SET Nombre = ? , Apellidos = ?, Edad = ?, NumCel = ?, Correo =?, Cargo = ? WHERE idpersona = ?;";
     private String delete ="DELETE FROM persona WHERE idpersona = ?";
     private String ReadAll ="SELECT * FROM persona";
    
    
    @Override
    public int create(RegistroPer e) {
    int a = 0;

        try {
            Connection cx = Conexion.getConnection();
            cx.prepareStatement(Create);
        } catch (Exception e) {
        }
    
    
    }

    @Override
    public int delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(RegistroPer e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RegistroPer> ListUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
