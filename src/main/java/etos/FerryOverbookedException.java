package etos;

public class FerryOverbookedException extends InvalidReservationException {
    public FerryOverbookedException(String message) {
        super(message);
    }
}
