package Exceptions;

public class GeneroInvalidoException extends RuntimeException {
    public GeneroInvalidoException() {
        super("Genero escolhido está inválido");
    }
}
