package com.example.ptrbvs.foododo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Account extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        final Button bPreferences = (Button) findViewById(R.id.bPreferences);


        bPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Account.this, PreferencesActivity.class);
                Account.this.startActivity(homeIntent);
            }
        });
    }
}
