package wlvp.ParkPass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wlvp.AccountCreation.Guest;
import wlvp.WLVP;

/**
 *
 * @author Daniel, Grant
 */
public class ParkPassController {
    private static boolean initialized;
    private static ParkPassView parkPassView;
    private static ParkPass parkPass;
    
    
    /**
     * Initializes the park pass controller
     */
    public static void initialize() {
        assert(!initialized);
        initialized = true;
        
        createNewParkPass(0);
        
        parkPassView = new ParkPassView();
    }
    
    
    /**
     * Makes the park pass view active
     */
    public static void navigateToParkPass(){
        WLVP.closeOtherWindows();
        parkPassView.parsePass(parkPass);
        parkPassView.setVisible(true);
    }
    
    /**
     * Hides all related windows
     */
    public static void hideAllWindows() {
        parkPassView.setVisible(false);
    }
    
    
    /**
     * Instantiates a new park pass object
     * @param id The unique integer ID for the park pass
     * @return The newly created park pass object
     */
    public static ParkPass createNewParkPass(int id){
        ParkPass newParkPass = new ParkPass(id);
        parkPass = newParkPass;
        return newParkPass;
    }
    
    
    /**
     * @param amount The amount of credits to be added to the pass balance
     */
    public static void addCredits(int amount){
        parkPass.purchaseCredits(amount);
        parkPassView.parsePass(parkPass);    
    }
    
    
    /**
     * @return The park pass object
     */
    public static ParkPass getParkPass(){
        return parkPass;
    }
    
    
    /**
     * Adds a guest to the park pass
     * @param guest The guest to be added
     */
    public static void addGuest(Guest guest) {
        parkPass.addGuest(guest);
    }
    
    
    /**
     * Removes a guest from the park pass
     * @param guest The guest to be removed
     */
    public static void removeGuest(Guest guest) {
        parkPass.removeGuest(guest);
    }
    
    
    /**
     * Checks if the park pass contains the given Guest already
     * @param guest The guest to check if is contained in the park pass
     * @return True if the passed guest is already on the park pass, false otherwise
     */
    public static boolean hasGuest(Guest guest) {
        return parkPass.getGuests().contains(guest);
    }
    
    
    /**
     * Invites a guest to the park pass based on the passed email address
     * @param email The email of the guest to invite
     * @return True if invitation succeeded, false otherwise
     */
    public static boolean inviteGuest(String email) {
        for (Guest guest : WLVP.guestList) {
            if (guest.getEmail().equals(email) && !hasGuest(guest)) {
                addGuest(guest);
                return true;
            }
        }
        
        return false;
    }
}


