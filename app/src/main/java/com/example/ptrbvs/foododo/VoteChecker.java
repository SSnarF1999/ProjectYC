package com.example.ptrbvs.foododo;

import java.util.ArrayList;
import java.util.Collections;

public class VoteChecker {

    MealData mealData = new MealData();

    protected Group group;
    protected ArrayList<Tag> groupTags = new ArrayList();
    ArrayList<Meal> mealList = mealData.loadMeals();

    public VoteChecker(Group group) {
        this.group = group;
    }

    protected void setAbsent(User absentUser) {
        ArrayList<User> currentUserList = this.group.getUsers();
        ArrayList<User> newUserList = new ArrayList();

        //Loop trough group to find target User
        for (User user : currentUserList) {
            if (user == absentUser) {
                //set absent
                user.setPresent(false);
                newUserList.add(user);
            } else {
                newUserList.add(user);
            }
        }
        //implement updated group
        this.group.setUsers(newUserList);
    }

    protected void vote(Meal votedMeal) {
        //if () { if user has not already voted for this item
        for (Meal meal : mealList) {
            if (votedMeal.getName().equals(meal.getName())) {
                meal.setScore(meal.getScore() + 1);
            }
        }
    }

    protected void findMatches() {
        ArrayList<Tag> similairTags = new ArrayList();

        for (User user : group.getUsers()) {

            //if user is present
            if (user.getPresent()) {
                ArrayList<Tag> userTags = user.getTags();

                for (Tag tag : userTags) {
                    for (User comparedUser : group.getUsers()) {

                        //if user is not the same and user is present
                        if (user != comparedUser && comparedUser.getPresent()) {

                            //find similair tags
                            for (Tag userTag : userTags) {

                                //if similair and not already detected
                                if (similairTags.contains(userTag)) {

                                    //find where the similair tag is and increment score
                                    for (Tag increment : similairTags) {

                                        if (userTag == increment) {
                                            increment.setScore(increment.getScore() + 1);
                                        }
                                    }
                                } else {
                                    similairTags.add(userTag);
                                }
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(similairTags, new TagComparator());
        this.groupTags = similairTags;
    }
    //wollah tantoe veel parentheses.
    //ik ben hier dus trots op.

}
