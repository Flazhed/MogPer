/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Price;

/**
 *
 * @author Soren
 */
public class RouteDetail extends RouteIdentifier{
    
    private double travelTime;
    private HarbourSummary harbourOrigin;
    private HarbourSummary harbourDestination;
    private Price price;

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public HarbourSummary getHarbourOrigin() {
        return harbourOrigin;
    }

    public void setHarbourOrigin(HarbourSummary harbourOrigin) {
        this.harbourOrigin = harbourOrigin;
    }

    public HarbourSummary getHarbourDestination() {
        return harbourDestination;
    }

    public void setHarbourDestination(HarbourSummary harbourDestination) {
        this.harbourDestination = harbourDestination;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
    
}
