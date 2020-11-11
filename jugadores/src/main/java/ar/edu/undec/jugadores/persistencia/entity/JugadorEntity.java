package ar.edu.undec.jugadores.persistencia.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "jugador")
@SequenceGenerator(name = "jugador_id_seq", initialValue = 1,sequenceName = "jugador_id_seq", allocationSize = 1)
public class JugadorEntity {

        @Id
        @Column(name = "carnet")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jugador_id_seq")
        private String carnet;
        @Column(name = "carnet")
        private String nombre;
        @Column(name = "fnacimiento")
        private LocalDate fnacimiento;
        @Column(name = "altura")
        private double altura;
        @Column(name = "peso")
        private double peso;
        @Column(name = "lado_habil")
        private String lado_habil;


    public JugadorEntity() {
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(LocalDate fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getLado_habil() {
        return lado_habil;
    }

    public void setLado_habil(String lado_habil) {
        this.lado_habil = lado_habil;
    }
}
