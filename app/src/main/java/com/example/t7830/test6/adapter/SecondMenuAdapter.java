package com.example.t7830.test6.adapter;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.t7830.test6.R;
import com.example.t7830.test6.entity.Menu;

import java.util.List;

public class SecondMenuAdapter extends RecyclerView.Adapter<SecondMenuAdapter.ViewHolder> {


    public SecondMenuAdapter(List<Menu> menus_second) {
        this.menus_second = menus_second;
    }

    private List<Menu> menus_second;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout
                .item_main_second_menu, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Menu menu = menus_second.get(position);
        holder.menu_second_image.setImageResource(menu.icon);
        holder.menu_second_text.setText(menu.menuName);

    }

    @Override
    public int getItemCount() {
        return null != menus_second ? menus_second.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView menu_second_image;
        private TextView menu_second_text;

        public ViewHolder(View itemView) {
            super(itemView);
            menu_second_image = itemView.findViewById(R.id.img_second_menu_icon);
            menu_second_text = itemView.findViewById(R.id.txt_second_menu_name);
        }

    }
}
