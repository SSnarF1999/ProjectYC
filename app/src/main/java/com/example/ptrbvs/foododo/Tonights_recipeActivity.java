package com.example.ptrbvs.foododo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tonights_recipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final User loggedUser = (User)getIntent().getSerializableExtra("account");
        setContentView(R.layout.activity_tonights_recipe);

    }
}
