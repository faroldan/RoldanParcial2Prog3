package ar.edu.undec.jugadores.usecaseUnitTest;

import ar.edu.undec.jugadores.core.dominio.Jugador;
import ar.edu.undec.jugadores.core.excepciones.JugadorExisteException;
import ar.edu.undec.jugadores.core.repositorio.ICrearJugadorRepositorio;
import ar.edu.undec.jugadores.core.usecase.CrearJugadorUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CrearJugadorUseCaseUnitTest {

    @Mock
    ICrearJugadorRepositorio crearJugadorRepositorio;

    @Test
    public void crearJugador_JugadorNoExiste_CreaJugador() throws JugadorExisteException {
        Jugador elJugador= Jugador.instancia("Lionel Messi", LocalDate.of(1987,6,24),"10",1.7,80.5,"Izquierdo");
        when(crearJugadorRepositorio.existeJugador("10")).thenReturn(false);
        when(crearJugadorRepositorio.guardarJugador(elJugador)).thenReturn(true);
        CrearJugadorUseCase crearJugadorUseCase=new CrearJugadorUseCase(crearJugadorRepositorio);
        boolean resultado=crearJugadorUseCase.crearJugador(elJugador);
        Assertions.assertTrue(resultado);
    }

    @Test
    public void crearJugador_JugadorExiste_JugadorExisteException(){
        //Completar Test


    }


}
