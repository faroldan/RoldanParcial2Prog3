package ar.edu.undec.computadoras.core.usecase;

import ar.edu.undec.computadoras.core.dominio.Computadora;
import ar.edu.undec.computadoras.core.exceptions.ComputadoraExisteException;
import ar.edu.undec.computadoras.core.repositorio.IComputadoraRepositorio;
import ar.edu.undec.computadoras.core.usecase.input.ICreateComputadoraInput;

public class CrearComputadoraUseCase {

    private IComputadoraRepositorio createComputadoraRepo;

    public CrearComputadoraUseCase(IComputadoraRepositorio computadoraRepositorio) {
        this.createComputadoraRepo = computadoraRepositorio;
    }

    public boolean crearComputadora(Computadora laCompu) throws ComputadoraExisteException {
        if(createComputadoraRepo.existeComputadora(laCompu.getModel())){
            throw new ComputadoraExisteException("Computadora existe");
        }else {

            return createComputadoraRepo.guardarComputadora(laCompu);
        }
    }
}
