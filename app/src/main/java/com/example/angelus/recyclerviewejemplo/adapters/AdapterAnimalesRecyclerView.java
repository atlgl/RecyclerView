package com.example.angelus.recyclerviewejemplo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.angelus.recyclerviewejemplo.R;
import com.example.angelus.recyclerviewejemplo.modelo.Animal;

import java.util.List;

/**
 * Created by Angelus on 17/02/2017.
 */

public class AdapterAnimalesRecyclerView extends RecyclerView.Adapter<AdapterAnimalesRecyclerView.AnimalViewHolder> {
    private List<Animal> animalList;

    public AdapterAnimalesRecyclerView(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater
                .from(parent.getContext()).
                        inflate(R.layout.card_view_animal,parent,false);
        return new AnimalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        holder.imagen.setImageResource(animalList.get(position).getFoto());
        holder.txtnombre.setText(animalList.get(position).getNombre().toString());
        holder.txtdescripcion.setText(animalList.get(position).getDescripcion().toString());
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public static class AnimalViewHolder extends RecyclerView.ViewHolder{
        public ImageView imagen;
        public TextView txtnombre;
        public TextView txtdescripcion;
        public ImageView imgshare;

        public AnimalViewHolder(View itemView) {
            super(itemView);
            imagen=(ImageView) itemView.findViewById(R.id.imagen);
            txtnombre=(TextView) itemView.findViewById(R.id.txtNombre);
            txtdescripcion=(TextView) itemView.findViewById(R.id.txtDescripcion);
            imgshare=(ImageView) itemView.findViewById(R.id.imgCompartir);
        }
    }
}
