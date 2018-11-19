package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;


public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button bPieter = (Button) findViewById(R.id.bPieter);
        final Button bFrans = (Button) findViewById(R.id.bFrans);
        final Button bTristan = (Button) findViewById(R.id.bTristan);
        final Button bJoy = (Button) findViewById(R.id.bJoy);
        ImageButton ibPieter= (ImageButton) findViewById(R.id.ibPieter);
        ImageButton ibFrans= (ImageButton) findViewById(R.id.ibFrans);
        ImageButton ibTristan= (ImageButton) findViewById(R.id.ibTristan);
        ImageButton ibJoy= (ImageButton) findViewById(R.id.ibJoy);

        userData data = new userData();
        final ArrayList<User> users = data.LoadUserData();

        Group group = new Group();
        group.setUsers(users);
        Singleton.getInstance().setGroup(group);
        final User tristan = users.get(0);
        final User pieter = users.get(1);
        final User joy = users.get(2);
        final User frans = users.get(3);

        MealData md = new MealData();
        Singleton.getInstance().setMeals(md.loadMeals());



        bPieter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, PieterActivity.class);

                Singleton.getInstance().setActiveUser(pieter);
                LoginActivity.this.startActivity(loginIntent);

            }
        });

        bFrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, FransActivity.class);

                Singleton.getInstance().setActiveUser(frans);
                LoginActivity.this.startActivity(loginIntent);

            }
        });

        bTristan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, TristanActivity.class);

                Singleton.getInstance().setActiveUser(tristan);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        bJoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);

                Singleton.getInstance().setActiveUser(joy);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibPieter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, PieterActivity.class);

                Singleton.getInstance().setActiveUser(pieter);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibFrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, FransActivity.class);

                Singleton.getInstance().setActiveUser(frans);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibTristan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, TristanActivity.class);

                Singleton.getInstance().setActiveUser(tristan);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibJoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);

                Singleton.getInstance().setActiveUser(joy);
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



