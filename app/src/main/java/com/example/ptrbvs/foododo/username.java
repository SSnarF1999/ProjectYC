package com.example.ptrbvs.foododo;

public class username {
    private String usernames;
    private String password;
    private String age;
    private String email;
    private String phonenumber;
    private String preferences;

    public username(String usernames, String password, String age, String email, String phonenumber, String preferences) {
        this.usernames = usernames;
        this.password = password;
        this.age = age;
        this.email=email;
        this.phonenumber=phonenumber;
        this.preferences=preferences;
    }

    public String getUsernames() {
        return usernames;
    }

    public void setUsernames(String usernames) {
        this.usernames = usernames;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
}
