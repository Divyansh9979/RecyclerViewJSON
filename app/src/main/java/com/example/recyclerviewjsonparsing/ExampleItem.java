package com.example.recyclerviewjsonparsing;

public class ExampleItem {
    private String mImageUrl;
    private String mCreator;
    //private int mLikes;

    public ExampleItem(String imageUrl, String creator) {
        mImageUrl = imageUrl;
        mCreator = creator;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreator() {
        return mCreator;
    }

}