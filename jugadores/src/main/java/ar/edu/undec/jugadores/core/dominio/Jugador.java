package ar.edu.undec.jugadores.core.dominio;

import java.time.LocalDate;

public class Jugador {
    private String nombre;

    private LocalDate fnacimiento;
    private String carnet;
    private double altura;
    private double peso;
    private String lado_habil;

    private Jugador( String nombre, LocalDate fnacimiento, String carnet,
                     double altura, double peso, String lado_habil){
        this.nombre = nombre;
        this.fnacimiento = fnacimiento;
        this.carnet = carnet;
        this.altura = altura;
        this.peso = peso;
        this.lado_habil = lado_habil;
    }

    public static Jugador instancia(String nomape, LocalDate fnacimiento, String carnet,
                                    double altura, double peso, String lado_habil) {

        return new Jugador( nomape,  fnacimiento,  carnet,
                 altura,  peso,  lado_habil);
    }


}
