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

    public HarbourDetails(String name, List<Ferry> ferries) {
        this.name = name;
        this.ferries = ferries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ferry> getFerries() {
        return ferries;
    }

    public void setFerries(List<Ferry> ferries) {
        this.ferries = ferries;
    }
    
}
