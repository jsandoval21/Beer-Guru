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

    public String getBrewery() {
        return mBrewery;
    }

    public void setBrewery(String mBrewery) {
        this.mBrewery = mBrewery;
    }

    public String getBeerName() {
        return mBeerName;
    }

    public void setBeerName(String mBeerName) {
        this.mBeerName = mBeerName;
    }

    public String getStyle() {
        return mStyle;
    }

    public void setStyle(String mStyle) {
        this.mStyle = mStyle;
    }

    public String getABV() {
        return mABV;
    }

    public void setABV(String mABV) {
        this.mABV = mABV;
    }

    public String getIBU() {
        return mIBU;
    }

    public void setIBU(String mIBU) {
        this.mIBU = mIBU;
    }
}
