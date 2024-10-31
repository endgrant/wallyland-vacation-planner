package wlvp.ParkPass;

import java.util.ArrayList;
import wlvp.AccountCreation.Guest;
import wlvp.Itinerary.Itinerary;

/**
 *  The ParkPass holds an Itinerary, credit amount, and the guests associated with it
 * @author Dan, Grant
 */
public class ParkPass {
    private final int ownerId;
    private int credits;
    private final Itinerary itinerary;
    private final ArrayList<Guest> guests;
    
    
    /**
     * Default constructor
     * @param ownerId The owner id of the pass
     */
    public ParkPass(int ownerId) {
        this.ownerId = ownerId;
        credits = 0;
        itinerary = new Itinerary();
        guests = new ArrayList<>();
    }
    
    
    /**
     * Credits parameterized constructor
     * @param ownerId The owner id of the pass
     * @param credits The number of credits to initialize the pass with
     */
    public ParkPass(int ownerId, int credits){
        this.ownerId = ownerId;
        this.credits = credits;
        itinerary = new Itinerary();
        guests = new ArrayList<>();
    }
    
    
    /**
     * @return The owner of the park pass
     */
    public int getOwnerId() {
        return ownerId;
    }
    
    
    /**
     * @return The credit amount on the pass
     */
    public int getCredits() {
        return credits;
    }
    
    
    /**
     * Adds credits to the users ParkPass
     * @param amount The amount to be added 
     */
    public void purchaseCredits(int amount){
        credits += amount;
    }
    
    
    /**
     * Returns an Itinerary
     * @return The Itinerary associated with this pass
     */
    public Itinerary getItinerary(){
        return itinerary;
    }
    
    
    /**
     * @return The guests using this park pass
     */
    public ArrayList<Guest> getGuests() {
        return guests;
    }
    
    
    /**
     * @return The number of guests using this park pass
     */
    public int getGuestCount() {
        return guests.size();
    }
    
    
    /**
     * Adds a new guest to the list of guests on this pass
     * @param guest The guest to be added
     */
    public void addGuest(Guest guest) {
        guests.add(guest);
    }
    
    
    /**
     * Removes the given guest from the list of guests on this pass
     * @param guest The guest to be removed
     */
    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }
}
