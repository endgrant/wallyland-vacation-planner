package wlvp;


import wlvp.AccountCreation.AccountController;
import wlvp.Attraction.AttractionController;
import wlvp.ParkPass.ParkPassController;

/**
 * @author Grant
 */
public class WLVP {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize controllers
        AccountController.initialize();
        
        AccountController.navigateToAccountCreation();

        
    }
}
