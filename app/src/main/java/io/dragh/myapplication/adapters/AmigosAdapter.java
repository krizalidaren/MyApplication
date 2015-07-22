package io.dragh.myapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import io.dragh.myapplication.R;
import io.dragh.myapplication.models.Amigo;

public class AmigosAdapter extends RecyclerView.Adapter<AmigosAdapter.ViewHolder> {

    private ArrayList<Amigo> amigos;
    private int itemLayout;

    public AmigosAdapter(ArrayList<Amigo> amigos, int itemLayout) {
        this.amigos = amigos;
        this.itemLayout = itemLayout;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView amigoNombre;
        public TextView amigoTwitter;
        public TextView ultimaCancion;

        public ViewHolder(View itemView) {
            super(itemView);

            amigoNombre = (TextView) itemView.findViewById(R.id.nombre_amigo);
            amigoTwitter = (TextView) itemView.findViewById(R.id.twitter_amigo);
            ultimaCancion = (TextView) itemView.findViewById(R.id.ultima_cancion_amigo);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Amigo amigo = amigos.get(position);
        holder.amigoNombre.setText(amigo.getNombre());
        holder.amigoTwitter.setText(amigo.getTwitter());
        holder.ultimaCancion.setText(amigo.getUltimaCancion());
    }

    @Override
    public int getItemCount() {
        return amigos.size();
    }
}
