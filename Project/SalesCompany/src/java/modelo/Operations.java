/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */
public class Operations {
    
    private Conexion conex;
    private PreparedStatement pst;
    private ResultSet rs;
    private String query;
    
    public Seller selectSeller(int id){
        Seller seller = new Seller();
        try{
            conex = new Conexion();
            query="Select * From seller where idSeller="+id;
            pst = conex.getConexion().prepareStatement(query);
            rs=pst.executeQuery(query);
            while(rs.next()){
                seller = new Seller(rs.getInt("idSeller"),rs.getString("name"),rs.getString("lastName"),rs.getString("address"),rs.getString("telephone"),rs.getString("email"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo obtener datos");
        
        }
        return seller;
    }
    
    
}
