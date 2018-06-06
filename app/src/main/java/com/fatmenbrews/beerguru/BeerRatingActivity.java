package com.fatmenbrews.beerguru;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class BeerRatingActivity extends SingleFragmentActivity {

    private static final String EXTRA_BEER_ID =
            "com.fatmenbrews.beerguru.beer_id";

    public static Intent newIntent(Context packageContext, UUID beerId) {
        Intent intent = new Intent(packageContext, BeerRatingActivity.class);
        intent.putExtra(EXTRA_BEER_ID, beerId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID beerId = (UUID) getIntent()
                .getSerializableExtra(EXTRA_BEER_ID);
        return BeerRatingFragment.newInstance(beerId);
    }
}
