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
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class deleteSeller extends AppCompatActivity {

    Button delete;
    singleToneClass singleToneClass = com.example.salescompany.singleToneClass.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_seller);

        delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete();
            }
        });
    }

    public void delete(){

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        EditText id;
        id = (EditText) findViewById(R.id.id);

        String sql = "http://"+singleToneClass.getIP()+":8080/SalesCompany/sales/service/seller/"+id.getText();
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
            } else {
                Toast.makeText(getApplicationContext(), "Undeleted User", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
