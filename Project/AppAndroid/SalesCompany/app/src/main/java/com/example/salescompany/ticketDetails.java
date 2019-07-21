package com.example.salescompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ticketDetails extends AppCompatActivity {

    TextView ticketDetails, moreDetails;
    Button tripDay, discountValue, buy;

    singleToneClass singleToneClass = com.example.salescompany.singleToneClass.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_details);

        ticketDetails = (TextView) findViewById(R.id.ticketDetails);
        moreDetails = (TextView) findViewById(R.id.moreDetails);
        tripDay = (Button) findViewById(R.id.tripDay);
        discountValue = (Button) findViewById(R.id.discountValue);
        buy = (Button) findViewById(R.id.sale);

        tripDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTripDay();
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy();
            }
        });

        discountValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDiscountValue();
            }
        });

        getData();

    }

    public void buy(){
        Intent i = new Intent(this, buyTicket.class);
        startActivity(i);
    }

    public void setDiscountValue(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/calculateDiscount/" + singleToneClass.getidTicket();
        URL url = null;
        HttpURLConnection conn;

        try {
            url = new URL(sql);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String inputLine;

            StringBuffer response = new StringBuffer();

            String json = "";

            while((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }

            json = response.toString();

            JSONObject jsonObject =  new JSONObject(json);
            String data = "";
            data = data + "Discount: $" + jsonObject.optString("Descuento");
            moreDetails.setText(data);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void setTripDay(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/calculateDate/" + singleToneClass.getidTicket();
        URL url = null;
        HttpURLConnection conn;

        try {
            url = new URL(sql);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String inputLine;

            StringBuffer response = new StringBuffer();

            String json = "";

            while((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }

            json = response.toString();

            JSONObject jsonObject =  new JSONObject(json);
            String data = "";

            if(jsonObject.optString("FechaDeVuelo").equals("Expirada")){
                data = data + "Date of flight expired";
            }
            else {
                if(jsonObject.optString("DiasFaltantes").equals("1")){
                    data = data + jsonObject.optString("DiasFaltantes") + " day left for your flight";
                }else{
                    data = data + jsonObject.optString("DiasFaltantes") + " days left for your flight";
                }
            }
            moreDetails.setText(data);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void getData(){

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/ticket/" + singleToneClass.getidTicket();
        URL url = null;
        HttpURLConnection conn;

        try {
            url = new URL(sql);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String inputLine;

            StringBuffer response = new StringBuffer();

            String json = "";

            while((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }

            json = response.toString();

            JSONObject jsonObject =  new JSONObject(json);

            if(json.equals("{}")){
                Toast.makeText(getApplicationContext(),"NOT FOUND :(",Toast.LENGTH_SHORT).show();
            }
            else {

                String data = "";
                data = data + "ID: " + jsonObject.optString("idTicket") + "\n";
                data = data + "ID Seller: " + jsonObject.optString("idSeller") + "\n";
                data = data + "Date: " + jsonObject.optString("date").replace("Z","") + "\n";
                data = data + "Hour: " + jsonObject.optString("hour") + "\n";
                data = data + "Airline: " + jsonObject.optString("airline") + "\n";
                data = data + "Class: " + jsonObject.optString("clas") + "\n";
                data = data + "Arrival: " + jsonObject.optString("arrival") + "\n";
                data = data + "Departure: " + jsonObject.optString("departure") + "\n";
                data = data + "Gate: " + jsonObject.optString("gate") + "\n";
                data = data + "Flight Number: " + jsonObject.optString("flightNumber") + "\n";
                data = data + "Seat: " + jsonObject.optString("seat") + "\n";
                data = data + "Price: " + jsonObject.optString("price") + "\n";
                data = data + "Stock: " + jsonObject.optString("stock") + "\n";
                data = data + "Discount: " + jsonObject.optString("discount") + "%\n";
                ticketDetails.setText(data);

            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
