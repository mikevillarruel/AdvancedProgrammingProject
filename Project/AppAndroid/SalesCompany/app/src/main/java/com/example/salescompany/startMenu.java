package com.example.salescompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startMenu extends AppCompatActivity {

    Button btnLogOut, buy, myProfile, sale;

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

        buy = (Button) findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy();
            }
        });

        myProfile = (Button) findViewById(R.id.myProfile);
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profile();
            }
        });

        sale = (Button) findViewById(R.id.sale);
        sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sale();
            }
        });
    }

    public void sale(){
        Intent i = new Intent(this,insertTickets.class);
        startActivity(i);
    }

    public void profile() {
        Intent i = new Intent(this, profile.class);
        startActivity(i);
    }

    public void logout() {
        singleToneClass.getInstance().setIdSeller(0);
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void buy() {
        Intent i = new Intent(this, salesTickets.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.finishAffinity();
    }

}
