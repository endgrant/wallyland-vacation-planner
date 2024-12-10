package wlvp.Itinerary;

import wlvp.Attraction.AbstractAttraction;

/**
 * EventSlot object represents a single Attraction corresponding to a duration
 * 
 *
 * @author Dan, Grant
 */
public class EventSlot {

    private AbstractAttraction attraction;
   
    /**
     * Default constructor
     */
    public EventSlot() {}

    /**
     * Attraction parameterized constructor
     *
     * @param attraction The attraction in this time slot
     * @param duration The length of the time slot
     */
    public EventSlot(AbstractAttraction attraction, int duration) {
        this.attraction = attraction;
      
    }

    /**
     * Complete parameterized constructor
     * 
     * @param attraction The attraction in this time slot
     */
    public EventSlot(AbstractAttraction attraction) {
        this.attraction = attraction;
   
    }

    /**
     * @return The attraction in this event
     */
    public AbstractAttraction getAttraction() {
        return attraction;
    }
 
    @Override
    public String toString() {
        if (attraction != null) {
            return attraction.getName();
        } else {
            return "Attraction: N/A";
        }
    }

}
