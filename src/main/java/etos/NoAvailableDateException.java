package etos;

public class NoAvailableDateException extends InvalidReservationException {
    public NoAvailableDateException(String message) {
        super(message);
    }
}
