package nl.hu.cisq1.lingo.trainer.application.exception;

public class InvalidGuessException extends RuntimeException{
    public InvalidGuessException(String message, Throwable cause) {
        super(message, cause);
    }
}
