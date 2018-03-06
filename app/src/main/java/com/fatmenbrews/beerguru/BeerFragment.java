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
    private Beer mBeer;     //beer object
    private EditText mBreweryName;      //Brewery name EditText field

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mBeer = new Beer();     //initialize beer object
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
                mBeer.setmBrewery(s.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Blank for now
            }
        });

        return v;
    }
}
