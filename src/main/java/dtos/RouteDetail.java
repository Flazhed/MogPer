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
    
}
