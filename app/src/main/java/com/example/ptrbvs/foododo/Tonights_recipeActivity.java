package com.example.ptrbvs.foododo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tonights_recipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        MealData mealdata = new MealData();
        final VoteChecker votechecker = new VoteChecker();
        Group activeGroup = new Group();
        UserData userdata = new UserData();

        //Load userdata
        activeGroup.setUsers(userdata.LoadUserData());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tonights_recipe);

        mealdata.generateMeals();

        final ImageButton ibRecipe01 = (ImageButton) findViewById(R.id.ibRecipe01);
        final ImageButton ibRecipe02 = (ImageButton) findViewById(R.id.ibRecipe02);
        final ImageButton ibRecipe03 = (ImageButton) findViewById(R.id.ibRecipe03);
        final ImageButton ibRecipe04 = (ImageButton) findViewById(R.id.ibRecipe04);

        final Button bAbsent = (Button) findViewById(R.id.bAbsent);

        ibRecipe01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //votechecker.vote(geef verbonden recept mee);
            }
        });

        ibRecipe02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //votechecker.vote(geef verbonden recept mee);
            }
        });

        ibRecipe03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //votechecker.vote() geef verbonden recept mee);
            }
        });

        ibRecipe04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //votechecker.vote(geef verbonden recept mee);
            }
        });

        bAbsent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //votechecker.vote(geef verbonden recept mee);
            }
        });

    }
}
