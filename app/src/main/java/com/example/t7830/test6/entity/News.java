package com.example.t7830.test6.entity;

import android.widget.ImageView;

public class News {
    private int imageViewId;
    private String hot_name;
    private String hot_source;
    private int agree;
    private int see;

    public News(int imageViewId, String hot_name, String hot_source, int agree, int see) {
        this.imageViewId = imageViewId;
        this.hot_name = hot_name;
        this.hot_source = hot_source;
        this.agree = agree;
        this.see = see;
    }

    public int getImageViewId() {
        return imageViewId;
    }

    public void setImageView(int imageViewId) {
        this.imageViewId = imageViewId;
    }

    public String getHot_name() {
        return hot_name;
    }

    public void setHot_name(String hot_name) {
        this.hot_name = hot_name;
    }

    public String getHot_source() {
        return hot_source;
    }

    public void setHot_source(String hot_source) {
        this.hot_source = hot_source;
    }

    public int getAgree() {
        return agree;
    }

    public void setAgree(int agree) {
        this.agree = agree;
    }

    public int getSee() {
        return see;
    }

    public void setSee(int see) {
        this.see = see;
    }
}
