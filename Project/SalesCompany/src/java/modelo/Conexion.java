
package modelo;

import java.sql.*;

public class Conexion {

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
