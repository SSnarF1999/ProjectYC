package com.example.ptrbvs.foododo;

import java.util.ArrayList;

public class userData {

    public User[] generateuserData(){
        String name = "tristan";
        String password = "drums";
        ArrayList<String> tags = new ArrayList();
        User user1 = new User(name,password,tags);

        String name2 = "pieter";
        String password2 = "macbook";
        ArrayList<String> tags2 = new ArrayList();
        User user2 = new User(name2,password2,tags2);

        String name3 = "joy";
        String password3 = "sport";
        ArrayList<String> tags3 = new ArrayList();
        User user3 = new User(name3,password3,tags3);

        String name4 = "frans";
        String password4 = "skrt";
        ArrayList<String> tags4 = new ArrayList();
        User user4 = new User(name4,password4,tags4);
        User[] users = new User[4];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;
        return users;

    }
}
