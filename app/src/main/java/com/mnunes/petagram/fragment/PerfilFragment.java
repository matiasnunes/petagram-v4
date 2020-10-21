package com.mnunes.petagram.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mnunes.petagram.R;
import com.mnunes.petagram.adapter.FotoMascotaAdaptador;
import com.mnunes.petagram.pojo.FotoMascota;

import java.util.ArrayList;

public class PerfilFragment extends Fragment {

    ArrayList<FotoMascota> fotos;
    private RecyclerView listaFotos;

    public PerfilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);
        listaFotos = (RecyclerView) v.findViewById(R.id.rvFotosMascota);

        LinearLayoutManager llm = new GridLayoutManager(getActivity(), 3);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaFotos.setLayoutManager(llm);
        inicializarListaFotos();
        inicializarAdaptador();

        ArrayList<String> nombresMascota = new ArrayList<>();
        for (FotoMascota foto_mascota : fotos ) {
            nombresMascota.add(String.valueOf(foto_mascota.getLikes()));
        }

        return v;
    }

    public void inicializarAdaptador() {
        FotoMascotaAdaptador adaptador = new FotoMascotaAdaptador( fotos );
        listaFotos.setAdapter(adaptador);
    }

    public void inicializarListaFotos() {

        fotos = new ArrayList<FotoMascota>();

        fotos.add(new FotoMascota( R.drawable.cat, 3));
        fotos.add(new FotoMascota( R.drawable.cat, 1));
        fotos.add(new FotoMascota( R.drawable.cat, 0));
        fotos.add(new FotoMascota( R.drawable.cat, 6));
        fotos.add(new FotoMascota( R.drawable.cat, 2));
        fotos.add(new FotoMascota( R.drawable.cat, 2));
        fotos.add(new FotoMascota( R.drawable.cat, 0));
        fotos.add(new FotoMascota( R.drawable.cat, 3));
    }
}