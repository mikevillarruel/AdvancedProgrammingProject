package services;

import com.google.gson.Gson;
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
import org.json.JSONException;
import org.json.JSONObject;

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
    public Object login(Seller seller) {
        JSONObject response = new JSONObject();

        try {
            Gson gson = new Gson();
            String json = gson.toJson(seller);
            gson.toJsonTree(seller);
            seller = new Gson().fromJson(json, Seller.class);
            response.put("Execution", op.login(seller));
        } catch (Exception e) {
            try {
                response.put("Execution", false);
            } catch (JSONException ex) {
            }
        }
        return response.toString();
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
    public Object deleteSeller(@PathParam("id") int id) throws JSONException {
        JSONObject response = new JSONObject();
        response.put("Execution", op.deleteSeller(id));
        return response.toString();
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
        return op.selectSeller(id);
    }

    @POST
    @Path("seller")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Object addSeller(Seller seller) {
        JSONObject response = new JSONObject();

        try {
            Gson gson = new Gson();
            String json = gson.toJson(seller);
            gson.toJsonTree(seller);
            seller = new Gson().fromJson(json, Seller.class);
            response.put("Execution", op.insertSeller(seller));
        } catch (Exception e) {
            try {
                response.put("Execution", false);
            } catch (JSONException ex) {
            }
        }

        return response.toString();
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
    public Object deleteTicket(@PathParam("id") int id) {
        JSONObject response = new JSONObject();
        try {
            response.put("Execution", op.deleteTicket(id));
        } catch (JSONException ex) {
        }
        return response.toString();
    }

    @POST
    @Path("ticket")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Object addTicket(Ticket ticket) {
        JSONObject response = new JSONObject();
        try {
            Gson gson = new Gson();
            String json = gson.toJson(ticket);
            gson.toJsonTree(ticket);
            ticket = new Gson().fromJson(json, Ticket.class);
            response.put("Execution", op.insertTicket(ticket));
        } catch (Exception e) {
            try {
                response.put("Execution", false);
            } catch (JSONException ex) {
            }
        }
        return response.toString();
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

        JSONObject response = new JSONObject();

        if (months < 0) {
            try {
                response.put("FechaDeVuelo", "Expirada");
                return response.toString();
            } catch (JSONException ex) {
                return null;
            }
        } else {
            try {
                response.put("FechaDeVuelo", date);
                if (mes < 9 && dia < 9) {
                    response.put("FechaActual", año + "-0" + mes + "-0" + dia);
                } else if (mes < 9) {
                    response.put("FechaActual", año + "-0" + mes + "-" + dia);
                } else if (dia < 9) {
                    response.put("FechaActual", año + "-" + mes + "-0" + dia);
                } else {
                    response.put("FechaActual", año + "-" + mes + "-" + dia);
                }
                response.put("DiasFaltantes", fin);
                return response.toString();
            } catch (JSONException ex) {
                return null;
            }
        }

    }

    @GET
    @Path("calculateDiscount/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public Object getDiscount(@PathParam("idTicket") int id) {
        JSONObject response = new JSONObject();
        try {
            response.put("Descuento", op.calculateDiscount(id));
            return response.toString();
        } catch (JSONException ex) {
            return null;
        }
    }

    @GET
    @Path("calculateCommission/{idTicket}")
    @Produces(MediaType.APPLICATION_JSON)
    public Object getCommission(@PathParam("idTicket") int id) {
        JSONObject response = new JSONObject();
        try {
            response.put("Comision", op.calculateCommission(id));
            return response.toString();
        } catch (JSONException ex) {
            return null;
        }
    }

    @GET
    @Path("buy/{id}/{cantidad}")
    @Produces(MediaType.APPLICATION_JSON)
    public Object buy(@PathParam("id") int id, @PathParam("cantidad") int cantidad) {

        JSONObject response = new JSONObject();

        if (op.updateTicket(id, cantidad)) {
            Ticket ticket = op.selectTicket(id);
            double price = ticket.getPrice();
            double discount = (double) ticket.getDiscount();
            price = price * cantidad;
            discount = (price * (discount / 100));
            double total = price - discount;
            op.updatePendingValues((total * 0.08), id);

            try {
                response.put("Subtotal", price);
                response.put("Descuento", discount);
                response.put("Total", total);
                response.put("Comision", op.calculateCommission(id) * cantidad);
            } catch (JSONException ex) {
            }

        } else {

            try {
                response.put("Stock", op.selectTicket(id).getStock());
            } catch (JSONException ex) {
            }

        }

        return response.toString();
    }

    @GET
    @Path("pay/{id}/{deposit}")
    @Produces(MediaType.APPLICATION_JSON)
    public Object setPay(@PathParam("id") int id, @PathParam("deposit") double deposit) throws JSONException {
        JSONObject response = new JSONObject();
        response.put("Execution", op.setPay(id, deposit));
        return response.toString();
    }
}
