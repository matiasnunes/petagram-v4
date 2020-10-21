package com.mnunes.petagram.fragment;

import com.mnunes.petagram.adapter.MascotaAdaptador;
import com.mnunes.petagram.pojo.Mascota;

import java.util.ArrayList;

public interface IRecyclerViewFragmentView {

    public void generarLinearLayout();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas );

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
