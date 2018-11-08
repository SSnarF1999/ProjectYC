package com.example.ptrbvs.foododo;

import java.util.ArrayList;

public class Recipe {
<<<<<<< HEAD
    private String dish;
    private String cookingTime;
    private String Country;
    private String ingredients;
    private int HowManyPersons;

    public Recipe(String dish,String cookingTime,String Country, String ingredients, int HowManyPersons) {
        this.dish=dish;
        this.cookingTime=cookingTime;
        this.Country=Country;
        this.ingredients=ingredients;
        this.HowManyPersons=HowManyPersons;  }

    public static void Recipe(String[] args){
        Recipe recipe01=new Recipe("","","", "", 8);
        Recipe recipe02=new Recipe("","","", "", 7);
        Recipe recipe03=new Recipe("","","", "", 6);

        ArrayList<Recipe> Recipe = new ArrayList<>();
        Recipe.add(recipe01);
        Recipe.add(recipe02);
        Recipe.add(recipe03);
        
        
=======

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
>>>>>>> c268f70d80e00cad5a6a13ba9ab1fbfd4caa6309
    }
}



<<<<<<< HEAD
=======

>>>>>>> c268f70d80e00cad5a6a13ba9ab1fbfd4caa6309
