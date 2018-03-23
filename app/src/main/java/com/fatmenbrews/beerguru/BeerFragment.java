package com.fatmenbrews.beerguru;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class BeerFragment extends Fragment {
    private Beer_Ratings mBeerRating;       //beer object
    private EditText mBeerName;             //Select Beer
    private EditText mBreweryName;          //Select Brewery
    private EditText mStyle;                //Select Style

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mBeerRating = new Beer_Ratings();     //initialize beer object
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.beer_fragment, container, false);

        mBreweryName = (EditText) v.findViewById(R.id.brewery_name);
        mBreweryName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Blank for now
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mBeerRating.setmBrewery(s.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Blank for now
            }
        });

        return v;
    }
}
