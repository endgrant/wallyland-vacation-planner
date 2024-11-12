package wlvp.Itinerary;

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
    
    
    /**
     * Adds an event to the itinerary
     * @param event The EventSlot to append to the itinerary
     */
    public void addEvent(EventSlot event){
        events.add(event);
    }
    
    
    /**
     * Removes an event from the itinerary
     * @param event
     */
    public void removeEvent(EventSlot event){
        events.remove(event);
    }
   
    
    /**
     * @return List of EventSlots in the itinerary
     */
    public ArrayList<EventSlot> getEvents(){
       return events;
    }
}
