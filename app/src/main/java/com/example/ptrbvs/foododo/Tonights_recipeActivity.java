package com.example.ptrbvs.foododo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class Tonights_recipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tonights_recipe);

        final ArrayList<Meal> meal = Singleton.getInstance().getMeals();
        int imageRescource1 = getResources().getIdentifier("@drawable/pasta02", null, this.getPackageName());
        int imageRescource2 = getResources().getIdentifier("@drawable/zuur", null, this.getPackageName());
        int imageRescource3 = getResources().getIdentifier("@drawable/pizza3", null, this.getPackageName());
        int imageRescource4 = getResources().getIdentifier("@drawable/broc", null, this.getPackageName());
        final ImageButton ibRecipe01 = (ImageButton) findViewById(R.id.ibRecipe01);
        final ImageButton ibRecipe02 = (ImageButton) findViewById(R.id.ibRecipe02);
        final ImageButton ibRecipe03 = (ImageButton) findViewById(R.id.ibRecipe03);
        final ImageButton ibRecipe04 = (ImageButton) findViewById(R.id.ibRecipe04);
        ibRecipe01.setImageResource(imageRescource1);
        ibRecipe02.setImageResource(imageRescource2);
        ibRecipe03.setImageResource(imageRescource3);
        ibRecipe04.setImageResource(imageRescource4);




        final TextView tScore01 = (TextView) findViewById(R.id.tScore01);
        final TextView tScore02 = (TextView) findViewById(R.id.tScore02);
        final TextView tScore03 = (TextView) findViewById(R.id.tScore03);
        final TextView tScore04 = (TextView) findViewById(R.id.tScore04);

        tScore01.setText(Integer.toString(meal.get(0).getScore()));
        tScore02.setText(Integer.toString(meal.get(1).getScore()));
        tScore03.setText(Integer.toString(meal.get(2).getScore()));
        tScore04.setText(Integer.toString(meal.get(3).getScore()));

        final Switch sAbsent = (Switch) findViewById(R.id.sAbsent);
        final TextView tCantvotemsg = (TextView) findViewById(R.id.tCantvotemsg);


        ibRecipe01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton s = Singleton.getInstance();
                final VoteChecker votechecker = new VoteChecker(s.getGroup());

                if (s.getActiveUser().getPresent() && s.getActiveVote() != ibRecipe01) {
                    ArrayList<Meal> meal = s.getMeals();
                    votechecker.vote(meal, meal.get(0), true);
                    tScore01.setText(Integer.toString(meal.get(0).getScore()));
                    tCantvotemsg.setText("");
                    s.setActiveVote(ibRecipe01);
                }
                else {
                    if (!s.getActiveUser().getPresent()) {
                        tCantvotemsg.setText("You can't vote if you won't attend the meal.");
                    }
                    else {
                        votechecker.vote(meal, meal.get(0),true);
                    }
                }
            }
        });

        ibRecipe02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton s = Singleton.getInstance();

                if (s.getActiveUser().getPresent() && s.getActiveVote() != ibRecipe02) {
                    final VoteChecker votechecker = new VoteChecker(Singleton.getInstance().getGroup());
                    ArrayList<Meal> meal = s.getMeals();
                    votechecker.vote(meal, meal.get(1),true);
                    tScore02.setText(Integer.toString(meal.get(1).getScore()));
                    tCantvotemsg.setText("");
                    s.setActiveVote(ibRecipe02);
                }
                else {
                    tCantvotemsg.setText("You can't vote if you won't attend the meal.");
                }
            }
        });

        ibRecipe03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton s = Singleton.getInstance();

                if (s.getActiveUser().getPresent() && s.getActiveVote() != ibRecipe03) {
                    final VoteChecker votechecker = new VoteChecker(s.getGroup());
                    ArrayList<Meal> meal = Singleton.getInstance().getMeals();
                    votechecker.vote(meal, meal.get(2),true);
                    tScore03.setText(Integer.toString(meal.get(2).getScore()));
                    tCantvotemsg.setText("");
                    s.setActiveVote(ibRecipe03);
                }
                else {
                    tCantvotemsg.setText("You can't vote if you won't attend the meal.");
                }
            }
        });

        ibRecipe04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton s = Singleton.getInstance();

                if (s.getActiveUser().getPresent() && s.getActiveVote() != ibRecipe04) {
                    final VoteChecker votechecker = new VoteChecker(s.getGroup());
                    ArrayList<Meal> meal = s.getMeals();
                    votechecker.vote(meal, meal.get(3),true);
                    tScore04.setText(Integer.toString(meal.get(3).getScore()));
                    tCantvotemsg.setText("");
                    s.setActiveVote(ibRecipe04);
                }
                else {
                    tCantvotemsg.setText("You can't vote if you won't attend the meal.");
                }
            }
        });

        sAbsent.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                User activeUser = Singleton.getInstance().getActiveUser();
                if (!isChecked) {
                    activeUser.setPresent(false);
                }
                else {
                    activeUser.setPresent(true);
                }
            }
        });

    }
}
