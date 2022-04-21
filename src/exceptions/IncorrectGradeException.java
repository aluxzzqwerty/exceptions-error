package exceptions;

public class IncorrectGradeException extends RuntimeException{
    public IncorrectGradeException(String errorMessage) {
        super(errorMessage);
    }
}
