package com.fatmenbrews.beerguru;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.UUID;

public class BeerRatingFragment extends Fragment {

    public static final String ARG_BEER_ID = "beer_id";

    private Beer_Ratings mBeerRating;       //beer object
    private EditText mBeerName;             //Select Beer
    private EditText mBreweryName;          //Select Brewery
    private EditText mStyle;                //Select Style
    private EditText mABV;
    private EditText mIBU;
    private RatingBar mAppearanceRating;
    private RatingBar mAromaRating;
    private RatingBar mFeelRating;
    private RatingBar mTasteRating;
    private RatingBar mOverallRating;
    private EditText mRatingNotes;

    public static BeerRatingFragment newInstance(UUID beerId){
        Bundle args = new Bundle();
        args.putSerializable(ARG_BEER_ID, beerId);

        BeerRatingFragment fragment = new BeerRatingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        UUID beerId = (UUID) getArguments().getSerializable(ARG_BEER_ID);

        mBeerRating = BeerLab.get(getActivity()).getBeer(beerId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.beer_fragment, container, false);

        mBeerName = v.findViewById(R.id.beer_name);
        mBeerName.setText(mBeerRating.getBeerName());
        mBeerName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Blank for now
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mBeerRating.setBeerName(s.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Blank for now
            }
        });

        mBreweryName = v.findViewById(R.id.brewery_name);
        mBreweryName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Blank for now
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mBeerRating.setBrewery(s.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Blank for now
            }
        });

        mStyle = v.findViewById(R.id.beer_style);
        mStyle.setText(mBeerRating.getStyle());
        mStyle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Blank for now
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mBeerRating.setStyle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Blank for now
            }
        });

        mABV = v.findViewById(R.id.abv);
        mABV.setText(mBeerRating.getABV());
        mABV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Blank for now
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mBeerRating.setABV(s.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Blank for now
            }
        });

        mIBU = v.findViewById(R.id.ibu);
        mIBU.setText(mBeerRating.getIBU());
        mIBU.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Blank for now
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mBeerRating.setIBU(s.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Blank for now
            }
        });

        mOverallRating = v.findViewById(R.id.overall_rating);

        mAppearanceRating = v.findViewById(R.id.appearance_rating);
        mAppearanceRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                updateOverallRating();
                mBeerRating.setAppearance(mAppearanceRating.getRating());
                Toast.makeText(getContext(), String.valueOf(ratingBar.getRating()), Toast.LENGTH_SHORT).show();
            }
        });

        mAromaRating = v.findViewById(R.id.aroma_rating);
        mAromaRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                updateOverallRating();
                mBeerRating.setAroma(mAromaRating.getRating());
                Toast.makeText(getContext(), String.valueOf(ratingBar.getRating()), Toast.LENGTH_SHORT).show();
            }
        });

        mTasteRating = v.findViewById(R.id.taste_rating);
        mTasteRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                updateOverallRating();
                mBeerRating.setTaste(mTasteRating.getRating());
                Toast.makeText(getContext(), String.valueOf(ratingBar.getRating()), Toast.LENGTH_SHORT).show();
            }
        });

        mFeelRating = v.findViewById(R.id.feel_rating);
        mFeelRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                updateOverallRating();
                mBeerRating.setFeel(mFeelRating.getRating());
                Toast.makeText(getContext(), String.valueOf(ratingBar.getRating()), Toast.LENGTH_SHORT).show();
            }
        });

        mRatingNotes = v.findViewById(R.id.taste_notes);
        mRatingNotes.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //Blank for now
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mBeerRating.setTasteNotes();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //Blank for now
            }
        });

        return v;
    }

    //Update Overall Rating Method
    public void updateOverallRating(){
        mOverallRating.setRating(
                (mAppearanceRating.getRating() + mAromaRating.getRating()
                        + mTasteRating.getRating() + mFeelRating.getRating()) / 4
        );
        mBeerRating.setOverall(mOverallRating.getRating());
    }
}
