package com.example.ptrbvs.foododo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class Tonights_recipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tonights_recipe);



        final ImageButton ibRecipe01 = (ImageButton) findViewById(R.id.ibRecipe01);
        final ImageButton ibRecipe02 = (ImageButton) findViewById(R.id.ibRecipe02);
        final ImageButton ibRecipe03 = (ImageButton) findViewById(R.id.ibRecipe03);
        final ImageButton ibRecipe04 = (ImageButton) findViewById(R.id.ibRecipe04);

        final Button bAbsent = (Button) findViewById(R.id.bAbsent);

        ibRecipe01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VoteChecker votechecker = new VoteChecker();
                MealData mealdata = new MealData();
                ArrayList<Meal> meal = mealdata.loadMeals();
                votechecker.vote(meal.get(0));
            }
        });

        ibRecipe02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VoteChecker votechecker = new VoteChecker();
                MealData mealdata = new MealData();
                ArrayList<Meal> meal = mealdata.loadMeals();
                votechecker.vote(meal.get(1));
            }
        });

        ibRecipe03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VoteChecker votechecker = new VoteChecker();
                MealData mealdata = new MealData();
                ArrayList<Meal> meal = mealdata.loadMeals();
                votechecker.vote(meal.get(2));
            }
        });

        ibRecipe04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VoteChecker votechecker = new VoteChecker();
                MealData mealdata = new MealData();
                ArrayList<Meal> meal = mealdata.loadMeals();
                votechecker.vote(meal.get(3));
            }
        });

        bAbsent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final VoteChecker votechecker = new VoteChecker();
                MealData mealdata = new MealData();
                ArrayList<Meal> meal = mealdata.loadMeals();
                votechecker.vote(meal.get(4));
            }
        });

    }
}
