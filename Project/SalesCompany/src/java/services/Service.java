/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.google.gson.Gson;
import java.sql.Date;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import modelo.Operations;
import modelo.Seller;
import modelo.Ticket;

/**
 * REST Web Service
 *
 * @author Mike
 */
@Path("service")
public class Service {

    @Context
    private UriInfo context;
    Operations op = new Operations();
    static String json;

    /**
     * Creates a new instance of Service
     */
    public Service() {
    }

    /**
     * Retrieves representation of an instance of services.Service
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("seller/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Seller getSeller(@PathParam("id") int id) {
        Seller seller = op.selectSeller(id);
        return seller;
    }

    @GET
    @Path("ticket/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ticket getticket(@PathParam("id") int id) {
        Ticket ticket = op.selectTicket(id);
        return ticket;
    }
    
    @GET
    @Path("sellerTicket/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public Seller getSellerTicket(@PathParam("idTicket") int id) {
        Seller seller = op.selectSellerTicket(id);
        return seller;
    }
    
    @GET
    @Path("calculateDate/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ticket calculateTripDay(@PathParam("idTicket") int id) {

        Ticket ticket = op.calculateDay(id);
     return ticket;
    } 
    
    @GET
    @Path("calculateDiscount/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDiscount(@PathParam("idTicket") int id) {
        double discount = op.calculateDiscount(id);
        return "El descuento es de: "+ "$" +discount;
    }
}
