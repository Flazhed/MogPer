package etos;

public abstract class InvalidReservationException extends Exception {
    public InvalidReservationException(String message) {
        super(message);
    }
}
