package exceptions;

public class MissingSubjectException extends RuntimeException {
    public MissingSubjectException(String errorMessage) {
        super(errorMessage);
    }
}
