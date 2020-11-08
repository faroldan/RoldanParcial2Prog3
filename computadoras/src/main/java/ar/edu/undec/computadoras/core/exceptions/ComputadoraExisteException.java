package ar.edu.undec.computadoras.core.exceptions;

public class ComputadoraExisteException extends Exception {
    @SuppressWarnings("serial")
    public ComputadoraExisteException(String msg){
        super(msg);

    }
}
