package com.example.ptrbvs.foododo;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.view.Menu;
import android.widget.TextView;

public class UserActivity extends ActiveUserCommunicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        ImageView ivUser = (ImageView) findViewById(R.id.ivUser);
        TextView tvUsername = (TextView) findViewById(R.id.tvUserName);

        try {
            int imageRescource = getResources().getIdentifier(getImgLocation(Singleton.getInstance().getActiveUser().getName()), "drawable", UserActivity.this.getPackageName());
            ivUser.setImageResource(imageRescource);
            tvUsername.setText(Singleton.getInstance().getActiveUser().getName());
        }
        catch (Exception e) {
            System.out.print(e.getMessage());
            tvUsername.setText("could not find name");
        }
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
