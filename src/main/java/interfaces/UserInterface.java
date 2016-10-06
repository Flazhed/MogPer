/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entities.TravellingEntity;
import dtos.*;
import java.time.LocalDate;
import java.util.List;
import etos.*;

/**
 *
 * @author Soren
 */
public interface UserInterface {
    
    /**
     * Fetches a list of all departures on a given route, on a given date.
     * @param departureDate The day of the departure
     * @param route The Route object that holds information about destination/origin
     * @return Returns a List of departures
     */
    List<DepartureIdentifier> getDepartures(LocalDate departureDate, RouteIdentifier route) throws NoAvailableDateException, UnexpectedErrorException;
    
    /**
     * Fetches a list of of RouteSummaries, in order for the frontend to display the existing routes.
     * @return List of RouteSummaries
     */
    List<RouteIdentifier> getAllRouteSummaries() throws UnexpectedErrorException;
    
    /**
     * Attempts to make a reservation on the departure that a user wishes to travel with.
     * @param person Person object with information about the person creating the reservation.
     * @param departureId The ID of the departure. 
     * @param travellingEntities A list of all the travellingentities .
     * @return Returns a newly created ReservationIdentifier
     */
    ReservationIdentifier createReservation(PersonDetail person, long departureId, List<TravellingEntity> travellingEntities) throws InvalidReservationException, UnexpectedErrorException;
    
    /**
     * Get a list of the different types of TravellingEntities, used to display in the front-end
     * @return List of TravellingEntities.
     */
    List<TravellingEntity> getTravellingEntities() throws UnexpectedErrorException;
    
}
