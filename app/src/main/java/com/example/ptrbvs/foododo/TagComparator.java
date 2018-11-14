package com.example.ptrbvs.foododo;

import java.util.Comparator;

public class TagComparator implements Comparator<Tag> {

    public int compare(Tag d, Tag d1) {
        return d.score - d1.score;
    }
}
