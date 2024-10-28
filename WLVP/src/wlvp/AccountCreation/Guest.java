package wlvp.AccountCreation;

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
     */
    public Guest() {
        
    }
    
    
    /**
     * @return ParkPass The ParkPass associated with this guest
     */
    public ParkPass getParkPass() {
        return pass;
    }
}
