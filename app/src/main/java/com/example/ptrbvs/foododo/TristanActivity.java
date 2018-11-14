package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

public class TristanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tristan);

        ImageView ivTris = (ImageView) findViewById(R.id.ivTris);
        int imageRescource = getResources().getIdentifier("@drawable/trainer", null, this.getPackageName());
        ivTris.setImageResource(imageRescource);
    }

    @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         MenuInflater inflater = getMenuInflater();
         inflater.inflate(R.menu.menu, menu);
        return true;
     }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        User tristan = (User)getIntent().getSerializableExtra("tristan");
        switch (item.getItemId()){
            case R.id.action_account:
                startActivity(new Intent(this, Account.class)) ;
                return true;
            case R.id.action_menu:
                Intent intent1 = new Intent(this, MenuActivity.class);
                intent1.putExtra("tristan", tristan );
                this.startActivity(intent1);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
