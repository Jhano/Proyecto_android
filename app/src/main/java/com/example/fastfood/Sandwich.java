package com.example.fastfood;

import android.widget.ImageView;

import java.io.Serializable;

public class Sandwich implements Serializable {
    String nombre;
    int imagen;
    String descripcion;
    String precio;


    public Sandwich(String nombre, int imagen, String descripcion, String precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return this.imagen;
    }

    public void setImagen(ImageView ImageView) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return this.precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
