package com.example.ptrbvs.foododo;
import java.util.ArrayList;
public class userData {

    public ArrayList<User> LoadUserData(){
        String name = "Tristan";
        String password = "drums";
        ArrayList<Tag> tags = new ArrayList();
        String profilepic = "@drawable/trainer";

        User user1 = new User(name, password, tags, profilepic);

        String name2 = "Pieter";
        String password2 = "macbook";
        ArrayList<Tag> tags2 = new ArrayList();
        String profilepic2 = "@drawable/charmander";

        User user2 = new User(name2, password2, tags2, profilepic2);

        String name3 = "Joy";
        String password3 = "sport";
        ArrayList<Tag> tags3 = new ArrayList();
        String profilepic3 = "@drawable/pokemon";

        User user3 = new User(name3, password3, tags3, profilepic3);

        String name4 = "Frans";
        String password4 = "skrt";
        ArrayList<Tag> tags4 = new ArrayList();
        String profilepic4 = "@drawable/schildpad";

        User user4 = new User(name4, password4, tags4, profilepic4);

        ArrayList<User> users = new ArrayList();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        return users;

    }
}