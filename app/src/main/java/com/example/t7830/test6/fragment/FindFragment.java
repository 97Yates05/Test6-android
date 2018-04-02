package com.example.t7830.test6.fragment;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.t7830.test6.MainActivity;
import com.example.t7830.test6.R;
import com.example.t7830.test6.adapter.NewsAdapter;
import com.example.t7830.test6.entity.News;

import java.util.ArrayList;
import java.util.List;


public class FindFragment extends Fragment {
    private List<News> newsList = new ArrayList<>();
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_find, container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initNews();
        listView = getView().findViewById(R.id.lst_hot_infos);
        listView.setAdapter(new NewsAdapter(getActivity(),R.layout.list_item,newsList));

    }

    private void initNews() {
        News news1 = new News(R.mipmap.find_hot_city, "从广州去东莞仅需半个小时，美食美景统统都在等着你！",
                "源自:羊城攻略", 23, 10526);
        News news2 = new News(R.mipmap.find_hot_home, "旅行前最应该做的时间准备事项，千万别给忽略了",
                "源自:冬夏旅游", 15, 10002);
        News news3 = new News(R.mipmap.find_hot_city, "北京周边竟然藏着20个绝美仙境，够你免费玩一年！",
                "源自:北京攻略", 0, 895);
        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
    }
}
