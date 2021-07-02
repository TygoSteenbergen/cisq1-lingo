package nl.hu.cisq1.lingo.trainer.domain.exception;

public class InvalidLengthException extends RuntimeException{
    public InvalidLengthException(String message) {
        super(message);
    }
}
