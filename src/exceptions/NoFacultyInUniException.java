package exceptions;

public class NoFacultyInUniException extends RuntimeException {
    public NoFacultyInUniException(String errorMessage) {
        super(errorMessage);
    }
}
