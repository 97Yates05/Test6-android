package com.example.t7830.test6.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.t7830.test6.R;
import com.example.t7830.test6.entity.News;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    private int resource;
    public NewsAdapter(@NonNull Context context, int resource, @NonNull List<News> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        News news = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view= LayoutInflater.from(getContext()).inflate(resource,parent,false);
           viewHolder = new ViewHolder();
           viewHolder.imageView = view.findViewById(R.id.find_hot_image);
           viewHolder.find_hot_name = view.findViewById(R.id.find_hot_name);
            viewHolder.find_hot_source = view.findViewById(R.id.find_hot_source);
            viewHolder.find_hot_agree = view.findViewById(R.id.find_hot_agree);
            viewHolder.find_hot_see = view.findViewById(R.id.find_hot_see);
            view.setTag(viewHolder);

        }
        else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();

        }
        viewHolder.imageView.setImageResource(news.getImageViewId());
        viewHolder.find_hot_name.setText(news.getHot_name());
        viewHolder.find_hot_source.setText(news.getHot_source());
        viewHolder.find_hot_agree.setText(String.valueOf(news.getAgree()));
        viewHolder.find_hot_see.setText(String.valueOf(news.getSee()));
        return view;
    }
    static class ViewHolder {
        ImageView imageView;
        TextView find_hot_name;
        TextView find_hot_source;
        TextView find_hot_agree;
        TextView find_hot_see;
    }
}
