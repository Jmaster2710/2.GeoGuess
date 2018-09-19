package com.example.joel_.week2level2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.support.design.widget.Snackbar;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class GeoGuessr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_guessr);

        final List<GeoObject> mGeoObjects = new ArrayList<>();

        for (int i = 0; i < GeoObject.PRE_DEFINED_GEO_OBJECT_NAMES.length; i++) {

            mGeoObjects.add(
                    new GeoObject(
                            GeoObject.PRE_DEFINED_GEO_OBJECT_NAMES[i],
                            GeoObject.PRE_DEFINED_GEO_OBJECT_IMAGE_IDS[i],
                            GeoObject.PRE_DEFINED_GEO_OBJECT_EUROPE[i])
            );
        }

        //Assigning the layout manager.
        RecyclerView mGeoRecyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);

        mGeoRecyclerView.setLayoutManager(mLayoutManager);
        GeoObjectAdapter mAdapter = new GeoObjectAdapter(this, mGeoObjects);
        mGeoRecyclerView.setAdapter(mAdapter);


        ItemTouchHelper.SimpleCallback simpleItemTouchCallback =

                new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {

                    @Override

                    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder
                            target) {

                        return false;

                    }

                    //Called when a user swipes left or right on a ViewHolder

                    @Override

                    public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {

                        //Get the index corresponding to the selected position
                        String message = "";
                        int position = (viewHolder.getAdapterPosition());
                        Log.d("myTag", String.valueOf(position));
                        //Swiping to europe
                        if (swipeDir == ItemTouchHelper.LEFT)
                        {
                            if (mGeoObjects.get(position).getmIsEurope())
                            {
                                message += "Congrats! ";
                            } else
                            {
                                message += "Too bad! ";
                            }

                        } else
                        if (swipeDir == ItemTouchHelper.RIGHT)
                        {
                            if (!mGeoObjects.get(position).getmIsEurope())
                            {
                                message += "Too bad! ";
                            } else
                            {
                                message += "Congrats! ";
                            }
                        }

                        message += mGeoObjects.get(position).getmGeoImageName();
                        if (mGeoObjects.get(position).getmIsEurope())
                        {
                            message += " is part of Europe!";
                        } else
                        {
                            message += " is not part of Europe!";
                        }

                        Log.d("myTag", message);
                    }

                };

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(mGeoRecyclerView);
    }
}
