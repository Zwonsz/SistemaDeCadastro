package Exceptions;

public class TipoInvalidoException extends RuntimeException {
    public TipoInvalidoException() {
        super("Tipo escolhido inválido");
    }
}
