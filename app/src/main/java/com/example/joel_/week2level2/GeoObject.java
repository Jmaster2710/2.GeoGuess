package com.example.joel_.week2level2;

import android.support.v7.widget.RecyclerView;

public class GeoObject {
    private String mGeoName;
    private int mGeoImageName;
    private boolean mIsEurope;


    public static final String[] PRE_DEFINED_GEO_OBJECT_NAMES = {

            "Denmark",
            "Canada",
            "Bangladesh",
            "Kazachstan",
            "Colombia",
            "Poland",
            "Malta",
            "Thailand"

    };

    public static final int[] PRE_DEFINED_GEO_OBJECT_IMAGE_IDS = {

            R.drawable.img1_yes_denmark,
            R.drawable.img2_no_canada,
            R.drawable.img3_no_bangladesh,
            R.drawable.img4_yes_kazachstan,
            R.drawable.img5_no_colombia,
            R.drawable.img6_yes_poland,
            R.drawable.img7_yes_malta,
            R.drawable.img8_no_thailand
    };

    public static final boolean[] PRE_DEFINED_GEO_OBJECT_EUROPE = {

            true,
            false,
            false,
            true,
            false,
            true,
            true,
            false
    };



    public GeoObject(String mGeoName, int mGeoImageName, boolean mIsEurope) {
        this.mGeoName = mGeoName;
        this.mGeoImageName = mGeoImageName;
        this.mIsEurope = mIsEurope;
    }

    //Getters
    public String getmGeoName()
    {
        return mGeoName;
    }

    public int getmGeoImageName()
    {
        return mGeoImageName;
    }

    public boolean getmIsEurope()
    {
        return mIsEurope;
    }

    //Setters
    public void setmGeoImageName(int mGeoImageName)
    {
        this.mGeoImageName = mGeoImageName;
    }
    public void setmIsEurope(String mGeoName)
    {
        this.mGeoName = mGeoName;
    }
    public void setmGeoName(boolean mIsEurope)
    {
        this.mIsEurope = mIsEurope;
    }
}
