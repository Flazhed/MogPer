package etos;

public class FerryOverbookedException extends InvalidBookingException {
    public FerryOverbookedException(String message) {
        super(message);
    }
}
