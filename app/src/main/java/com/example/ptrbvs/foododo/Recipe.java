package com.example.ptrbvs.foododo;

import java.util.ArrayList;

public class Recipe {

    private String name;
    private ArrayList<String> ingredients = new ArrayList();
    private ArrayList<String> tags = new ArrayList();
    private int persons;
    private int time;

    public Recipe(String name, ArrayList<String> ingredients, ArrayList<String> tags, int persons, int time) {
        this.name = name;
        this.ingredients = ingredients;
        this.tags = tags;
        this.persons = persons;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
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
}




