package ar.edu.undec.jugadores.core.repositorio;

import ar.edu.undec.jugadores.core.dominio.Jugador;

public interface ICrearJugadorRepositorio {

     boolean existeJugador(String carnet);
     boolean guardarJugador(Jugador jugador);
}
