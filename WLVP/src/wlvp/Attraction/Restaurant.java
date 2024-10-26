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
     * Returns the type of the restaurant.
     * @return RestaurantType representing the type of the restaurant (e.g., Sit-down, Quick Service)
     */
    public RestaurantType getRestaurantType() {
        return restaurantType;
    }

    /**
     * Creates a new Restaurant attraction.
     * @param ID Unique identifier for the restaurant
     * @param attractionStatus Initial status of the restaurant (true for active, false for closed)
     * @param restaurantType Type of the restaurant (defined by RestaurantType enumerator)
     */
    public Restaurant(int ID, boolean attractionStatus, RestaurantType restaurantType) {
        super(ID, attractionStatus);
        this.restaurantType = restaurantType;
    }

    private static class RestaurantType {

        public RestaurantType() {
        }
    }
}
