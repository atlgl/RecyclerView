package com.example.angelus.recyclerviewejemplo.modelo;

/**
 * Created by Angelus on 17/02/2017.
 */

public class Animal {
    private int animalID;
    private String nombre;
    private String descripcion;
    private int foto;

    public Animal(int animalID, String nombre, String descripcion, int foto) {
        this.animalID = animalID;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalID=" + animalID +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", foto=" + foto +
                '}';
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public Animal(int animalID, String nombre) {
        this.animalID = animalID;
        this.nombre = nombre;
    }
}
