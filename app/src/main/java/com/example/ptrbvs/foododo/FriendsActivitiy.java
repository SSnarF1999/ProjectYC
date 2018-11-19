package com.example.ptrbvs.foododo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;

public class FriendsActivitiy extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        final Button bfriend0 = (Button) findViewById(R.id.bFriend0);
        final Button bfriend1 = (Button) findViewById(R.id.bFriend1);
        final Button bfriend2 = (Button) findViewById(R.id.bFriend2);
        final Group friends = Singleton.getInstance().getGroup();
        ArrayList<User> vrienden = new ArrayList<>();
        if (friends.getUsers().get(0).getName().equals(Singleton.getInstance().getActiveUser().getName())) {
            vrienden.add(friends.getUsers().get(1));
            vrienden.add(friends.getUsers().get(2));
            vrienden.add(friends.getUsers().get(3));
        }
        else if (friends.getUsers().get(1).getName().equals(Singleton.getInstance().getActiveUser().getName())) {
            vrienden.add(friends.getUsers().get(0));
            vrienden.add(friends.getUsers().get(2));
            vrienden.add(friends.getUsers().get(3));
        }
        else if (friends.getUsers().get(2).getName().equals(Singleton.getInstance().getActiveUser().getName())) {
            vrienden.add(friends.getUsers().get(0));
            vrienden.add(friends.getUsers().get(1));
            vrienden.add(friends.getUsers().get(3));
        }
        else if (friends.getUsers().get(3).getName().equals(Singleton.getInstance().getActiveUser().getName())) {
            vrienden.add(friends.getUsers().get(0));
            vrienden.add(friends.getUsers().get(1));
            vrienden.add(friends.getUsers().get(2));}


        for(int i=0; i<= 3; i++) {
            switch (i) {
                case 0:  bfriend0.setText(vrienden.get(0).getName());
                    break;
                case 1:  bfriend1.setText(vrienden.get(1).getName());
                    break;
                case 2:  bfriend2.setText(vrienden.get(2).getName());
                    break;
            }
        }





        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.friends_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                startActivity(new Intent(this, SearchFriendsActivity.class)) ;
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
