/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dtos.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Soren
 */
public interface AdminInterface {
    
    /**
     * Verifies of a given username and password matches an admin's login details.
     * @param userName Username of the admin.
     * @param password Password of the admin.
     * @return Returns an AdminIdentifier if the given information was correct.
     */
    AdminDetail login(String userName, String password);
    
    /**
     * Creates new departures by selecting a date/time and using an existing route.
     * @param route The route that the departure should use.
     * @param departureTime The Date and time of the departure.
     * @return The newly created departureIdentifier object
     */
    DepartureIdentifier createDeparture(RouteIdentifier route, LocalDateTime departureTime);
    
    /**
     * Fetches a list of All departures in the system. (Is this a good idea ?)
     * @return A list with all the DepartureIdentifiers
     */
    List<DepartureIdentifier> getAllDepartures();
    
    /**
     * Fetches a single departure, on a given Id.
     * @param departureId Id of the departure.
     * @return A single Departureidentifier.
     */
    DepartureIdentifier getDeparture(long departureId);
    
    /**
     * Allows an admin to update an existing depature.
     * @param departure The edited departure. DepartureId CANNOT be edited.
     * @return The updated DepartureIdentifier.
     */
    DepartureIdentifier updateDeparture(DepartureIdentifier departure);
    
    /**
     * Allows an admin to delete an existing departure.
     * @param departureId The Id on the departure that needs to be deleted.
     * @return The deleted DepartureIdentifier.
     */
    DepartureIdentifier deleteDeparture(long departureId);
}
