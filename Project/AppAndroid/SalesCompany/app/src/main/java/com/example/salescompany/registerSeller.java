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

public class registerSeller extends AppCompatActivity {

    EditText idSeller, name, lastName, telephone, email, address, userName, password;
    Button registerSeller;
    singleToneClass singleToneClass = com.example.salescompany.singleToneClass.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_seller);

        registerSeller = (Button) findViewById(R.id.registerTicket);

        registerSeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executeRegister();
            }
        });
    }

    public void executeRegister() {

        idSeller = (EditText) findViewById(R.id.idSeller);
        name = (EditText) findViewById(R.id.name);
        lastName = (EditText) findViewById(R.id.lastName);
        address = (EditText) findViewById(R.id.address);
        telephone = (EditText) findViewById(R.id.telephone);
        email = (EditText) findViewById(R.id.email);
        userName = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);

        String sql = "http://"+singleToneClass.getIP()+"/SalesCompany/sales/service/seller";

        URL url = null;
        HttpURLConnection conn;

        try {

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            JSONObject paramsString = new JSONObject();
            paramsString.put("idSeller", idSeller.getText());
            paramsString.put("name", name.getText());
            paramsString.put("lastName", lastName.getText());
            paramsString.put("address", address.getText());
            paramsString.put("telephone", telephone.getText());
            paramsString.put("email", email.getText());
            paramsString.put("userName", userName.getText());
            paramsString.put("password", password.getText());
            paramsString.put("pendingValues", 0);

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
                Toast.makeText(getApplicationContext(), "User Registered", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Error with Register", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
