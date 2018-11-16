package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GroupChosenActivitiy extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_chosen);

        final Button bChoose = (Button) findViewById(R.id.bChoose);
        final ImageButton ibDiner = (ImageButton) findViewById(R.id.ibDiner);
        final Button bUsers = (Button) findViewById(R.id.bUsers);

        bChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(GroupChosenActivitiy.this, Tonights_recipeActivity.class);
                GroupChosenActivitiy.this.startActivity(homeIntent);
            }
        });

        ibDiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(GroupChosenActivitiy.this, RecipeActivity.class);
                GroupChosenActivitiy.this.startActivity(homeIntent);
            }
        });

        bUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(GroupChosenActivitiy.this, Group_usersActivity.class);
                GroupChosenActivitiy.this.startActivity(homeIntent);
            }
        });
    }
}
