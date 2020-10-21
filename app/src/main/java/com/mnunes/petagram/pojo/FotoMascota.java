package com.mnunes.petagram.pojo;

public class FotoMascota {

    private int likes;
    private int imagen;

    public FotoMascota(int imagen, int likes) {
        this.likes = likes;
        this.imagen = imagen;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

}
