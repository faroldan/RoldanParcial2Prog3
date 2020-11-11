package ar.edu.undec.jugadores.core.usecase;

import ar.edu.undec.jugadores.core.dominio.Jugador;
import ar.edu.undec.jugadores.core.repositorio.ICrearJugadorRepositorio;


public class CrearJugadorUseCase {

    private ICrearJugadorRepositorio crearJugadorRepositorio;

    public CrearJugadorUseCase(ICrearJugadorRepositorio crearJugadorRepositorio) {
        this.crearJugadorRepositorio = crearJugadorRepositorio;
    }

    public boolean crearJugador(Jugador elJugador) {
        return true;
    }
}
