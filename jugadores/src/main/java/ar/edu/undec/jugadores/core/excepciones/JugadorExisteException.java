package ar.edu.undec.jugadores.core.excepciones;
@SuppressWarnings("serial")
public class JugadorExisteException extends Exception {

    public JugadorExisteException(String msg){
        super(msg);
    }
}
