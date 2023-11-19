package org.example;

import poo.proyecto2.triviaquirk.iJugador;
public class Jugador implements iJugador {
    private String nombre;
    private short puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    @Override
    public String obtenerNombreJugador() {
        return this.nombre;
    }

    public short obtenerPuntaje() {
        return this.puntaje;
    }

    public short aumentarPuntaje(short puntos) {
        this.puntaje += puntos;
        return this.puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
