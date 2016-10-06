/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Ferry;
import java.util.List;

/**
 *
 * @author Soren
 */
public class HarbourDetails extends HarbourIdentifier {
    
    private String name;
    private List<Ferry> ferries;
    
}
