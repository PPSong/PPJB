package com.penn.ppjb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NearbyFragment extends Fragment {

    public NearbyFragment() {
        // Required empty public constructor
    }

    public static NearbyFragment newInstance() {
        NearbyFragment fragment = new NearbyFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nearby, container, false);
    }
}
