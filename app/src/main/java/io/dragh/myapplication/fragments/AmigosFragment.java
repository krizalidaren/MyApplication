package io.dragh.myapplication.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import io.dragh.myapplication.R;
import io.dragh.myapplication.adapters.AmigosAdapter;
import io.dragh.myapplication.models.Amigo;

/**
 * A simple {@link Fragment} subclass.
 */
public class AmigosFragment extends Fragment {


    public AmigosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_amigos, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<Amigo> amigoArrayList = new ArrayList<>();
        Amigo amigo = new Amigo();
        amigo.setNombre("Renato");
        amigo.setTwitter("@renatovelasquez");
        amigo.setUltimaCancion("Since I've been loving you - Led Zeppelin");
        amigoArrayList.add(amigo);

        Amigo amigo1 = new Amigo();
        amigo1.setNombre("Renato1");
        amigo1.setTwitter("@renatovelasquez1");
        amigo1.setUltimaCancion("Since I've been loving you - Led Zeppelin");
        amigoArrayList.add(amigo1);

        Amigo amigo2 = new Amigo();
        amigo2.setNombre("Renato2");
        amigo2.setTwitter("@renatovelasquez2");
        amigo2.setUltimaCancion("Since I've been loving you - Led Zeppelin");
        amigoArrayList.add(amigo2);

        Amigo amigo3 = new Amigo();
        amigo3.setNombre("Renato3");
        amigo3.setTwitter("@renatovelasquez3");
        amigo3.setUltimaCancion("Since I've been loving you - Led Zeppelin");
        amigoArrayList.add(amigo3);

        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new AmigosAdapter(amigoArrayList, R.layout.row_amigos));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
