package com.example.salescompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startMenu extends AppCompatActivity {

    Button btnLogOut, buy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);

        btnLogOut = (Button) findViewById(R.id.btnLogOut);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
            }
        });

        btnLogOut = (Button) findViewById(R.id.buy);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy();
            }
        });
    }

    public void logout() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void buy() {
        Intent i = new Intent(this, salesTickets.class);
        startActivity(i);
    }


}
