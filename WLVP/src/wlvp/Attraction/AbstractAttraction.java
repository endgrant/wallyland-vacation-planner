/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp.Attraction;

import java.time.LocalDateTime;

/**
 * Abstract class representing a general attraction in the theme park.
 * All specific types of attractions (e.g., Rides, Restaurants) will inherit from this class.
 */
public abstract class AbstractAttraction {

    /** Unique identifier for the attraction */
    private int ID;
    
    /** The current status of the attraction (true for active, false for closed) */
    private boolean attractionStatus;
    
    /** Name of the attraction */
    private String name;

    /** Last time the status or wait time was updated */
    private LocalDateTime lastUpdatedTime;

    /**
     * Constructor to create a new attraction with the specified ID, status, and name.
     * @param ID Unique identifier for the attraction
     * @param attractionStatus Initial status of the attraction (true for active, false for closed)
     * @param name Name of the attraction
     */
    public AbstractAttraction(int ID, boolean attractionStatus, String name) {
        this.ID = ID;
        this.attractionStatus = attractionStatus;
        this.name = name;
        this.lastUpdatedTime = LocalDateTime.now();
    }

    public boolean getStatus() {
        return attractionStatus;
    }

    public void setStatus(boolean status) {
        this.attractionStatus = status;
        updateLastUpdatedTime();
    }
    
    public String getName() {
        return name;
    }

    public abstract int calculateWaitTime();
    
    public int getID() {
        return ID;
    }
    
    
    /**
     * @return String name of the Attraction's type
     */
    public abstract String getType();
    

    public LocalDateTime getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * Updates the last updated time to the current time.
     */
    protected void updateLastUpdatedTime() {
        this.lastUpdatedTime = LocalDateTime.now();
    }
    @Override
    public String toString(){
        return this.name;
    }
}
