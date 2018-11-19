package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;

public class FransActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frans);

        ImageView ivFrans = (ImageView) findViewById(R.id.ivFrans);
        int imageRescource = getResources().getIdentifier(Singleton.getInstance().getActiveUser().getProfilePic(), null, this.getPackageName());
        ivFrans.setImageResource(imageRescource);
    }

    @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         MenuInflater inflater = getMenuInflater();
         inflater.inflate(R.menu.menu, menu);
        return true;
     }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        final ArrayList<User> friends = (ArrayList<User>) getIntent().getSerializableExtra("friends");
        switch (item.getItemId()){
            case R.id.action_menu:

                Intent intent1 = new Intent(this, MenuActivity.class);

                intent1.putExtra("friends",friends);
                this.startActivity(intent1);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
