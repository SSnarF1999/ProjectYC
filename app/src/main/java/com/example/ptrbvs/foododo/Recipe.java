package com.example.ptrbvs.foododo;

import java.util.ArrayList;

public class Recipe {
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

        ArrayList<Recipe> new Recipe = new ArrayList<>();
        Recipe.add(recipe01);
        Recipe.add(recipe02);
        Recipe.add(recipe03);
        
        
    }
}



