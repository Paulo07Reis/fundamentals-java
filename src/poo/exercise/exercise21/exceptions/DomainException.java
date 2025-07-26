package poo.exercise.exercise21.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersion = 1l;

    public DomainException(String message) {
        super(message);
    }
}
