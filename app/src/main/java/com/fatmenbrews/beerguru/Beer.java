package com.fatmenbrews.beerguru;

import java.util.UUID;

/**
 * Created by Juan on 3/4/2018.
 */

public class Beer {
    private UUID mId;               //unique ID for beer
    private String mBrewery;        //Brewery name
    private String mBeerName;       //Beer Name
    private String mStyle;          //Beer Style
    private String mABV;            //Beer ABV
    private String mIBU;            //Beer IBU

    public Beer() {
        mId = UUID.randomUUID();    //generate unique ID for beer
    }

    public UUID getmId() {
        return mId;
    }

    public String getmBrewery() {
        return mBrewery;
    }

    public void setmBrewery(String mBrewery) {
        this.mBrewery = mBrewery;
    }

    public String getmBeerName() {
        return mBeerName;
    }

    public void setmBeerName(String mBeerName) {
        this.mBeerName = mBeerName;
    }

    public String getmStyle() {
        return mStyle;
    }

    public void setmStyle(String mStyle) {
        this.mStyle = mStyle;
    }

    public String getmABV() {
        return mABV;
    }

    public void setmABV(String mABV) {
        this.mABV = mABV;
    }

    public String getmIBU() {
        return mIBU;
    }

    public void setmIBU(String mIBU) {
        this.mIBU = mIBU;
    }
}
