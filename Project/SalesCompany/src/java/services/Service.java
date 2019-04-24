/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

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

    /**
     * Creates a new instance of Service
     */
    public Service() {
    }

    /**
     * Retrieves representation of an instance of services.Service
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Seller getSeller(@PathParam("id") int id) {
        Seller s = op.selectSeller(id);
        return s;
    }

    /**
     * PUT method for updating or creating an instance of Service
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
