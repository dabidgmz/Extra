package com.example.myapplication.models;

import java.io.Serializable;

import java.io.Serializable;

public class Contacto implements Serializable {

    private String nombre;
    private String numero;
    private String edad;
    private String descripcion;
    private int tipoAccion;

    public Contacto(String nombre, String numero, String descripcion, String edad, int tipoAccion) {
        this.nombre = nombre;
        this.numero = numero;
        this.descripcion = descripcion;
        this.edad = edad;
        this.tipoAccion = tipoAccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getTipoAccion() {
        return tipoAccion;
    }
}