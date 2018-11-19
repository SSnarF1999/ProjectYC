package com.example.ptrbvs.foododo;
import java.util.ArrayList;
import java.io.Serializable;
public class User implements Serializable {

    private String name;
    private String password;
    private Boolean present = true;
    private ArrayList<Tag> tags;
    private String profilePic;
    private boolean voted;

    public User(String name, String password, ArrayList<Tag> tags, String profilePic) {
        this.name = name;
        this.password = password;
        this.tags = tags;
        this.profilePic = profilePic;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public Boolean getPresent() {
        return present;
    }

    public void setPresent(Boolean present) {
        this.present = present;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public boolean isVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }
}