package com.example.salescompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class salesTickets extends AppCompatActivity {

    ListView tickets;
    ArrayList<Integer> idList;
    Button btnSearch, btnViewAll;
    EditText search;
    singleToneClass singleToneClass = com.example.salescompany.singleToneClass.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_tickets);

        tickets = (ListView)findViewById(R.id.tickets);
        btnSearch = (Button) findViewById(R.id.btnSearch);
        btnViewAll = (Button) findViewById(R.id.btnViewAll);
        search = (EditText) findViewById(R.id.search);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(search.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Type Something or Press View All Button", Toast.LENGTH_SHORT).show();
                }else {
                    getData(search.getText().toString().replace(" ", ""));
                }
            }
        });

        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData("");
            }
        });

        tickets.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id){
                int item = position;
                String itemval = (String)tickets.getItemAtPosition(position);
                singleToneClass.setidTicket(idList.get(position));
                getDetails();
            }
        });
    }

    public void getDetails(){
        Intent i = new Intent(this, ticketDetails.class);
        startActivity(i);
    }

    public void getData(String search){

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/tickets";
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

            JSONArray jsonArray = new JSONArray(json);



            if(json.equals("{}")){
                Toast.makeText(getApplicationContext(),"NOT FOUND :(",Toast.LENGTH_SHORT).show();
            }
            else {

                ArrayList<String> sellers = new ArrayList<String>();
                idList = new ArrayList<Integer>();
                String data = "";
                for(int i=0; i < jsonArray.length(); i++) {
                    data = "";
                    if(jsonArray.getJSONObject(i).toString().toLowerCase().contains(search.toLowerCase()) ){

                        idList.add(jsonArray.getJSONObject(i).optInt("idTicket"));

                        //data = "ID: " + jsonArray.getJSONObject(i).optString("idTicket") + "\n";
                        data = data + "Arrival: " + jsonArray.getJSONObject(i).optString("arrival") + "\n";
                        data = data + "Departure: " + jsonArray.getJSONObject(i).optString("departure") + "\n";
                        data = data + "Price: " + jsonArray.getJSONObject(i).optString("price") + "\n";
                        data = data + "Discount: " + jsonArray.getJSONObject(i).optString("discount") + "%";
                        sellers.add(data);
                    }

                }

                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.item , R.id.tickets, sellers);
                tickets.setAdapter(arrayAdapter);
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
