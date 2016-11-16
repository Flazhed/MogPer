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
public class RouteSummary extends RouteIdentifier {
    
    private double travelTime;
    private String harbourOrigin;
    private String harbourDestination;

    public RouteSummary(double travelTime, String harbourOrigin, String harbourDestination, long routeId) {
        super(routeId);
        this.travelTime = travelTime;
        this.harbourOrigin = harbourOrigin;
        this.harbourDestination = harbourDestination;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getHarbourOrigin() {
        return harbourOrigin;
    }

    public void setHarbourOrigin(String harbourOrigin) {
        this.harbourOrigin = harbourOrigin;
    }

    public String getHarbourDestination() {
        return harbourDestination;
    }

    public void setHarbourDestination(String harbourDestination) {
        this.harbourDestination = harbourDestination;
    }
    
}
