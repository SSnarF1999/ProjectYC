package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.service.autofill.UserData;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        ImageButton ibPieter = (ImageButton) findViewById(R.id.ibPieter);
        ImageButton ibFrans = (ImageButton) findViewById(R.id.ibFrans);
        ImageButton ibTristan = (ImageButton) findViewById(R.id.ibTristan);
        ImageButton ibJoy = (ImageButton) findViewById(R.id.ibJoy);

        bPieter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActiveUser.setName("pieter");
                Intent loginIntent = new Intent(LoginActivity.this, UserActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        bFrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActiveUser.setName("frans");
                Intent loginIntent = new Intent(LoginActivity.this, UserActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        bTristan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActiveUser.setName("tristan");
                Intent loginIntent = new Intent(LoginActivity.this, UserActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        bJoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActiveUser.setName("joy");
                Intent loginIntent = new Intent(LoginActivity.this, UserActivity.class);
                LoginActivity.this.startActivity(loginIntent);

            }
        });

        ibPieter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActiveUser.setName("pieter");
                Intent loginIntent = new Intent(LoginActivity.this, UserActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibFrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActiveUser.setName("frans");
                Intent loginIntent = new Intent(LoginActivity.this, UserActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibTristan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActiveUser.setName("tristan");
                Intent loginIntent = new Intent(LoginActivity.this, UserActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibJoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActiveUser.setName("joy");
                Intent loginIntent = new Intent(LoginActivity.this, UserActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });
    }
}