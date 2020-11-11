package ar.edu.undec.jugadores.controllerUnitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@SpringBootTest
public class CrearJugadorControllerUnitTest {


    @Test
    public void crearJugador_JugadorNoExiste_Devuelve200() throws JugadorExisteException {
        JugadorDTO elJugador=new JugadorDTO("Lionel Messi",LocalDate.of(1987,6,24),"10",1.7,80.5,"Izquierdo");
        when(crearJugadorInput.crearJugador(any(Jugador.class))).thenReturn(true);

        CrearJugadorController crearJugadorController = new CrearJugadorController(crearJugadorInput);
        ResponseEntity responseEntity = crearJugadorController.crearJugador(elJugador);
        boolean resultado = (boolean) responseEntity.getBody();
        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertTrue(resultado);
    }

    @Test
    public void crearJugador_JugadorExisteException_Devuelve412() throws JugadorExisteException {
        //Completar Test
        JugadorDTO elJugador=new JugadorDTO("Lionel Messi",LocalDate.of(1987,6,24),"10",1.7,80.5,"Izquierdo");
        when(crearJugadorInput.crearJugador(any(Jugador.class))).thenThrow(JugadorExisteException.class);
        ResponseEntity responseEntity=null;


        Assertions.assertEquals(HttpStatus.PRECONDITION_FAILED, responseEntity.getStatusCode());
    }

    @Test
    public void crearJugador_ExcepcionNoPrevista_Devuelve500() throws JugadorExisteException {
        //Completar Test

    }



}
