package com.example.ptrbvs.foododo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class Tonights_recipeActivity extends AppCompatActivity {

    MealData mealdata =  new MealData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tonights_recipe);

        mealdata.generateMeals();

        final ImageButton ibRecipe01 = (ImageButton) findViewById(R.id.ibRecipe01);
        final ImageButton ibRecipe02 = (ImageButton) findViewById(R.id.ibRecipe02);
        final ImageButton ibRecipe03 = (ImageButton) findViewById(R.id.ibRecipe03);
        final ImageButton ibRecipe04 = (ImageButton) findViewById(R.id.ibRecipe04);
    }
}
