package com.fatmenbrews.beerguru;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Juan on 5/21/2018.
 */

public class BeerRatingListFragment extends Fragment {
    private RecyclerView mBeerRecyclerView;
    private BeerAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beer_list, container, false);

        mBeerRecyclerView = view.findViewById(R.id.beer_recycler_view);
        mBeerRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        updateUI();
    }

    private void updateUI() {
        BeerLab beerLab = BeerLab.get(getActivity());
        List<Beer_Ratings> beers = beerLab.getBeers();

        if(mAdapter == null) {
            mAdapter = new BeerAdapter(beers);
            mBeerRecyclerView.setAdapter(mAdapter);
        } else {
            mAdapter.notifyDataSetChanged();
        }
    }

    private class BeerHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        //View Holder: Holds beer data to show in main page (listview)
        private TextView mBeerNameView;
        private TextView mBeerStyleView;
        private TextView mBeerAbvView;
        private TextView mBeerIbuView;

        private Beer_Ratings mBeer;

        public BeerHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            mBeerNameView = itemView.findViewById(R.id.list_item_beer_name);
            mBeerStyleView = itemView.findViewById(R.id.list_item_beer_style);
            mBeerAbvView = itemView.findViewById(R.id.list_item_beer_abv);
            mBeerIbuView = itemView.findViewById(R.id.list_item_beer_ibu);
        }

        public void bindBeer(Beer_Ratings beer) {
            mBeer = beer;
            mBeerNameView.setText(mBeer.getBeerName());
            mBeerStyleView.setText(mBeer.getStyle());
            mBeerAbvView.setText(mBeer.getABV());
            mBeerIbuView.setText(mBeer.getIBU());
        }

        @Override
        public void onClick(View v) {
            Intent intent = BeerRatingActivity.newIntent(getActivity(), mBeer.getmId());
            startActivity(intent);
        }

    }


    //Adapter
    private class BeerAdapter extends RecyclerView.Adapter<BeerHolder> {
        private List<Beer_Ratings> mBeers;

        public BeerAdapter(List<Beer_Ratings> beers) {
            mBeers = beers;
        }

        @Override
        public BeerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.list_item_beer, parent, false);
            return new BeerHolder(view);
        }

        @Override
        public void onBindViewHolder (BeerHolder holder, int position) {
            Beer_Ratings beer = mBeers.get(position);
            holder.bindBeer(beer);
        }

        @Override
        public int getItemCount() {
            return mBeers.size();
        }
    }
}
