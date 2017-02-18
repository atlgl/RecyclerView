package com.example.angelus.recyclerviewejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.angelus.recyclerviewejemplo.adapters.AdapterAnimalesRecyclerView;
import com.example.angelus.recyclerviewejemplo.modelo.Animal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Animal> animals=new ArrayList<>();
        animals.add(new Animal(1,"tortuga","tortuga marina",R.drawable.tortuga_g));
        animals.add(new Animal(2,"Atun rojo","Atun tuny",R.drawable.atun_rojo_g));
        animals.add(new Animal(3,"Elefante","Ulefante",R.drawable.elefante_g));
        animals.add(new Animal(4,"Leopardo","Corre a 170km",R.drawable.leopardo_nievess_g));
        animals.add(new Animal(5,"Lobo","Anda en manadas",R.drawable.lobo));
        animals.add(new Animal(6,"Oso Panda","es Blanco con negro",R.drawable.oso_panda_6));

        recyclerView=(RecyclerView) findViewById(R.id.reclycer_view_animales);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        //GridLayoutManager gridLayoutManager=new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(linearLayoutManager);

        AdapterAnimalesRecyclerView adapter=new AdapterAnimalesRecyclerView(animals);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
