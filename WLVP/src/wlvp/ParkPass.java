package wlvp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  The ParkPass holds an Itinerary and the amount of credits on the ParkPass
 * @author Dan
 */
public class ParkPass {
    private int credits;
    private Itinerary itinerary;
    
    public ParkPass(int credits,Itinerary itinerary){
        this.credits = credits;
        this.itinerary = itinerary;
        
    }
    /**
     * Adds credits to the users ParkPass
     * @param amount 
     */
 
    public void purchaseCredits(int amount){
          
    }
    /**
     * Returns an Itinerary
     * @return Itinerary
     */
    public Itinerary getItinerary(){
        return this.itinerary;
    }
        
    
    
}
