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
    
}
