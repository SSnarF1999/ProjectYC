package com.example.ptrbvs.foododo;

import android.support.v7.app.AppCompatActivity;

public class ActiveUserCommunicator extends AppCompatActivity {

    protected User[] createUsersSample() {
        userData data = new userData();
        return data.generateUserData();
    }
    protected String getImgLocation (String username) throws Exception {
        String locname = "";
        User[] users = createUsersSample();
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
