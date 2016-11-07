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
public class ReservationSummary extends ReservationIdentifier {
    
    private boolean hasArrived;
    private String personName;
    private String departureName;
    private int travellingEntityCount;

    public boolean isHasArrived() {
        return hasArrived;
    }

    public void setHasArrived(boolean hasArrived) {
        this.hasArrived = hasArrived;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getDepartureName() {
        return departureName;
    }

    public void setDepartureName(String departureName) {
        this.departureName = departureName;
    }

    public int getTravellingEntityCount() {
        return travellingEntityCount;
    }

    public void setTravellingEntityCount(int travellingEntityCount) {
        this.travellingEntityCount = travellingEntityCount;
    }
    
}
