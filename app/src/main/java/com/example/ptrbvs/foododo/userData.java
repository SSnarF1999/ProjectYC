package com.example.ptrbvs.foododo;
import java.util.ArrayList;
public class userData {

    public userData() {}

    public ArrayList<User> LoadUserData(){
        String name = "tristan";
        String password = "drums";
        ArrayList<Tag> tags = new ArrayList();
        String profilepic = "trainer";

        User user1 = new User(name, password, tags, profilepic);

        String name2 = "pieter";
        String password2 = "macbook";
        ArrayList<Tag> tags2 = new ArrayList();
        String profilepic2 = "schildpad";

        User user2 = new User(name2, password2, tags2, profilepic2);

        String name3 = "joy";
        String password3 = "sport";
        ArrayList<Tag> tags3 = new ArrayList();
        String profilepic3 = "charmander";

        User user3 = new User(name3, password3, tags3, profilepic3);

        String name4 = "frans";
        String password4 = "skrt";
        ArrayList<Tag> tags4 = new ArrayList();
        String profilepic4 = "pokemon";

        User user4 = new User(name4, password4, tags4, profilepic4);

        ArrayList<User> users = new ArrayList();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        return users;

    }
}