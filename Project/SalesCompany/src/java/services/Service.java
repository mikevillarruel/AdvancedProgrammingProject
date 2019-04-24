
package services;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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


@Path("service")
public class Service {

    @Context
    private UriInfo context;
    Operations op = new Operations();
    static String json;

  
    public Service() {
    }


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
    public String calculateTripDay(@PathParam("idTicket") int id) {
        Date date = op.calculateDay(id);
        Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
        
        Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        int años = calendar.get(Calendar.YEAR);
        int meses =calendar.get(Calendar.MONTH) + 1;
        int dias =calendar.get(Calendar.DAY_OF_MONTH);
        
        int months = meses-mes;

        int fin = (dia-dias)+(mes*(30)-meses*(30));
        if (fin<0){
        fin=fin*(-1);
        }
    
        if(months<0){
     return "Su vuelo ya se paso de la fecha indicada"+ date;    
     
     }
     else{
            return "La fecha de vuelo es :"+ date + "\nLa fecha actual es: "
                    + año + "-" + mes + "-" + dia + "\nFaltan: "+fin
                    + " Dias para su vuelo";
     }
    } 
    
    
    @GET
    @Path("calculateDiscount/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDiscount(@PathParam("idTicket") int id) {
        double discount = op.calculateDiscount(id);
        return "El descuento es de: "+ "$" +discount;
    }
    
    @GET
    @Path("calculateCommission/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getCommission(@PathParam("idTicket") int id) {
        double commission = op.calculateCommission(id);
        return "La comision es de: "+ "$" +commission;
    }
}
