package wlvp.Itinerary;

import java.util.ArrayList;
import wlvp.AccountCreation.Guest;
import wlvp.Attraction.AbstractAttraction;

/**
 * EventSlot object represents a single Attraction corresponding to a duration
 * and attendees
 *
 * @author Dan, Grant
 */
public class EventSlot {

    private AbstractAttraction attraction;
    private int duration;
    private ArrayList<Guest> guests;

    /**
     * Default constructor
     */
    public EventSlot() {
        duration = 0;
        guests = new ArrayList();
    }

    /**
     * Attraction parameterized constructor
     *
     * @param attraction The attraction in this time slot
     * @param duration The length of the time slot
     */
    public EventSlot(AbstractAttraction attraction, int duration) {
        this.attraction = attraction;
        this.duration = duration;
        guests = new ArrayList();
    }

    /**
     * Complete parameterized constructor
     *
     * @param attraction The attraction in this time slot
     * @param duration The length of the time slot
     * @param guests The guests attending this event
     */
    public EventSlot(AbstractAttraction attraction, int duration, ArrayList<Guest> guests) {
        this.attraction = attraction;
        this.duration = duration;
        this.guests = guests;
    }

    /**
     * Adds a guest the list of attending guests
     *
     * @param guest The guest to append
     */
    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    /**
     * Removes a guest from the list of attending guests
     *
     * @param guest The guest to be removed
     */
    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }

    /**
     * @return The attraction in this event
     */
    public AbstractAttraction getAttraction() {
        return attraction;
    }

    /**
     * @return The duration of the event
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @return The number of credits required for this event
     */
    public int getCreditCost() {
        return guests.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Display the attraction information using its toString() method
        sb.append("Attraction: ").append(attraction != null ? attraction.toString() : "N/A")
                .append("\nDuration: ").append(duration).append(" minutes")
                .append("\nGuests: ");

        // Display guest list or a default message if empty
        if (guests != null && !guests.isEmpty()) {
            for (Guest guest : guests) {
                sb.append(guest.toString()).append(", ");
            }
            // Remove the trailing comma and space
            sb.setLength(sb.length() - 2);
        } else {
            sb.append("No guests");
        }

        return sb.toString();
    }
}
