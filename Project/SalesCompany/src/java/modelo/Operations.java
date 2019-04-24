/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */
public class Operations {
    
    private Conexion conex;
    private PreparedStatement prepareStatement;
    private ResultSet result;
    private Statement statement;
    private String query;
    
    public Seller selectSeller(int idSeller){     
        query = 
                "select *\n"
                + "from seller\n"
                + "where idSeller = " + idSeller;
        try{
            conex = new Conexion();
            statement = conex.getConexion().createStatement();
            result = statement.executeQuery(query);
            if(result.next()){
                return new Seller(result.getInt("idCourse"),result.getString("name"),result.getString("lastName"),result.getString("address"),result.getString("telephone"),result.getString("email"));
            }
            statement.close();
            result.close();
            conex.desconectar();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    
}
