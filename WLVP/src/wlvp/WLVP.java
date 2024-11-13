package wlvp;


import wlvp.AccountCreation.AccountController;
import wlvp.AccountCreation.EmployeeType;
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
        ParkPassController.initialize();
        
        AccountController.navigateToAccountCreation();

        // Testing
        ParkPassController.addGuest(AccountController.createGuest("testemail@case.com", "pass1234"));
        ParkPassController.addGuest(AccountController.createGuest("num2email@site.com", "5678word"));
    }
}
