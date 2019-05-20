package services;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.Date;
import java.util.Calendar;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import modelo.Operations;
import modelo.Seller;
import modelo.Ticket;

@Path("service")
public class Service {

    @Context
    private UriInfo context;
    Operations op = new Operations();
    static String json;

    public Service() {
    }

    @POST
    @Path("login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean login(Seller seller) {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(seller);
            gson.toJsonTree(seller);
            seller = new Gson().fromJson(json, Seller.class);
            return op.login(seller);
        } catch (JsonSyntaxException e) {
            return false;
        }
    }

    @GET
    @Path("seller/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Seller getSeller(@PathParam("id") int id) {
        Seller seller = op.selectSeller(id);
        return seller;
    }

    @DELETE
    @Path("seller/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean deleteSeller(@PathParam("id") int id) {
        return op.deleteSeller(id);
    }

    @PUT
    @Path("seller/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Seller updateSeller(@PathParam("id") int id, Seller seller) {

        Gson gson = new Gson();
        String json = gson.toJson(seller);
        gson.toJsonTree(seller);
        Seller seller1 = new Gson().fromJson(json, Seller.class);

        seller1.setIdSeller(id);
        op.updateSeller(seller1);
        return seller1;
    }

    @POST
    @Path("seller")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean addSeller(Seller seller) {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(seller);
            gson.toJsonTree(seller);
            seller = new Gson().fromJson(json, Seller.class);
            return op.insertSeller(seller);
        } catch (JsonSyntaxException e) {
            return false;
        }
    }

    @GET
    @Path("ticket/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ticket getticket(@PathParam("id") int id) {
        return op.selectTicket(id);
    }

    @DELETE
    @Path("ticket/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean deleteTicket(@PathParam("id") int id) {
        return op.deleteTicket(id);
    }

    @POST
    @Path("ticket")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean addTicket(Ticket ticket) {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(ticket);
            gson.toJsonTree(ticket);
            ticket = new Gson().fromJson(json, Ticket.class);
            return op.insertTicket(ticket);
        } catch (JsonSyntaxException e) {
            return false;
        }
    }

    @GET
    @Path("sellerTicket/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public Seller getSellerTicket(@PathParam("idTicket") int id) {
        return op.selectSellerTicket(id);
    }

    @GET
    @Path("calculateDate/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public String calculateTripDay(@PathParam("idTicket") int id) {
        Date date = op.calculateDay(id);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        int años = calendar.get(Calendar.YEAR);
        int meses = calendar.get(Calendar.MONTH) + 1;
        int dias = calendar.get(Calendar.DAY_OF_MONTH);

        int months = meses - mes;

        int fin = (dia - dias) + (mes * (30) - meses * (30));
        if (fin < 0) {
            fin = fin * (-1);
        }

        if (months < 0) {
            return "Su vuelo ya se paso de la fecha indicada" + date;

        } else {
            return "La fecha de vuelo es :" + date + "\nLa fecha actual es: "
                    + año + "-" + mes + "-" + dia + "\nFaltan: " + fin
                    + " Dias para su vuelo";
        }
    }

    @GET
    @Path("calculateDiscount/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDiscount(@PathParam("idTicket") int id) {
        return "El descuento es de: " + "$" + op.calculateDiscount(id);
    }

    @GET
    @Path("calculateCommission/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCommission(@PathParam("idTicket") int id) {
        return "La comision es de: " + "$" + op.calculateCommission(id);
    }

    @GET
    @Path("buy/{id}/{cantidad}")
    @Produces(MediaType.APPLICATION_JSON)
    public String buy(@PathParam("id") int id, @PathParam("cantidad") int cantidad) {
        
        if (op.updateTicket(id, cantidad)) {
            Ticket ticket = op.selectTicket(id);
            double price = ticket.getPrice();
            double discount = (double) ticket.getDiscount();
            price = price * cantidad;
            discount = (price * (discount / 100));
            double total = price - discount;
            op.updatePendingValues((total*0.08), id);
            return "Subtotal: " + price
                    + "\nDescuento: " + discount
                    + "\nTotal: " + total+
                    "\nComision: "+(total*0.08);
        } else {
            return "No hay suficiente stock";
        }
    }
    
    @GET
    @Path("pay/{id}/{deposit}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean setPay(@PathParam("id") int id, @PathParam("deposit") double deposit){
        
        return op.setPay(id, deposit);     
    }
    
    

}
