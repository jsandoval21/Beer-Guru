package com.fatmenbrews.beerguru;

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

public class BeerListFragment extends Fragment {
    private RecyclerView mBeerRecyclerView;
    private BeerAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beer_list, container, false);

        mBeerRecyclerView = (RecyclerView) view.findViewById(R.id.beer_recycler_view);
        mBeerRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();
        return view;
    }

    private void updateUI() {
        BeerLab beerLab = BeerLab.get(getActivity());
        List<Beer_Ratings> beers = beerLab.getBeers();

        mAdapter = new BeerAdapter(beers);
        mBeerRecyclerView.setAdapter(mAdapter);
    }

    //View Holder: Holds beer data to show in main page (listview)
    private class BeerHolder extends RecyclerView.ViewHolder {
        public TextView mBeerNameView;

        public BeerHolder(View itemView) {
            super(itemView);

            mBeerNameView = (TextView) itemView;
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
            View view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false);
            return new BeerHolder(view);
        }

        @Override
        public void onBindViewHolder (BeerHolder holder, int position) {
            Beer beer = mBeers.get(position);
            holder.mBeerNameView.setText(beer.getBeerName());
        }

        @Override
        public int getItemCount() {
            return mBeers.size();
        }
    }
}
