package com.example.ptrbvs.foododo;
import java.util.Comparator;

public class MealComparator implements Comparator<Meal> {

    public int compare(Meal d, Meal d1) {
        return d.getScore() - d1.getScore();
    }
}
