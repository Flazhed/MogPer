/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.time.LocalDateTime;

/**
 *
 * @author Soren
 */
public class DepartureDetail extends DepartureIdentifier{
    
    private LocalDateTime departureTime;
    private RouteSummary routeSummary;

    public DepartureDetail(LocalDateTime departureTime, RouteSummary routeSummary, long departureId) {
        super(departureId);
        this.departureTime = departureTime;
        this.routeSummary = routeSummary;
    }

    
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public RouteSummary getRouteSummary() {
        return routeSummary;
    }

    public void setRouteSummary(RouteSummary routeSummary) {
        this.routeSummary = routeSummary;
    }
    
}
