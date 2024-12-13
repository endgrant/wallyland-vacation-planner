/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp.Attraction;

/**
 * Class representing a Restaurant in the theme park.
 * Inherits from AbstractAttraction.
 */
public class Restaurant extends AbstractAttraction {

    /** The type of restaurant, as defined by the RestaurantType enumerator */
    private RestaurantType restaurantType;

    /**
     * Creates a new Restaurant attraction.
     * @param ID Unique identifier for the restaurant
     * @param attractionStatus Initial status of the restaurant (true for active, false for closed)
     * @param name Name of the restaurant
     * @param restaurantType Type of the restaurant (defined by RestaurantType enumerator)
     */
    public Restaurant(int ID, boolean attractionStatus, String name, RestaurantType restaurantType) {
        super(ID, attractionStatus, name);
        this.restaurantType = restaurantType;
    }
    
    
    /**
     * @return String name of the RestaurantType
     */
    @Override
    public String getType() {
        return restaurantType.toString();
    }
    

    @Override
    public int calculateWaitTime() {
        int baseWaitTime = 10;
        int waitTime;

        if (restaurantType == RestaurantType.SitDown) {
            waitTime = baseWaitTime * 3;
        } else if (restaurantType == RestaurantType.Casual) {
            waitTime = baseWaitTime * 2;
        } else {
            waitTime = baseWaitTime;
        }
        
        updateLastUpdatedTime(); // Call the protected method from AbstractAttraction
        return waitTime;
    }
}
