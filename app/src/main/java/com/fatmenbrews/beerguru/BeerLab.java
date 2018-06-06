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
            Beer_Ratings beer = new Beer_Ratings();
            switch (i % 4) {
                case 0:
                    beer.setBeerName("Any IPA");
                    beer.setStyle("IPA");
                    beer.setABV("ABV: 6.0%");
                    beer.setIBU("IBU: 50");
                    break;
                case 1:
                    beer.setBeerName("Some Pale Ale");
                    beer.setStyle("Pale Ale");
                    beer.setABV("ABV:  5.8%");
                    beer.setIBU("IBU: 38");
                    break;
                case 2:
                    beer.setBeerName("Nutty Porter");
                    beer.setStyle("Porter");
                    beer.setABV("ABV: 6.5%");
                    beer.setIBU("IBU: 30");
                    break;
                case 3:
                    beer.setBeerName("Heavy Beer");
                    beer.setStyle("Lager");
                    beer.setABV("ABV: 5.0%");
                    beer.setIBU("IBU: 7");
                    break;
            }

            mBeers.add(beer);
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