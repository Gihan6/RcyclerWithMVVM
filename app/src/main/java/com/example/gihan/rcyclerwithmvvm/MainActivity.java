package com.example.gihan.rcyclerwithmvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gihan.rcyclerwithmvvm.adapter.CustomAdapter;
import com.example.gihan.rcyclerwithmvvm.model.News;
import com.example.gihan.rcyclerwithmvvm.viewModel.NewsModel;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    List<NewsModel>newsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recycler);

        newsList=new ArrayList<>();
        adapter=new CustomAdapter(newsList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


       NewsModel newsModel=new NewsModel();
       newsModel.title="hhhhhhhhhh";
       newsModel.descrption="nnnnnnnnnnn";
        newsList.add(newsModel);

    }
}
