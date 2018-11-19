package com.example.ptrbvs.foododo;

import android.widget.ImageButton;

import java.util.ArrayList;

public class Singleton {
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;

    // data
    private User activeUser;
    private Group group;
    private ArrayList<Meal> meals;
    private ImageButton activeVote;
    private Meal winnerMeal;


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

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    public ImageButton getActiveVote() {
        return activeVote;
    }

    public void setActiveVote(ImageButton activeVote) {
        this.activeVote = activeVote;
    }

    public Meal getWinnerMeal() {
        return winnerMeal;
    }

    public void setWinnerMeal(Meal winnerMeal) {
        this.winnerMeal = winnerMeal;
    }
}
