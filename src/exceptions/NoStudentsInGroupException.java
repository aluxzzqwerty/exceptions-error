package exceptions;

public class NoStudentsInGroupException extends RuntimeException {
    public NoStudentsInGroupException(String errorMessage) {
        super(errorMessage);
    }
}
