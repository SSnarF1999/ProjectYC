package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bPieter = (Button) findViewById(R.id.bPieter);
        final Button bFrans = (Button) findViewById(R.id.bFrans);
        final Button bTristan = (Button) findViewById(R.id.bTristan);
        final Button bJoy = (Button) findViewById(R.id.bJoy);
        ImageButton ibPieter= (ImageButton) findViewById(R.id.ibPieter);
        ImageButton ibFrans= (ImageButton) findViewById(R.id.ibFrans);
        ImageButton ibTristan= (ImageButton) findViewById(R.id.ibTristan);
        ImageButton ibJoy= (ImageButton) findViewById(R.id.ibJoy);
        userData data = new userData();
        User[] users = data.generateuserData();
        final User tristan = users[0];
        final User pieter = users[1];
        final User joy = users[2];
        final User frans = users[3];





        bPieter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, PieterActivity.class);
                loginIntent.putExtra("pieter", pieter);
                LoginActivity.this.startActivity(loginIntent);

            }
        });

        bFrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, FransActivity.class);
                loginIntent.putExtra("frans", frans);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        bTristan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, TristanActivity.class);
                loginIntent.putExtra("tristan", tristan);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        bJoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                loginIntent.putExtra("joy", joy);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibPieter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, PieterActivity.class);
                loginIntent.putExtra("pieter", pieter);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibFrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, FransActivity.class);
                loginIntent.putExtra("frans", frans);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibTristan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, TristanActivity.class);
                loginIntent.putExtra("tristan", tristan);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibJoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                loginIntent.putExtra("joy", joy);
                LoginActivity.this.startActivity(loginIntent);
            }
        });


        int imageRescource = getResources().getIdentifier("@drawable/charmander", null, this.getPackageName());
        ibPieter.setImageResource(imageRescource);

        int imageRescource1 = getResources().getIdentifier("@drawable/schildpad", null, this.getPackageName());
        ibFrans.setImageResource(imageRescource1);

        int imageRescource2 = getResources().getIdentifier("@drawable/trainer", null, this.getPackageName());
        ibTristan.setImageResource(imageRescource2);

        int imageRescource3 = getResources().getIdentifier("@drawable/pokemon", null, this.getPackageName());
        ibJoy.setImageResource(imageRescource3);
    }


    }



