package com.example.ptrbvs.foododo;

import java.util.Scanner;

public class MealFactory {


    public Meal generateMeal() throws Exception {

        Scanner sc = new Scanner(System.in);
        Meal ml = new Meal();
        boolean succes = true;

        System.out.println("Name: ");
        try  {
            ml.setName(sc.nextLine());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            succes = false;
        }

        System.out.println("Ingredients (like this: ing1, ing2, ing3 ... ): ");
        String in = sc.nextLine();
        String[] ingredients = in.split(",");

        try  {
            ml.setIngredients(ingredients);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            succes = false;
        }

        System.out.println("Tags (like this: tag1, tag2, tag3 ... ): ");
        String in1 = sc.nextLine();
        String[] tags = in1.split(",");

        try  {
            ml.setTags(tags);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            succes = false;
        }

        System.out.println("Persons: ");
        int persons = Integer.parseInt(sc.nextLine());
        ml.setPersons(persons);

        System.out.println("Time: ");
        int time = Integer.parseInt(sc.nextLine());
        ml.setTime(time);

        System.out.println("Instructions (just copy and paste): ");
        String instructions = sc.nextLine();
        ml.setInstructions(instructions);

        if (succes) {
            return ml;
        }
        else {
            return null;
        }
    }
}
