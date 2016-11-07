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

    public boolean isHasArrived() {
        return hasArrived;
    }

    public void setHasArrived(boolean hasArrived) {
        this.hasArrived = hasArrived;
    }

    public PersonDetail getPerson() {
        return person;
    }

    public void setPerson(PersonDetail person) {
        this.person = person;
    }

    public DepartureDetail getDeparture() {
        return departure;
    }

    public void setDeparture(DepartureDetail departure) {
        this.departure = departure;
    }

    public List<TravellingEntity> getTravellingEntities() {
        return travellingEntities;
    }

    public void setTravellingEntities(List<TravellingEntity> travellingEntities) {
        this.travellingEntities = travellingEntities;
    }
    
}
