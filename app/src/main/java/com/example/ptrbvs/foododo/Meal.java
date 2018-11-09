package com.example.ptrbvs.foododo;

import java.util.ArrayList;

public class Meal {

    private String name;
    private String[] ingredients;
    private String[] tags;
    private int persons;
    private int time;
    private static ArrayList<Meal> Meals = new ArrayList();

    public Meal(String name, String[] ingredients, String[] tags, int persons, int time) {
        this.name = name;
        this.ingredients = ingredients;
        this.tags = tags;
        this.persons = persons;
        this.time = time;
        Meals.add(this);
    }

    private String listPrinter( String[] in) {
        String out = "";
        for (String str : in) {
            out = out + ", " + str;
        }
        return out;
    }

    public String toString() {
        return
                        this.name           + ":"                               +
                        " Ingredients: "    + listPrinter(this.ingredients)     +
                        " Tags: "           + listPrinter(this.tags)            +
                        " Persons: "        + Integer.toString(this.persons)    +
                        " Time: "           + this.time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public static ArrayList<Meal> getMeals() {
        return Meals;
    }

    public static void setMeals(ArrayList<Meal> meals) {
        Meals = meals;
    }

}




