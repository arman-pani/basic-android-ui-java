package com.example.constraintlayoutbasics.models;

public class HopeItemModel {
    final private String title;
    final private int imageResId;

    public HopeItemModel(int imageResId, String title){
        this.imageResId = imageResId;
        this.title = title;
    }

    public int getImageResId() {return imageResId;}
    public String getTitle() {return title;}
}
