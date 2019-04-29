
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.sql.Time;


public class Operations {

    private Conexion conex;
    private PreparedStatement pst;
    private ResultSet rs;
    private String query;
    public static String json;

    public Seller selectSeller(int id) {
        Seller seller = new Seller();
        try {
            conex = new Conexion();
            query = "Select * From seller where idSeller=" + id;
            pst = conex.getConexion().prepareStatement(query);
            rs = pst.executeQuery(query);
            while (rs.next()) {
                seller = new Seller(rs.getInt("idSeller"), rs.getString("userName"),null,rs.getString("name"), rs.getString("lastName"), rs.getString("address"), rs.getString("telephone"), rs.getString("email"),rs.getDouble("pendingValues"));
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
                ticket = new Ticket(rs.getInt("idTicket"), rs.getInt("idSeller"), rs.getDouble("price"), rs.getString("departure"), rs.getString("arrival"), rs.getString("class"), rs.getDate("date"), rs.getTime("hour"), rs.getString("airline"), rs.getString("gate"), rs.getString("flightNumber"), rs.getString("seat"), rs.getInt("stock"), rs.getInt("discount"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener datos");

        }

        return ticket;
    }
    
    public boolean insertTicket(Ticket ticket){
        try{
            conex = new Conexion();
            String query = "INSERT INTO ticket (IDTICKET, IDSELLER, PRICE, DEPARTURE, ARRIVAL, CLASS, DATE, HOUR, AIRLINE, GATE, FLIGHTNUMBER, SEAT, STOCK, DISCOUNT) " + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";          
            PreparedStatement pst = conex.getConexion().prepareStatement(query);
            pst.setInt(1, ticket.getIdTicket());
            pst.setInt(2, ticket.getIdSeller());
            pst.setDouble(3, ticket.getPrice());
            pst.setString(4, ticket.getDeparture());
            pst.setString(5, ticket.getArrival());
            pst.setString(6, ticket.getClas());
            pst.setDate(7, ticket.getDate());
            pst.setTime(8, ticket.getHour());
            pst.setString(9, ticket.getAirline());
            pst.setString(10, ticket.getGate());
            pst.setString(11, ticket.getFlightNumber());
            pst.setString(12, ticket.getSeat());
            pst.setInt(13, ticket.getStock());
            pst.setDouble(14, ticket.getDiscount());
            pst.executeUpdate();         
            conex.desconectar();
            pst.close();
            
        }catch(SQLException e){
            return false;
        }
        return true;
    }

    public boolean insertSeller(Seller seller){
         try {
            conex = new Conexion();
            String query = "INSERT INTO seller (IDSELLER, USERNAME, PASSWORD, NAME, LASTNAME, ADDRESS, TELEPHONE, EMAIL, PENDINGVALUES) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement orden = conex.getConexion().prepareStatement(query);
            orden.setInt(1, seller.getIdSeller());
            orden.setString(2, seller.getUserName());
            orden.setString(3, seller.getPassword());
            orden.setString(4, seller.getName());
            orden.setString(5, seller.getLastName());
            orden.setString(6, seller.getAddress());
            orden.setString(7, seller.getTelephone());
            orden.setString(8, seller.getEmail());
            orden.setDouble(9, seller.getPendingValues());
            orden.executeUpdate();
            conex.desconectar();            
            orden.close();              
            
        } catch (SQLException e) {
            return false;
        }
         return true;
    }
    
    public boolean deleteTicket(int idTicket) {
        
        try {
            conex = new Conexion();
            query = "delete from ticket where idTicket = "+idTicket;
            pst = conex.getConexion().prepareStatement(query);
            pst.executeUpdate();
        } catch (SQLException e) {
            return false;
        }
        return true;
        
    }
    
    public Seller selectSellerTicket(int idTicket) {
        Seller seller = new Seller();
        try {
            conex = new Conexion();
            query = "SELECT * FROM seller where idSeller = (SELECT idSeller FROM ticket where idTicket =" + idTicket + ")";
            pst = conex.getConexion().prepareStatement(query);
            rs = pst.executeQuery(query);
            while (rs.next()) {
                seller = new Seller(rs.getInt("idSeller"), rs.getString("userName"),null,rs.getString("name"), rs.getString("lastName"), rs.getString("address"), rs.getString("telephone"), rs.getString("email"),rs.getDouble("pendingValues"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener datos");

        }
        return seller;
    }
    
    public Date calculateDay(int idTicket){
        Date date=null;
       
       try {
            conex = new Conexion();
            query = "Select * From ticket where idTicket=" + idTicket;
            pst = conex.getConexion().prepareStatement(query);
            rs = pst.executeQuery(query);
            while (rs.next()) {
                date = rs.getDate("date");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener datos");
        }
        return date;
    
    }
    
    public double calculateDiscount(int id) {
        double price=0;
        int discount=0;
        try {
            conex = new Conexion();
            query = "Select price,discount From ticket where idTicket=" + id;
            pst = conex.getConexion().prepareStatement(query);
            rs = pst.executeQuery(query);
            while (rs.next()) {
                price = rs.getDouble("price");
                discount = rs.getInt("discount");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener datos");

        }
        return (price * discount/100);
    }
    
    public double calculateCommission(int id) {
        double price=0;
        int discount=0;
        try {
            conex = new Conexion();
            query = "Select price,discount From ticket where idTicket=" + id;
            pst = conex.getConexion().prepareStatement(query);
            rs = pst.executeQuery(query);
            while (rs.next()) {
                price = rs.getDouble("price");
                discount = rs.getInt("discount");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo obtener datos");

        }
        return (price - (price * discount/100))*0.05;
    }
    
    public boolean deleteSeller(int id){
        String query = "Delete From seller Where idseller=?";          
        String sql = "Delete From ticket Where idseller=?";
        try {
            conex = new Conexion();
            PreparedStatement pst = conex.getConexion().prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();              
            
            pst = conex.getConexion().prepareStatement(query);
            pst.setInt(1, id);
            pst.executeUpdate();   
            pst.close();
            System.out.println("registro borrado");            
            
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }           
    } 
    
    public boolean updateSeller(Seller seller){
        try {
            conex = new Conexion();
            String sql = "Update seller Set name=?, lastname=?, address=?, telephone=?, email=? Where idseller=?;";
            PreparedStatement pst = conex.getConexion().prepareStatement(sql);
            pst.setString(1, seller.getName());
            pst.setString(2, seller.getLastName());
            pst.setString(3, seller.getAddress());
            pst.setString(4, seller.getTelephone());
            pst.setString(5, seller.getTelephone());
            pst.setInt(6, seller.getIdSeller());

            pst.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("\t\tError al actualizar base de datos: "+e.getMessage());
            return false;
        }
    }
}

