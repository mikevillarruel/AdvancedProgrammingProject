package com.example.salescompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class buyTicket extends AppCompatActivity {

    Button buy;
    EditText quantity;
    TextView details;
    singleToneClass singleToneClass = com.example.salescompany.singleToneClass.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_ticket);

        buy = (Button) findViewById(R.id.buyTicket);
        quantity = (EditText) findViewById(R.id.quantity);
        details = (TextView) findViewById(R.id.details);

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy();
            }
        });

    }

    public void buy(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/buy/" + singleToneClass.getidTicket()+ "/" + quantity.getText();
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

            if(json.contains("Stock")){
                data = data + "There is not enough stock.\nStock: " + jsonObject.optString("Stock") + "\n";


            }else{
                data = data + "Subtotal: " + jsonObject.optString("Subtotal") + "\n";
                data = data + "Discount: " + jsonObject.optString("Descuento") + "\n";
                data = data + "Total: " + jsonObject.optString("Total") + "\n";
                data = data + "\nSeller Contacts: \n\n";
                data = data + getSeller();
            }

            details.setText(data);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getSeller(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/sellerTicket/" + singleToneClass.getidTicket();
        URL url = null;
        HttpURLConnection conn;
        String data = "";

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

            if(json.contains("Stock")){
                data = "";
            }else{
                data = data + "Name: " + jsonObject.optString("name") + "\n";
                data = data + "Last ame: " + jsonObject.optString("lastName") + "\n";
                data = data + "Telephone: " + jsonObject.optString("telephone") + "\n";
                data = data + "Email: " + jsonObject.optString("email") + "\n";
                data = data + "Address: " + jsonObject.optString("address") + "\n";
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (JSONException e) {
            e.printStackTrace();
        }
        return data;

    }
}
