package com.example.ptrbvs.foododo;

import java.util.Scanner;

public class MealFactory {

    public Meal generateMeal() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Ingredients (like this: ing1, ing2, ing3 ... ): ");
        String in = sc.nextLine();
        String[] ingredients = in.split(",");

        System.out.println("Tags (like this: tag1, tag2, tag3 ... ): ");
        String in1 = sc.nextLine();
        String[] tags = in.split(",");

        System.out.println("Persons: ");
        int persons = Integer.parseInt(sc.nextLine());

        System.out.println("Time: ");
        int time = Integer.parseInt(sc.nextLine());

        return new Meal(name, ingredients, tags, persons, time);
    }
}
