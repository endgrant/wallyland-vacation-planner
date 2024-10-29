package wlvp.Itinerary;


import wlvp.Attraction.AbstractAttraction;
import java.util.ArrayList;


/**
 * A user's Itinerary is represented by an array of Events.
 * @author Dan, Grant
 */
public class Itinerary {
    private ArrayList<EventSlot> events;
    
    
    /**
     * Default constructor 
     */
    public Itinerary() {
        events = new ArrayList<>();
    }
    
    
    /**
     * Events parameterized constructor
     * @param events 
     */
    public Itinerary(ArrayList<EventSlot> events){
        this.events = events;
    }
    
    
    // MODIFY TO USE AN EventSlot OBJECT INSTEAD
    /**
     *  Adds an event to a users Itinerary with a given attraction and the amount of guests attending.
     */
    public void addEvent(AbstractAttraction attraction,int guestCount){
   
    }
    
    
    /**
     * Removes an event from the itinerary
     * @param event
     */
    public void removeEvent(EventSlot event){
        
    }
   
    
    /**
     * @return List of EventSlots in the itinerary
     */
    public ArrayList<EventSlot> getEvents(){
       return events;
    }
}
