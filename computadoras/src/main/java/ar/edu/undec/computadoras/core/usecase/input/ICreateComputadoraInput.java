package ar.edu.undec.computadoras.core.usecase.input;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.exceptions.ComputadoraExisteException;

public interface ICreateComputadoraInput {

    public boolean createComputadora(Computadora laCompu) throws ComputadoraExisteException;
}
