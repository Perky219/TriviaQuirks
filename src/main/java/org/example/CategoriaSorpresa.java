package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import poo.proyecto2.triviaquirk.iCategorias;
import poo.proyecto2.triviaquirk.iJugador;
import poo.proyecto2.triviaquirk.iPregunta;
import poo.proyecto2.triviaquirk.iSuscriptorPreguntas;
import poo.proyecto2.triviaquirk.excepciones.excepcionPartidaNoDisponible;
import poo.proyecto2.triviaquirk.excepciones.excepcionPreguntasNoDisponibles;

public class CategoriaSorpresa implements iCategorias {
    private final String nombre = "Sorpresa";
    private final ArrayList<Partida> partidasActivas = new ArrayList();
    private static CategoriaSorpresa instancia;

    public CategoriaSorpresa() {
    }

    public static CategoriaSorpresa getInstance() {
        return instancia == null ? new CategoriaSorpresa() : instancia;
    }

    @Override
    public String nombreCategoria() {
        Objects.requireNonNull(this);
        return "Sorpresa";
    }

    @Override
    public int registrarPartida() {
        int nuevaPartida = 0;

        for (int i = 0; i < this.partidasActivas.size(); ++i) {
            int elemento = this.partidasActivas.get(i).numeroPartida;
            if (elemento > nuevaPartida) {
                nuevaPartida = elemento;
            }
        }

        ++nuevaPartida;
        this.partidasActivas.add(new Partida(nuevaPartida));
        return nuevaPartida;
    }

    @Override
    public void finalizarPartida(int numeroPartida) throws excepcionPartidaNoDisponible {
        boolean encontrada = false;

        for (int i = 0; i < this.partidasActivas.size(); ++i) {
            if (this.partidasActivas.get(i).getNumeroPartida() == numeroPartida) {
                this.partidasActivas.remove(i);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            throw new excepcionPartidaNoDisponible(String.format("La partida #%d no se encuentra disponible", numeroPartida));
        }
    }

    @Override
    public iPregunta obtenerPreguntaAleatoria(int numeroPartida) throws excepcionPreguntasNoDisponibles {
        TriviaPreguntaSorpresa[] elementos = TriviaPreguntaSorpresa.values();
        int numeroDeElementos = elementos.length;
        Partida partida = null;

        for(int i = 0; i < this.partidasActivas.size(); ++i) {
            if (((Partida)this.partidasActivas.get(i)).getNumeroPartida() == numeroPartida) {
                partida = (Partida)this.partidasActivas.get(i);
                break;
            }
        }

        if (numeroDeElementos <= partida.numeroPreguntasRealizadas.size()) {
            throw new excepcionPreguntasNoDisponibles();
        } else {
            long semilla = System.currentTimeMillis();
            Random random = new Random(semilla);

            int numeroAleatorio;
            for(numeroAleatorio = random.nextInt(numeroDeElementos); partida.numeroPreguntasRealizadas.contains(numeroAleatorio); numeroAleatorio = random.nextInt(numeroDeElementos)) {
            }

            partida.numeroPreguntasRealizadas.add(numeroAleatorio);
            TriviaPreguntaSorpresa[] preguntas = TriviaPreguntaSorpresa.values();
            TriviaPreguntaSorpresa preguntaAleatoria = preguntas[numeroAleatorio];
            String pregunta = preguntaAleatoria.getPregunta();
            String respuestaA = preguntaAleatoria.getRespuestaA();
            String respuestaB = preguntaAleatoria.getRespuestaB();
            String respuestaC = preguntaAleatoria.getRespuestaC();
            byte respuestaCorrecta = preguntaAleatoria.getRespuestaCorrecta();
            PreguntaSorpresa preguntaSolicitada = new PreguntaSorpresa(numeroAleatorio, pregunta, respuestaA, respuestaB, respuestaC, respuestaCorrecta);
            return preguntaSolicitada;
        }
    }

    @Override
    public void publicarEnSuscriptores(int numeroPartida) throws excepcionPartidaNoDisponible {
        Partida partida = null;

        for(int i = 0; i < this.partidasActivas.size(); ++i) {
            if (((Partida)this.partidasActivas.get(i)).getNumeroPartida() == numeroPartida) {
                partida = (Partida)this.partidasActivas.get(i);
                break;
            }
        }

        if (partida == null) {
            throw new excepcionPartidaNoDisponible("Esta partida ya no existe activa");
        } else {
            Iterator var5 = partida.getListadoSuscriptores().iterator();

            while(var5.hasNext()) {
                iSuscriptorPreguntas suscriptor = (iSuscriptorPreguntas)var5.next();
                suscriptor.publicarPuntaje(partida.listadoJugadores);
            }

        }
    }

    @Override
    public void agregarSuscriptor(int numeroPartida, iSuscriptorPreguntas sp) throws excepcionPartidaNoDisponible {
        Partida partida = null;

        for(int i = 0; i < this.partidasActivas.size(); ++i) {
            if (((Partida)this.partidasActivas.get(i)).getNumeroPartida() == numeroPartida) {
                partida = (Partida)this.partidasActivas.get(i);
                break;
            }
        }

        if (partida == null) {
            throw new excepcionPartidaNoDisponible("Esta partida ya no existe activa");
        } else {
            partida.addSuscriptor(sp);
        }
    }

    @Override
    public void agregarJugador(int numeroPartida, iJugador jugador) throws excepcionPartidaNoDisponible {
        Partida partida = null;

        for(int i = 0; i < this.partidasActivas.size(); ++i) {
            if (((Partida)this.partidasActivas.get(i)).getNumeroPartida() == numeroPartida) {
                partida = (Partida)this.partidasActivas.get(i);
                break;
            }
        }

        if (partida == null) {
            throw new excepcionPartidaNoDisponible("Esta partida ya no existe activa");
        } else {
            partida.addJugador(jugador);
        }
    }

    @Override
    public short cantidadDePreguntasExistentes() {
        TriviaPreguntaSorpresa[] elementos = TriviaPreguntaSorpresa.values();
        int numeroDeElementos = elementos.length;
        return (short)numeroDeElementos;
    }
}