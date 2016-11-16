/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

/**
 *
 * @author Soren
 */
public class ReservationIdentifier {
    
    
    private long reservationId;

    public ReservationIdentifier(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }
    
}
