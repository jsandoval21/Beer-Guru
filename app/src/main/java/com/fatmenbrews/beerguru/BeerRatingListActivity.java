package com.fatmenbrews.beerguru;

import android.support.v4.app.Fragment;

/**
 * Created by Juan on 5/21/2018.
 */

public class BeerRatingListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new BeerRatingListFragment();
    }

}
