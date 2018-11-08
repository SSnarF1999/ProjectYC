package com.example.ptrbvs.foododo;

import java.util.ArrayList;

public class group {

    public static void groups(String[] args) {
        username user01 = new username("hoi", "jekhkh", "18", "vega");
        username user02 = new username("hoi01","89329", "17", "vegan");
        username user03 = new username("hoi02", "kjfkjfs", "22", "nederlands");

        ArrayList<username> username = new ArrayList<>();
        username.add(user01);
        username.add(user02);
        username.add(user03);
    }
}
