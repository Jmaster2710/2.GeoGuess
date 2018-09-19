package com.example.joel_.week2level2;

public class GeoObject {
    private String mGeoName;
    private int mGeoImageName;
    private boolean mIsEurope;

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
    public void setmGeoName(String mGeoName)
    {
        this.mGeoName = mGeoName;
    }
    public void setmGeoImageName(int mGeoImageName)
    {
        this.mGeoImageName = mGeoImageName;
    }
    public void setmIsEurope(boolean mIsEurope)
    {
        this.mIsEurope = mIsEurope;
    }
}
