package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final User loggedUser = (User)getIntent().getSerializableExtra("account");
        final ArrayList<User> friends = (ArrayList<User>)getIntent().getSerializableExtra("friends");
        final Button bAccount = (Button) findViewById(R.id.bAccount);
        final Button bFriends = (Button) findViewById(R.id.bFriends);
        final Button bGroups = (Button) findViewById(R.id.bGroups);
        final Button bRecipe = (Button) findViewById(R.id.bRecipe);
        final Button bSwitch = (Button) findViewById(R.id.bSwitch);


        bAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerIntent = new Intent(MenuActivity.this, Account.class);
                registerIntent.putExtra("account",loggedUser);
                MenuActivity.this.startActivity(registerIntent);
            }
        });

        bFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuActivity.this, FriendsActivitiy.class);
                registerIntent.putExtra("loggedUser",loggedUser);
                registerIntent.putExtra("friends",friends);
                MenuActivity.this.startActivity(registerIntent);
            }
        });

        bGroups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuActivity.this, GroupsActivity.class);
                MenuActivity.this.startActivity(registerIntent);
            }
        });

        bRecipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuActivity.this, RecipeActivity.class);
                MenuActivity.this.startActivity(registerIntent);
            }
        });

        bSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MenuActivity.this, LoginActivity.class);
                MenuActivity.this.startActivity(registerIntent);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
}
