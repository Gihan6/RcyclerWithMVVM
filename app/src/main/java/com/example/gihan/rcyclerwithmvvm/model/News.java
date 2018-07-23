package com.example.gihan.rcyclerwithmvvm.model;

/**
 * Created by Gihan on 7/9/2018.
 */

public class News {

    public String title, descrption;

    public News(String title, String descrption) {
        this.title = title;
        this.descrption = descrption;
    }

    public News() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }
}
