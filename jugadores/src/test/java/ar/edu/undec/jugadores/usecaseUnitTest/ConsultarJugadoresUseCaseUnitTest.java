package ar.edu.undec.jugadores.usecaseUnitTest;
import ar.edu.undec.jugadores.core.dominio.Jugador;
import ar.edu.undec.jugadores.core.repositorio.IConsultarJugadoresRepositorio;
import ar.edu.undec.jugadores.core.usecase.ConsultarJugadoresUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Collections;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConsultarJugadoresUseCaseUnitTest {


    @Mock
    IConsultarJugadoresRepositorio consultarJugadoresRepositorio;

    @Test
    void consultarJugadores_ExistenJugadores_DevuelveColeccionConDatos(){
        ConsultarJugadoresUseCase consultarJugadoresUseCase=new ConsultarJugadoresUseCase(consultarJugadoresRepositorio); //nomb-ape, fnacimiento,
        when(consultarJugadoresRepositorio.obtenerJugadores()).thenReturn(Collections.singletonList(Jugador.instancia("Lionel Messi", LocalDate.of(1987,6,24),"10",1.7,80.5,"Izquierdo")));
        Assertions.assertFalse(consultarJugadoresUseCase.consultarJugadores().isEmpty());
    }

    @Test
    void consultarJugadores_NoExistenJugadores_DevuelveColeccionVacia(){
        //Completar test
    }
}
