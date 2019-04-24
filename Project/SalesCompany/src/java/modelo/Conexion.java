/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

/**
 *
 * @author Mike
 */
public class Conexion {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    static String bd="salescompany";
    static String login="root";
    static String password="ferxoes1697";
    static String url="jdbc:mysql://localhost/"+bd;
    
    Connection conn=null;

    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,login,password);
            if(conn!=null){
                System.out.println("Conexion a base de datos ok");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    
    public Connection getConexion(){
        return conn;
    }
    
    public void desconectar(){
        conn=null;
    }

}
