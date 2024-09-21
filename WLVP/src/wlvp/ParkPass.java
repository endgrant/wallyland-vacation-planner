package wlvp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dan
 */
public class ParkPass {
    private int credits;
    private Itinerary itinerary;
    
    public ParkPass(int credits,Itinerary itinerary){
        this.credits = credits;
        this.itinerary = itinerary;
        
    }
    public void purchaseCredits(int amount){
        
    }
    public Itinerary getItinerary(){
        return this.itinerary;
    }
        
    
    
}
