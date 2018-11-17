package com.example.ptrbvs.foododo;

public class ActiveUser {

    //Active User is a Singleton: a class where there can only be one instance of.

    private static ActiveUser activeUser = new ActiveUser();
    private static String name;

    private ActiveUser() {
    }

    public static ActiveUser getInstance() {
        return activeUser;
    }

    public static ActiveUser getActiveUser() {
        return activeUser;
    }

    public static void setActiveUser(ActiveUser activeUser) {
        ActiveUser.activeUser = activeUser;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ActiveUser.name = name;
    }

}
