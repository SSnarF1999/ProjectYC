package com.example.ptrbvs.foododo;

import java.util.ArrayList;

public class User {

    private String name;
    private String password;
    private Boolean present;
    private ArrayList<Tag> tags;

    public User(String name, String password, ArrayList<Tag> tags) {
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


    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }
}

