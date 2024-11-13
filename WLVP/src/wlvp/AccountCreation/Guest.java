package wlvp.AccountCreation;

import java.util.ArrayList;
import wlvp.Itinerary.EventSlot;
import wlvp.Itinerary.Itinerary;
import wlvp.ParkPass.ParkPass;

/**
 * Represents a guest user
 * @author Grant
 */
public class Guest extends AbstractUser {
    /**
     * The ParkPass associated with this guest
     */
    private ParkPass pass;
    
    
    /**
     * Default constructor
     * @param id
     * @param email
     * @param password
     */
    public Guest(int id, String email, String password) {
        this.ID = id;
        this.email = email;
        this.password = password;
    }
    
    
     public void setParkPass(ParkPass pass) {
        this.pass = pass;
    }
    
    /**
     * @return ParkPass The ParkPass associated with this guest
     */
    public ParkPass getParkPass() {
        return pass;
    }
    
    
    @Override
    public String toString() {
        return this.email + "       " + Integer.toString(this.ID);
    }
}
