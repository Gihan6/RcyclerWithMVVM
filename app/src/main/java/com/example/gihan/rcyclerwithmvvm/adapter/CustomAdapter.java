package com.example.gihan.rcyclerwithmvvm.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.gihan.rcyclerwithmvvm.databinding.NewsBinding;
import com.example.gihan.rcyclerwithmvvm.viewModel.NewsModel;

import java.util.List;

/**
 * Created by Gihan on 7/9/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomView> {

    List<NewsModel> listNews;

    public CustomAdapter(List<NewsModel> mlList) {
        this.listNews = mlList;
    }

    private LayoutInflater layoutInflater;

    @Override
    public CustomView onCreateViewHolder(ViewGroup parent, int viewType) {

        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }

        NewsBinding newsBinding = NewsBinding.inflate(layoutInflater, parent, false);
        return new CustomView(newsBinding);
    }


    @Override
    public void onBindViewHolder(CustomView holder, int position) {

        NewsModel newsModel = listNews.get(position);
        holder.bind(newsModel);

//        holder.title.setText(news.getTitle());
//        holder.desc.setText(news.getDescrption());


    }

    @Override
    public int getItemCount() {
        return listNews.size();
    }


    public class CustomView extends RecyclerView.ViewHolder {


        private NewsBinding newsBinding;
        //   TextView title, desc;

        public CustomView(NewsBinding newsBinding) {
            super(newsBinding.getRoot());

            this.newsBinding = newsBinding;
//            title = (TextView) itemView.findViewById(R.id.title);
//            desc = (TextView) itemView.findViewById(R.id.descrption);

        }

        public void bind(NewsModel newsModel) {
            this.newsBinding.setNewsView(newsModel);


        }

        public NewsBinding getNewsBinding() {
            return newsBinding;
        }

    }
}
