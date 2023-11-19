package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;
import poo.proyecto2.triviaquirk.iPregunta;
import poo.proyecto2.triviaquirk.excepciones.excepcionPreguntasNoDisponibles;
import poo.proyecto2.triviaquirk.excepciones.excepcionRangoMayor;

public class JuegoTrivia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var jugador = login(scanner);

        System.out.println("¡Bienvenido, " + jugador.getNombre() + "!");

        boolean exit = false;
        while (!exit) {
            System.out.println("Bienvenido a TriviaQuirk");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Jugador loginJugador = login(scanner);
                    System.out.println("¡Bienvenido, " + loginJugador.getNombre() + "!");
                    break;
                case 2:
                    playTriviaGame(scanner);
                    break;
                case 3:
                    System.out.println("¡Gracias por jugar! Hasta luego.");
                    exit = true;
                    break;
                default:
                    System.out.println("Seleccione una opción válida.");
                    break;
            }
        }
    }
    public static void playTriviaGame(Scanner scanner) {
        System.out.println("Elige una categoría:");
        System.out.println("1. Arte");
        System.out.println("2. Cine");
        System.out.println("3. General");
        System.out.println("4. Sorpresa");
        System.out.print("Seleccione una categoría: ");

        int categoryChoice = scanner.nextInt();
        switch (categoryChoice) {
            case 1:
                playCategory("Arte", scanner);
                break;
            case 2:
                playCategory("Cine", scanner);
                break;
            case 3:
                playCategory("General", scanner);
                break;
            case 4:
                playCategory("Sorpresa", scanner);
                break;
            default:
                System.out.println("Seleccione una opción válida.");
                break;
        }
    }
    public static void playCategory(String categoryName, Scanner scanner) {
        CategoriaMusica musicaCategory = CategoriaMusica.getInstance();
        CategoriaSorpresa sorpresaCategory = CategoriaSorpresa.getInstance();
        CategoriaTecnologia tecnologiaCategory = CategoriaTecnologia.getInstance();
        CategoriaDeporte deporteCategory = CategoriaDeporte.getInstance();
        switch (categoryName) {
            case "Musica":
                musicaCategory = CategoriaMusica.getInstance();
                break;
            case "Tecnologia":
                tecnologiaCategory = CategoriaTecnologia.getInstance();
                break;
            case "Deporte":
                deporteCategory = CategoriaDeporte.getInstance();
                break;
            case "Sorpresa":
                sorpresaCategory = CategoriaSorpresa.getInstance();
                break;
            default:
                System.out.println("Seleccione una opción válida.");
                break;
        }
        int puntos = 0;
        int tiempoMaximoRespuesta = 20;

        while (true) {
            try {
                iPregunta pregunta = null;
                switch (categoryName) {
                    case "Musica":
                        pregunta = musicaCategory.obtenerPreguntaAleatoria(musicaCategory.registrarPartida());
                        break;
                    case "Tecnologia":
                        pregunta = tecnologiaCategory.obtenerPreguntaAleatoria(tecnologiaCategory.registrarPartida());
                        break;
                    case "Deporte":
                        pregunta = deporteCategory.obtenerPreguntaAleatoria(deporteCategory.registrarPartida());
                        break;
                    case "Sorpresa":
                        pregunta = sorpresaCategory.obtenerPreguntaAleatoria(sorpresaCategory.registrarPartida());
                        break;
                    default:
                        System.out.println("Seleccione una opción válida.");
                        break;
                }
                assert pregunta != null;
                mostrarPregunta(pregunta);
                String respuestaUsuario = scanner.nextLine().trim();

                if (respuestaUsuario.isEmpty()) {
                    System.out.println("Tiempo agotado. Respuesta incorrecta.");

                } else {
                    byte opcionElegida = Byte.parseByte(respuestaUsuario);
                    byte valorRespuesta = pregunta.esCorrecta(opcionElegida);
                    puntos += calcularPuntos(valorRespuesta);
                    System.out.println("Puntos hasta ahora: " + puntos);
                }

            } catch (excepcionPreguntasNoDisponibles e) {
                System.out.println("Se han agotado las preguntas en esta categoría.");
                break;

            } catch (excepcionRangoMayor | NumberFormatException e) {
                System.out.println("Respuesta no válida. Introduce el número correspondiente a la respuesta.");

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            if (tiempoMaximoRespuesta <= 0) {
                System.out.println("Tiempo agotado. Respuesta incorrecta.");
                break;
            }

            tiempoMaximoRespuesta--;
        }
    }
    public static int calcularPuntos(byte valorRespuesta) {
        return switch (valorRespuesta) {
            case 1 -> 3;
            case 2 -> 2;
            case 3 -> 1;
            default -> 0;
        };
    }
    public static void mostrarPregunta(iPregunta pregunta) {
        System.out.println(pregunta.obtenerDescripcion());
        System.out.println(pregunta.obtenerRespuesta1());
        System.out.println(pregunta.obtenerRespuesta2());
        System.out.println(pregunta.obtenerRespuesta3());
        System.out.print("Elige una respuesta (1, 2, o 3): ");
    }

    public static Jugador login(Scanner scanner) {
        System.out.println("Bienvenido a TriviaQuirk");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                scanner.nextLine();
                System.out.print("Ingresa tu nombre: ");
                String nombreJugador = scanner.nextLine();
                return new Jugador(nombreJugador);
            case 2:
                System.out.println("¡Gracias por jugar! Hasta luego.");
                System.exit(0);
            default:
                System.out.println("Seleccione una opción válida.");
                return login(scanner);
        }
    }
}
