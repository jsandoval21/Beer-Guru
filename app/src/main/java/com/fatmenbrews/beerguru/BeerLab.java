package com.fatmenbrews.beerguru;

import android.content.Context;

public class BeerLab {
    private static BeerLab sBeerLab;

    public static BeerLab get(Context context) {
        if (sBeerLab == null) {
            sBeerLab = new BeerLab(context);
        }
        return sBeerLab;
    }

    private BeerLab(Context context) {

    }
}
