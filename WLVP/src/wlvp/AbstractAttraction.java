/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp;

/**
 * Abstract class representing a general attraction in the theme park.
 * All specific types of attractions (e.g., Rides, Restaurants) will inherit from this class.
 */
public abstract class AbstractAttraction {

    /** Unique identifier for the attraction */
    private int ID;
    
    /** The current status of the attraction (true for active, false for closed) */
    private boolean attractionStatus;

    /**
     * Returns the status of the attraction.
     * @return boolean representing whether the attraction is active (true) or closed (false)
     */
    public boolean getStatus() {
        return attractionStatus;
    }

    /**
     * Creates a new attraction with the specified ID and status.
     * @param ID Unique identifier for the attraction
     * @param attractionStatus Initial status of the attraction (true for active, false for closed)
     */
    public AbstractAttraction(int ID, boolean attractionStatus) {
        this.ID = ID;
        this.attractionStatus = attractionStatus;
    }
}
