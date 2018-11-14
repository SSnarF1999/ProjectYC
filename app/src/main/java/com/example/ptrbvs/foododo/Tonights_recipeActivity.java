package com.example.ptrbvs.foododo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class Tonights_recipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tonights_recipe);

        final ImageButton bOption1 = (ImageButton) findViewById(R.id.bOption1);
        final ImageButton bOption2 = (ImageButton) findViewById(R.id.bOption2);
        final ImageButton bOption3 = (ImageButton) findViewById(R.id.bOption3);
        final ImageButton bOption4 = (ImageButton) findViewById(R.id.bOption4);
    }
}
