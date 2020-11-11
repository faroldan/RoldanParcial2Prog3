package ar.edu.undec.jugadores.controller;

import ar.edu.undec.jugadores.config.JugadorDTO;
import org.springframework.http.ResponseEntity;

public class CrearJugadorController {
    private JugadorDTO elJugador;

    public ResponseEntity crearJugador(JugadorDTO elJugador) {
        this.elJugador = elJugador;
        return null;
    }
}
