package com.example.ptrbvs.foododo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bPieter = (Button) findViewById(R.id.bPieter);
        final Button bFrans = (Button) findViewById(R.id.bFrans);
        final Button bTristan = (Button) findViewById(R.id.bTristan);
        final Button bJoy = (Button) findViewById(R.id.bJoy);
        ImageButton ibPieter= (ImageButton) findViewById(R.id.ibPieter);
        ImageButton ibFrans= (ImageButton) findViewById(R.id.ibFrans);
        ImageButton ibTristan= (ImageButton) findViewById(R.id.ibTristan);
        ImageButton ibJoy= (ImageButton) findViewById(R.id.ibJoy);

        bPieter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        bFrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        bTristan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        bJoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibPieter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibFrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibTristan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });

        ibJoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                LoginActivity.this.startActivity(loginIntent);
            }
        });


        int imageRescource = getResources().getIdentifier("@drawable/charmander", null, this.getPackageName());
        ibPieter.setImageResource(imageRescource);

        int imageRescource1 = getResources().getIdentifier("@drawable/schildpad", null, this.getPackageName());
        ibFrans.setImageResource(imageRescource1);

        int imageRescource2 = getResources().getIdentifier("@drawable/images", null, this.getPackageName());
        ibTristan.setImageResource(imageRescource2);

        int imageRescource3 = getResources().getIdentifier("@drawable/pokemon", null, this.getPackageName());
        ibJoy.setImageResource(imageRescource3);
    }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
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



