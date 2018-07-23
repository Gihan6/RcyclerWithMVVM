package com.example.gihan.rcyclerwithmvvm.viewModel;

import com.example.gihan.rcyclerwithmvvm.model.News;

/**
 * Created by Gihan on 7/9/2018.
 */

public class NewsModel {

    public String title ,descrption;
    public NewsModel(){

    }

    public NewsModel(News news){
        this.title=news.title;
        this.descrption=news.descrption;

    }
}
