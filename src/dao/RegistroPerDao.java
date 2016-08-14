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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import util.Conexion;

/**
 *
 * @author Tupac
 */
public class RegistroPerDao implements Operaciones<RegistroPer>{

    private ResultSet rs;
    private PreparedStatement ps;
    private Connection cx;
     private static final String Create ="INSERT INTO persona(idpersona, Nombre, Apellidos,Edad, NumCel, Correo, Cargo) VALUES (NULL, ?, ?, ?, ?, ?, ?);";
     private static final  String update ="UPDATE persona SET Nombre = ? , Apellidos = ?, Edad = ?, NumCel = ?, Correo =?, Cargo = ? WHERE idpersona = ?;";
     private static final  String delete ="DELETE FROM persona WHERE idpersona = ?";
     private static final String ReadAll ="SELECT * FROM persona";
    
    
    @Override
    public int create(RegistroPer e) {
    int a = 0;

        try {
            cx = Conexion.getConnection();
            ps = cx.prepareStatement(Create);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getEdad());
            ps.setInt(4, e.getNumCel());
            ps.setString(5, e.getCorreo());
            ps.setString(6, e.getCargo());
            a = ps.executeUpdate();
        } catch (Exception x) {
         JOptionPane.showMessageDialog(null, "error CREATE :" + x);
        }finally{
            Conexion.cerrar();
        }
    return a;
    
    }

    @Override
    public int delete(Object key) {
        int a = 0;
        try {
            cx = Conexion.getConnection();
            ps = cx.prepareStatement(delete);
            
            ps.setObject(1, key);
                        
            a = ps.executeUpdate();
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error CREATE :" + x);
        }finally{
            Conexion.cerrar();
        }
    return a;      
    }

    @Override
    public int update(RegistroPer e) {
     int a = 0;
        try {
            cx = Conexion.getConnection();
            ps = cx.prepareStatement(update);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getEdad());
            ps.setInt(4, e.getNumCel());
            ps.setString(5, e.getCorreo());
            ps.setString(6, e.getCargo());
            ps.setInt(7, e.getIdpersona());
            
            a = ps.executeUpdate();
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error Update :" + x);
        }finally{
            Conexion.cerrar();
        }
    return a;    
    
    }
    @Override
    public List<RegistroPer> ListUser() {
     List<RegistroPer> lista  = new ArrayList<>();
        try {
            cx = Conexion.getConnection();
            ps = cx.prepareStatement(ReadAll);
            
            rs = ps.executeQuery();
            while (rs.next()){
                RegistroPer dto = new RegistroPer();
                dto.setIdpersona(rs.getInt("idpersona"));
                dto.setNombre(rs.getString("Nombre"));
                dto.setApellido(rs.getString("Apellidos"));
                dto.setEdad(rs.getInt("Edad"));
                dto.setNumCel(rs.getInt("NumCel"));
                dto.setCorreo(rs.getString("Correo"));
                dto.setCargo(rs.getString("Cargo"));
                lista.add(dto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error readAll :" + e);
       
        }finally{
            Conexion.cerrar();
        }
        return lista;
        
    }
    
}
