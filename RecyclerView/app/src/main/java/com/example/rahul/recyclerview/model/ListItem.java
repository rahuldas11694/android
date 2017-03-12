package com.example.rahul.recyclerview.model;

/**
 *  java representation of data to be displayed in recycler view
 * Created by rahul on 04/03/17.
 */

public class ListItem {

    private String title;
    private int imageResId;

    // this is the public getters  used in  DerpData.java file

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }
}
