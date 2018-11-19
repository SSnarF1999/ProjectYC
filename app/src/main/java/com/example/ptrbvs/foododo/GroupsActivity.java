package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class GroupsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        final Button bGroup01 = (Button) findViewById(R.id.bGroup01);
        final User loggedUser = (User)getIntent().getSerializableExtra("account");

        bGroup01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(GroupsActivity.this, GroupChosenActivitiy.class);
                registerIntent.putExtra("account",loggedUser);
                GroupsActivity.this.startActivity(registerIntent);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.groups_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                startActivity(new Intent(this, GroupAddActivity.class)) ;
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}
