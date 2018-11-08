package com.example.ptrbvs.foododo;

import java.util.ArrayList;

public class User {

    private String name;
    private String password;
    private ArrayList<String> tags = new ArrayList();

    public User(String name, String password, ArrayList<String> tags) {
        this.name = name;
        this.password = password;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}

