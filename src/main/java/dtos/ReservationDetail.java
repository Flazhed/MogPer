/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.TravellingEntity;
import java.util.List;

/**
 *
 * @author Soren
 */
public class ReservationDetail extends ReservationIdentifier {
    
    private boolean hasArrived;
    private PersonDetail person;
    private DepartureDetail departure;
    private List<TravellingEntity> travellingEntities;
    
}
