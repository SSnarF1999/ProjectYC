package com.example.ptrbvs.foododo;

public class Singleton {
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;

    // data
    private User activeUser;
    private Group group;


    // private constructor restricted to this class itself
    private Singleton()
    {
    }

    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }

    public User getActiveUser() {
        return this.activeUser;
    }
    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public Group getGroup() {
        return this.group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }



}
