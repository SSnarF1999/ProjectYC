package com.example.ptrbvs.foododo;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public abstract class ActiveUserCommunicator extends AppCompatActivity {

    protected ArrayList<User> createUsersSample() {
        UserData data = new UserData();
        return data.LoadUserData();
    }
    protected String getImgLocation (String username) throws Exception {
        String locname = "";
        ArrayList<User> users = createUsersSample();
        for (User user : users) {
            if (user.getName().equals(username)) {
                locname = user.getProfilePic();
            }
        }
        if (locname.equals("")) {
            throw new Exception("Couldn't find user.");
        }
        String location = "@drawable/" + locname;
        return location;

    }
}
