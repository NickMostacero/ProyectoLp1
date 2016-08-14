/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.RegistroPerDao;
import dto.RegistroPer;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import util.Conexion;

/**
 *
 * @author cmalaspina1
 */
public class Test {
   public static  RegistroPerDao dao = new RegistroPerDao();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        conex();
//        crear();
        //update();
    //delete();
    listar();
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
    
    public static  void crear (){
        RegistroPer dto = new RegistroPer("Pancho", "e", 12, 912766257, "dfjasfh", "dsfd","ASASAS");
        int a = dao.create(dto);
        if(a>0){
            System.out.println("si");
        }else {
            System.out.println("no");
        }
        
    }
    public static void update (){
        RegistroPer dto = new RegistroPer("sds", "ee", 12, 222222222, "daad", "sdw","ASSDA");
        dto.setIdpersona(2);
        int a = dao.update(dto);
        if(a>0){
            System.out.println("si");
        }else {
            System.out.println("no");
        }
    }
    public static void delete (){
        int x =3;
        if(dao.delete(x)>0){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
        
    }
    public static void listar (){
        List<RegistroPer> lista =  new ArrayList<>();
        
        lista = dao.ListUser();
        for (int i =1; i<lista.size();i++){
            System.out.println(lista.get(i).getNombre());
        }
    }
}
