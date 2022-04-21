package exceptions;

public class NoGroupInFaculty extends RuntimeException {
    public NoGroupInFaculty(String errorMessage) {
        super(errorMessage);
    }

}
