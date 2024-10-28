package wlvp.Itinerary;

import wlvp.Attraction.AbstractAttraction;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * A users itinerary consists of EventSlots that describe different attractions
 * @author Dan
 */
public class EventSlot {
    private AbstractAttraction attraction;
    private int guestCount;
    
    
    
    
    /**
 *  Default Constructor Method
 * @author Dan
 */
 
    public EventSlot(AbstractAttraction attraction,int guestCount){
        this.attraction = attraction;
        this.guestCount = guestCount;
    }
    /**
 *  returns the amount of credits for an EventSlot
 * @author Dan
 */
    public int getCreditCost(){
        return 0;
    }
    
}
