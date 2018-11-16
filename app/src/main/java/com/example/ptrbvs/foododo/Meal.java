package com.example.ptrbvs.foododo;

import java.util.ArrayList;

public class Meal {

    private String name;
    private String[] ingredients;
    private String[] tags;
    private int persons;
    private int time;
    private String instructions;
    private static ArrayList<Meal> Meals = new ArrayList();

    public Meal() {}

    public Meal(String name, String[] ingredients, String[] tags, int persons, int time, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.tags = tags;
        this.persons = persons;
        this.time = time;
        this.instructions = instructions;
    }

    private String listPrinter(String[] in) {
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

    public void recalculate(int personsNum) {
        float factor = personsNum / this.persons;

        for (String ingredient : this.ingredients) {
            for (char cha : ingredient.toCharArray()) {
                if (Character.isDigit(cha)) {
                    float old = Character.getNumericValue(cha);
                    char nw = (char)(old * factor);
                    cha = nw;
                }
            }
        }
    }

    //Setters of arrays throw Exception for SQL safety (max size)

    public String getName() {
        return name;
    }

    public void setName (String name) throws Exception {
        if (name.length() >= 255) {
            throw new Exception("input string too long");
        }
        else {
            this.name = name;
        }
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) throws RuntimeException {
        if (ingredients.length >= 255) {
            throw new RuntimeException("input string too long");
        } else {
            this.ingredients = ingredients;
        }
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) throws RuntimeException {
        if (tags.length >= 255) {
            throw new RuntimeException("input string too long");
        }
        else {
            this.tags = tags;
        }
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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}