package com.example.salescompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class insertTickets extends AppCompatActivity {

    Button registerTicket, deleteTicket;
    EditText idTicket,date,hour,airline,clas,arrival,departure,gate,flightNumber,seat,price,stock,discount;
    singleToneClass singleToneClass = com.example.salescompany.singleToneClass.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_tickets);

        registerTicket = (Button) findViewById(R.id.registerTicket);
        deleteTicket = (Button) findViewById(R.id.deleteTicket);

        idTicket = (EditText) findViewById(R.id.idTicket);
        date = (EditText) findViewById(R.id.date);
        hour = (EditText) findViewById(R.id.hour);
        airline = (EditText) findViewById(R.id.airline);
        clas = (EditText) findViewById(R.id.clas);
        arrival = (EditText) findViewById(R.id.arrival);
        departure = (EditText) findViewById(R.id.departure);
        gate = (EditText) findViewById(R.id.gate);
        flightNumber = (EditText) findViewById(R.id.flightNumber);
        seat = (EditText) findViewById(R.id.seat);
        price = (EditText) findViewById(R.id.price);
        stock = (EditText) findViewById(R.id.stock);
        discount = (EditText) findViewById(R.id.discount);

        registerTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });

        deleteTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete();
            }
        });
    }

    public void register(){

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/ticket";

        URL url = null;
        HttpURLConnection conn;

        try {

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            JSONObject paramsString = new JSONObject();
            paramsString.put("idSeller", singleToneClass.getIdSeller());
            paramsString.put("idTicket", idTicket.getText());
            paramsString.put("date", date.getText());
            paramsString.put("hour", hour.getText());
            paramsString.put("airline", airline.getText());
            paramsString.put("clas", clas.getText());
            paramsString.put("arrival", arrival.getText());
            paramsString.put("departure", departure.getText());
            paramsString.put("gate", gate.getText());
            paramsString.put("flightNumber", flightNumber.getText());
            paramsString.put("seat", seat.getText());
            paramsString.put("price", price.getText());
            paramsString.put("stock", stock.getText());
            paramsString.put("discount", discount.getText());

            url = new URL(sql);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");

            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
            wr.writeBytes(paramsString.toString());
            wr.flush();
            wr.close();

            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            String json = "";

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            json = response.toString();

            JSONObject jsonObject = new JSONObject(json);
            Log.e("SALIDA", json);


            if (jsonObject.optString("Execution").equals("true")) {
                Toast.makeText(getApplicationContext(), "Ticket Registered", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Error with Register", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/ticket/"+idTicket.getText();
        URL url = null;
        HttpURLConnection conn;

        try {

            url = new URL(sql);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("DELETE");
            conn.connect();

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            String json = "";

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            json = response.toString();

            JSONObject jsonObject = new JSONObject(json);
            Log.e("SALIDA", json);


            if (jsonObject.optString("Execution").equals("true")) {
                Toast.makeText(getApplicationContext(), "Deleted Ticket", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Undeleted Ticket", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
