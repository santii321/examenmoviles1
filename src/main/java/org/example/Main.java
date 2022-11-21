package org.example;

import org.example.controladores.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingresoDatos = new Scanner(System.in);
        Jugador objetoJugador = new Jugador();

        ArrayList <Jugador> jugadores = new ArrayList<Jugador>();

        int opcion = 0;

        System.out.println("**** CONVOCATORIA SELECCÓN COLOMBIA ****");
        System.out.println("1. Agregar un jugador \n2. Buscar un jugador por número " +
                "\n3. Editar información de un jugador. \n4. Mostrar toda la convocatoria de jugadores" +
                "\n5. Salir");

        do {
            System.out.print("Ingrese la opcion: ");
            opcion = ingresoDatos.nextInt();

            switch (opcion){

                case 1:
                    System.out.println("Ingrese nombre del jugador");
                    objetoJugador.setNombre(ingresoDatos.next());

                    System.out.println("Ingrese Apellido del jugador");
                    objetoJugador.setApellidos(ingresoDatos.next());

                    System.out.println("Ingrese la edad del jugador");
                    objetoJugador.setEdad(ingresoDatos.nextInt());

                    System.out.println("Ingrese la posición del jugador");
                    objetoJugador.setPosicionJugador(ingresoDatos.next());

                    System.out.println("Ingrese el Equipo donde juega actualmente");
                    objetoJugador.setEquipoJuega(ingresoDatos.next());

                    break;

                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;

                case 5:
                    System.out.println("Elegiste la opcion salir.... Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }

    }
    while(opcion != 5);


    }
}