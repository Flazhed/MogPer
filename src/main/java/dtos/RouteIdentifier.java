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
public class RouteIdentifier {
    
    private long routeId;

    public RouteIdentifier(long routeId) {
        this.routeId = routeId;
    }

    
    
    public long getRouteId() {
        return routeId;
    }

    public void setRouteId(long routeId) {
        this.routeId = routeId;
    }
    
}
