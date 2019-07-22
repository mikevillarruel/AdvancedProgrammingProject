package com.example.salescompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class profile extends AppCompatActivity {

    TextView detailsProfile;
    Button editProfile, deleteProfile;
    singleToneClass singleToneClass = com.example.salescompany.singleToneClass.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        detailsProfile = findViewById(R.id.detailsProfile);

        editProfile = (Button) findViewById(R.id.editProfile);
        deleteProfile = (Button) findViewById(R.id.deleteProfile);

        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEditProfile();
            }
        });
        deleteProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDeleteProfile();
            }
        });

        getData();

    }

    public void setEditProfile(){
        Intent i = new Intent(this, editProfile.class);
        startActivity(i);
    }

    public void setDeleteProfile(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/seller/"+singleToneClass.getIdSeller();
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
                Toast.makeText(getApplicationContext(), "Deleted User", Toast.LENGTH_SHORT).show();
                singleToneClass.setIdSeller(0);
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
            } else {
                Toast.makeText(getApplicationContext(), "Undeleted User", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void getData() {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String sql = "http://" + singleToneClass.getIP() + "/SalesCompany/sales/service/seller/"+singleToneClass.getIdSeller();
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

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            json = response.toString();

            JSONObject jsonObject = new JSONObject(json);
            String data = "";

            if (json.equals("{}")) {
                Toast.makeText(getApplicationContext(), "NOT FOUND :(", Toast.LENGTH_SHORT).show();
            } else {

                data = "ID: " + jsonObject.optString("idSeller") + "\n";
                data = data + "Name: " + jsonObject.optString("name") + "\n";
                data = data + "Last Name: " + jsonObject.optString("lastName") + "\n";
                data = data + "Email: " + jsonObject.optString("email") + "\n";
                data = data + "Telephone: " + jsonObject.optString("telephone") + "\n";
                data = data + "Address: " + jsonObject.optString("address");
            }

            detailsProfile.setText(data);

        } catch (Exception e) {

        }
    }
}

