package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;

public class PieterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pieter);

        ImageView ivPiet = (ImageView) findViewById(R.id.ivPiet);
        int imageRescource = getResources().getIdentifier("@drawable/charmander", null, this.getPackageName());
        ivPiet.setImageResource(imageRescource);
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
            case R.id.action_menu:
                Intent intent1 = new Intent(this, MenuActivity.class);
                this.startActivity(intent1);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
