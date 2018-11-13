package com.example.ptrbvs.foododo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.Menu;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    userData data = new userData();
    User[] users = data.generateuserData();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         MenuInflater inflater = getMenuInflater();
         inflater.inflate(R.menu.menu, menu);
        return true;
     }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.account:
                Intent intent1 = new Intent(this, Account.class);
                this.startActivity(intent1);
                return true;
            case R.id.groups:
                Intent intent2 = new Intent(this, GroupsActivity.class);
                this.startActivity(intent2);
                return true;
            case R.id.Recipes:
                Intent intent4 = new Intent(this, RecipeActivity.class);
                this.startActivity(intent4);
                return true;
            case R.id.friends:
                Intent intent3 = new Intent(this, FriendsActivitiy.class);
                this.startActivity(intent3);
                return true;
             default:
        }
        return super.onOptionsItemSelected(item);
    }
}
