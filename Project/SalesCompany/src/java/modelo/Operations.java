/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public Seller selectSeller(int id) {
        Seller seller = new Seller();
        try {
            conex = new Conexion();
            query = "Select * From seller where idSeller=" + id;
            pst = conex.getConexion().prepareStatement(query);
            rs = pst.executeQuery(query);
            while (rs.next()) {
                seller = new Seller(rs.getInt("idSeller"), rs.getString("name"), rs.getString("lastName"), rs.getString("address"), rs.getString("telephone"), rs.getString("email"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener datos");

        }
        return seller;
    }

    public Ticket selectTicket(int id) {
        Ticket ticket = new Ticket();
        try {
            conex = new Conexion();
            query = "Select * From ticket where idTicket=" + id;
            pst = conex.getConexion().prepareStatement(query);
            rs = pst.executeQuery(query);
            while (rs.next()) {
                ticket = new Ticket(rs.getInt("idTicket"), rs.getInt("idSeller"), rs.getDouble("price"), rs.getString("departure"), rs.getString("arrival"), rs.getString("class"), rs.getDate("date"), rs.getTime("hour"), rs.getString("airline"), rs.getString("gate"), rs.getString("flightNumber"), rs.getString("seat"), rs.getInt("stock"), rs.getInt("discount"), rs.getBoolean("state"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener datos");

        }
        return ticket;
    }

}
