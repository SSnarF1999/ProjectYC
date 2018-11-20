package com.example.ptrbvs.foododo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.preference.PreferenceScreen;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Account extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        final TextView tname = (TextView) findViewById(R.id.editText);
        final ImageView account = (ImageView) findViewById(R.id.ivAccount);
        User activeUser = Singleton.getInstance().getActiveUser();
        tname.setText(activeUser.getName());
        int imageRescource = getResources().getIdentifier(activeUser.getProfilePic(), null, this.getPackageName());
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        account.setImageResource(imageRescource);

        final Button bPreferences = (Button) findViewById(R.id.bPreferences);
        final TextView tPreferences = (TextView) findViewById(R.id.tPreferences);

        String preferenceString = "";
        for (Tag tag : Singleton.getInstance().getActiveUser().getTags()) {
            preferenceString = preferenceString + tag.getName() + ", ";
        }
        tPreferences.setText(preferenceString);

        bPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Account.this, PreferencesActivity.class);
                Account.this.startActivity(homeIntent);
            }
        });
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
