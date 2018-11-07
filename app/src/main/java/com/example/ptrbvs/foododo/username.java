package com.example.ptrbvs.foododo;

public class username {
    private String username;
    private String password;
    private String age;
    private String preferences;

    public username(String username, String password, String age, String preferences) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.preferences=preferences;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
