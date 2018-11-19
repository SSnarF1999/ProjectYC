package com.example.ptrbvs.foododo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

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
        final Button bCountVotes = (Button) findViewById(R.id.bCountVotes);

        ibRecipe01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton s = Singleton.getInstance();
                final VoteChecker votechecker = new VoteChecker(s.getGroup());

                if (s.getActiveUser().getPresent() && s.getActiveVote() != ibRecipe01 && !s.getActiveUser().isVoted()) {
                    ArrayList<Meal> meal = s.getMeals();
                    votechecker.vote(meal, meal.get(0), true);
                    tCantvotemsg.setText("");
                }
                else {
                    if (!s.getActiveUser().getPresent()) {
                        tCantvotemsg.setText("You can't vote if you won't attend the meal.");
                    }
                }
                s.getActiveUser().setVoted(true);
                tScore01.setText(Integer.toString(meal.get(0).getScore()));
            }

        });

        ibRecipe02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton s = Singleton.getInstance();
                final VoteChecker votechecker = new VoteChecker(s.getGroup());

                if (s.getActiveUser().getPresent() && s.getActiveVote() != ibRecipe02 && !s.getActiveUser().isVoted()) {
                    ArrayList<Meal> meal = s.getMeals();
                    votechecker.vote(meal, meal.get(1),true);
                    tCantvotemsg.setText("");
                }
                else {
                    if (!s.getActiveUser().getPresent()) {
                        tCantvotemsg.setText("You can't vote if you won't attend the meal.");
                    }
                }
                s.getActiveUser().setVoted(true);
                tScore02.setText(Integer.toString(meal.get(1).getScore()));
            }

        });

        ibRecipe03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton s = Singleton.getInstance();
                final VoteChecker votechecker = new VoteChecker(s.getGroup());

                if (s.getActiveUser().getPresent() && s.getActiveVote() != ibRecipe03 && !s.getActiveUser().isVoted()) {
                    ArrayList<Meal> meal = s.getMeals();
                    votechecker.vote(meal, meal.get(2), true);
                    tCantvotemsg.setText("");
                }
                else {
                    if (!s.getActiveUser().getPresent()) {
                        tCantvotemsg.setText("You can't vote if you won't attend the meal.");
                    }
                }
                s.getActiveUser().setVoted(true);
                tScore03.setText(Integer.toString(meal.get(2).getScore()));
            }

        });

        ibRecipe04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton s = Singleton.getInstance();
                final VoteChecker votechecker = new VoteChecker(s.getGroup());

                if (s.getActiveUser().getPresent() && s.getActiveVote() != ibRecipe04 && !s.getActiveUser().isVoted()) {
                    ArrayList<Meal> meal = s.getMeals();
                    votechecker.vote(meal, meal.get(3), true);
                    tCantvotemsg.setText("");
                }
                else {
                    if (!s.getActiveUser().getPresent()) {
                        tCantvotemsg.setText("You can't vote if you won't attend the meal.");
                    }
                }
                s.getActiveUser().setVoted(true);
                tScore04.setText(Integer.toString(meal.get(3).getScore()));
            }

        });


        bCountVotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VoteChecker voteChecker = new VoteChecker(Singleton.getInstance().getGroup());
                Meal bestMeal = voteChecker.getBest();
                Singleton.getInstance().setWinnerMeal(bestMeal);
            }
        });
    }
}
