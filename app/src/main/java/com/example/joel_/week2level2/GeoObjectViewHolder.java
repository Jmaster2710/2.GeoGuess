package com.example.joel_.week2level2;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class GeoObjectViewHolder extends RecyclerView.ViewHolder {

    public ImageView geoImage;
    public View view;


    public GeoObjectViewHolder(View itemView) {

        super(itemView);

        geoImage = itemView.findViewById(R.id.geoImageView);

        view = itemView;

    }
}
