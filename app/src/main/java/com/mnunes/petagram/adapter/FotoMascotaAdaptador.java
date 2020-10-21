package com.mnunes.petagram.adapter;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mnunes.petagram.R;
import com.mnunes.petagram.pojo.FotoMascota;

import java.util.ArrayList;
import java.util.List;

public class FotoMascotaAdaptador extends RecyclerView.Adapter<FotoMascotaAdaptador.FotoMascotaViewHolder> {

    ArrayList<FotoMascota> fotos_mascota;

    public FotoMascotaAdaptador( ArrayList<FotoMascota> fotos_mascota ) { this.fotos_mascota = fotos_mascota ; }

    @NonNull
    @Override
    public FotoMascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(( parent.getContext())).inflate(R.layout.activity_detalle_fotos, parent, false);
        return new FotoMascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FotoMascotaViewHolder fotoMascotaViewHolder, int position ) {
        final FotoMascota foto_mascota_obj = fotos_mascota.get( position );

        fotoMascotaViewHolder.tvLikesGaleria.setText(String.valueOf(foto_mascota_obj.getLikes()));
        fotoMascotaViewHolder.fotoMascota.setImageResource(foto_mascota_obj.getImagen());

    }

    @Override
    public int getItemCount() {
        return fotos_mascota.size();
    }

    public static class FotoMascotaViewHolder extends RecyclerView.ViewHolder {
        private ImageView fotoMascota;
        private TextView tvLikesGaleria;

        public FotoMascotaViewHolder( View itemView ) {
            super( itemView );

            fotoMascota = (ImageView) itemView.findViewById(R.id.imgFotoGaleria);
            tvLikesGaleria = (TextView) itemView.findViewById(R.id.tvLikesGaleria);
        }
    }
}
