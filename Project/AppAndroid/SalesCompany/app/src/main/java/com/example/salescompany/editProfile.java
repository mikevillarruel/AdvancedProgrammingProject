package com.example.salescompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

public class editProfile extends AppCompatActivity {

    EditText name, lastName, telephone, email, address;
    Button sendChanges;
    singleToneClass singleToneClass = com.example.salescompany.singleToneClass.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        name = (EditText) findViewById(R.id.name);
        lastName = (EditText) findViewById(R.id.lastName);
        address = (EditText) findViewById(R.id.address);
        telephone = (EditText) findViewById(R.id.telephone);
        email = (EditText) findViewById(R.id.email);

        sendChanges = (Button) findViewById(R.id.sendChanges);

        sendChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executeUpdate();
            }
        });

        getData();

    }

    public void executeUpdate() {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/seller/"+singleToneClass.getIdSeller();

        URL url = null;
        HttpURLConnection conn;

        try {

            JSONObject paramsString = new JSONObject();
            paramsString.put("name", name.getText());
            paramsString.put("lastName", lastName.getText());
            paramsString.put("address", address.getText());
            paramsString.put("telephone", telephone.getText());
            paramsString.put("email", email.getText());

            url = new URL(sql);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("PUT");
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


            if (jsonObject.optString("name").equals(name.getText().toString())) {
                Toast.makeText(getApplicationContext(), "User Updated", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Error with Update", Toast.LENGTH_SHORT).show();
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

            if (json.equals("{}")) {
                Toast.makeText(getApplicationContext(), "NOT FOUND :(", Toast.LENGTH_SHORT).show();
            } else {
                name.setText(jsonObject.optString("name"));
                lastName.setText(jsonObject.optString("lastName"));
                email.setText(jsonObject.optString("email"));
                telephone.setText(jsonObject.optString("telephone"));
                address.setText(jsonObject.optString("address"));
            }

        } catch (Exception e) {

        }
    }
}
