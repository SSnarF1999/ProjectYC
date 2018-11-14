package com.example.ptrbvs.foododo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.Menu;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    userData userdata = new userData();
    User[] users = userdata.generateuserData();

    mealData mealdata = new mealData();
    Meal[] meals = mealdata.generateMeals();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivJoy = (ImageView) findViewById(R.id.ivJoy);
        int imageRescource = getResources().getIdentifier("@drawable/pokemon", null, this.getPackageName());
        ivJoy.setImageResource(imageRescource);
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
            case R.id.action_account:
                startActivity(new Intent(this, Account.class)) ;
                return true;
            case R.id.action_menu:
                Intent intent1 = new Intent(this, MenuActivity.class);
                this.startActivity(intent1);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
