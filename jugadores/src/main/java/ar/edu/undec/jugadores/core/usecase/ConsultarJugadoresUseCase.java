package ar.edu.undec.jugadores.core.usecase;

import ar.edu.undec.jugadores.core.dominio.Jugador;
import ar.edu.undec.jugadores.core.repositorio.IConsultarJugadoresRepositorio;

import java.util.Collection;

public class ConsultarJugadoresUseCase {

    private IConsultarJugadoresRepositorio consultarJugadoresRepositorio;
    private Collection<Jugador> jugadores;

    public ConsultarJugadoresUseCase(IConsultarJugadoresRepositorio consultarJugadoresRepositorio) {
        this.consultarJugadoresRepositorio = consultarJugadoresRepositorio;
    }

    public Collection<Jugador> consultarJugadores() {
        return jugadores;
    }
}
