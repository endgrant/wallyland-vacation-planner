/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp.Attraction;

/**
 * Class representing a Ride in the theme park.
 * Inherits from AbstractAttraction.
 */
public class Ride extends AbstractAttraction {
    
    /** The type of ride, as defined by the RideType enumerator */
    private RideType rideType;

    /**
     * Returns the type of the ride.
     * @return RideType representing the type of the ride (e.g., Rollercoaster, Kid Ride)
     */
    public RideType getRideType() {
        return rideType;
    }

    /**
     * Creates a new Ride attraction.
     * @param ID Unique identifier for the ride
     * @param attractionStatus Initial status of the ride (true for active, false for closed)
     * @param rideType Type of the ride (defined by RideType enumerator)
     */
    public Ride(int ID, boolean attractionStatus, RideType rideType) {
        super(ID, attractionStatus);
        this.rideType = rideType;
    }

    private static class RideType {

        public RideType() {
        }
    }
}
