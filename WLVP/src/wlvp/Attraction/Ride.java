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
     * Creates a new Ride attraction.
     * @param ID Unique identifier for the ride
     * @param attractionStatus Initial status of the ride (true for active, false for closed)
     * @param name Name of the ride
     * @param rideType Type of the ride (defined by RideType enumerator)
     */
    public Ride(int ID, boolean attractionStatus, String name, RideType rideType) {
        super(ID, attractionStatus, name);
        this.rideType = rideType;
    }
    
    
    /**
     * @return String name of the RideType
     */
    @Override
    public String getType() {
        return rideType.toString();
    }

    
    @Override
    public int calculateWaitTime() {
        int baseWaitTime = 5;
        int waitTime;

        switch (rideType) {
            case Rollercoaster:
                waitTime = baseWaitTime * 4;
                break;
            case KidRide:
                waitTime = baseWaitTime;
                break;
            case WaterParkRide:
                waitTime = baseWaitTime * 2;
                break;
            case PrizeGames:
                waitTime = baseWaitTime / 2;
                break;
            case ThrillRide:
                waitTime = baseWaitTime * 3;
                break;
            default:
                waitTime = baseWaitTime;
        }
        
        updateLastUpdatedTime(); // Call the protected method from AbstractAttraction
        return waitTime;
    }
}
