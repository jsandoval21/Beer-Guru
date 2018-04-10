package com.fatmenbrews.beerguru;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BeerLab {
    private static BeerLab sBeerLab;
    private List<Beer_Ratings> mBeers;

    public static BeerLab get(Context context) {
        if (sBeerLab == null) {
            sBeerLab = new BeerLab(context);
        }
        return sBeerLab;
    }

    private BeerLab(Context context) {
        mBeers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Beer_Ratings rating = new Beer_Ratings();
            rating.setBeerName("Beer #" + i);
            mBeers.add(rating);
        }
    }

    public List<Beer_Ratings> getBeers() {
        return mBeers;
    }

    public Beer_Ratings getBeer(UUID id) {
        for (Beer_Ratings beer : mBeers) {
            if (beer.getmId().equals(id)) {
                return beer;
            }
        }
        return null;
    }
}