package com.example.ptrbvs.foododo;

import java.util.ArrayList;

public class User {

    private String name;
    private String mail;
    private String password;
    private int age;
    private ArrayList<String> tags = new ArrayList();

    public User(String name, String mail, String password, int age, ArrayList<String> tags) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.age = age;
        this.tags = tags;
    }

    
}

