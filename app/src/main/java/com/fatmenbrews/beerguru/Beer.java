package com.fatmenbrews.beerguru;

import java.util.UUID;

/**
 * Created by Juan on 3/4/2018.
 */

public class Beer {
    private UUID mId;           //unique ID for beer
    private String mBrewery;    //Brewery name
    private String mBeerName;       //Beer Name

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
}
