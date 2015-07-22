package io.dragh.myapplication.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.dragh.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Destacados extends Fragment {

    public Destacados() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_destacados, container, false);
    }


}
