package org.example;

import org.example.controladores.Jugador;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingresoDatos = new Scanner(System.in);


        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

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
                    Jugador objetoJugador = new Jugador();

                    System.out.println("Ingrese el numero de la camisa");
                    objetoJugador.setId(ingresoDatos.nextInt());
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
                    jugadores.add(objetoJugador);

                    break;

                case 2:
                    int buscarJugador;
                    System.out.println("Ingrese el numero de la camisa");
                    buscarJugador = ingresoDatos.nextInt();
                    String nombreJugador="";

                    for (Jugador jugador : jugadores)
                    {
                        if (Objects.equals(jugador.getId(), buscarJugador))
                        {
                            nombreJugador = jugador.getNombre();
                            System.out.println("El nombre del jugador con este numero de camiseta es: "+jugador.getNombre());
                            break;
                        }else if(nombreJugador.equals("")){
                            System.out.println("El jugador no existe");
                            break;
                        }else{
                            System.out.println("Error del sistema");
                        }
                    }

                    break;
                case 3:
                {
                    int buscarJugadores;
                    System.out.print("Ingrese el numero de la camiseta del jugador: ");
                    buscarJugadores = ingresoDatos.nextInt();
                    boolean editJugador = false;
                    for (Jugador jugador : jugadores) {
                        if (Objects.equals(jugador.getId(), buscarJugadores))
                        {
                            System.out.println("El nombre del jugador es: "+jugador.getNombre()+"; Ingrese el nuevo nombre: ");
                            jugador.setNombre(ingresoDatos.next());
                            System.out.println("El nuevo nombre es: "+jugador.getNombre());
                            editJugador=true;
                            break;
                        }
                    }
                    if (!editJugador)
                    {
                        System.out.println("El jugador no existe");
                    }
                }
                break;
                case 4:
                    for (Jugador jugador : jugadores)
                    {
                        System.out.println("**********************************");
                        System.out.println("Nombre: "+jugador.getNombre());
                        System.out.println("Posicion: "+jugador.getPosicionJugador());
                        System.out.println("Camiseta: "+jugador.getId());
                        System.out.println("**********************************");
                    }
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