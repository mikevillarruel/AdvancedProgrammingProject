package com.example.salescompany;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    EditText userName, password;
    Button register, btnLogin, btn;
    String ip = "192.168.0.104:8080";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singleToneClass singleToneClass = com.example.salescompany.singleToneClass.getInstance();
        singleToneClass.setIP(ip);

        register = (Button) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executeLogin();
            }
        });

    }

    public void deleteSeller(){
        Intent i = new Intent(this, deleteSeller.class);
        startActivity(i);
    }

    public void register() {
        Intent i = new Intent(this, registerSeller.class);
        startActivity(i);
    }

    public void executeLogin() {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        userName = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);
        String sql = "http://"+ip+"/SalesCompany/sales/service/login";

        URL url = null;
        HttpURLConnection conn;

        try {

            JSONObject paramsString = new JSONObject();
            paramsString.put("userName", userName.getText());
            paramsString.put("password", password.getText());

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
                Intent i = new Intent(this, startMenu.class);
                //this.finish();
                startActivity(i);
            } else {
                Toast.makeText(getApplicationContext(), "User or Password Incorrect :(", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
