package wlvp;


import java.util.ArrayList;
import wlvp.AccountCreation.AccountController;
import wlvp.AccountCreation.Employee;
import wlvp.Attraction.AttractionController;
import wlvp.AccountCreation.EmployeeType;
import wlvp.AccountCreation.Guest;
import wlvp.IncidentReporting.ReportController;
import wlvp.Itinerary.ItineraryController;
import wlvp.ParkPass.ParkPassController;

/**
 * @author Grant
 */
public class WLVP {
    public static ArrayList<Guest> guestList = new ArrayList();
    public static ArrayList<Employee> employeeList = new ArrayList();
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize controllers
        AccountController.initialize();
        ParkPassController.initialize();
        ItineraryController.initialize();
        AttractionController.initialize();
        ReportController.initialize();

        
        // Create some dummy accounts
        AccountController.createGuest("guest1@email.com", "password1");
        AccountController.createGuest("guest2@email.com", "password2");
        AccountController.createGuest("guest3@email.com", "password3");
        AccountController.createGuest("guest4@email.com", "password4");
        AccountController.createEmployee("employee1@email.com", "password1", EmployeeType.MANAGER);
        AccountController.createEmployee("employee2@email.com", "password2", EmployeeType.STAFF);
        
        AccountController.navigateToAccountCreation();

        // Testing
        ParkPassController.addGuest(AccountController.createGuest("testemail@case.com", "pass1234"));
        ParkPassController.addGuest(AccountController.createGuest("num2email@site.com", "5678word"));
    }
    
    
    /**
     * Closes the views of other controllers
     */
    public static void closeOtherWindows() {
        AccountController.hideAllWindows();
        ParkPassController.hideAllWindows();
        ItineraryController.hideAllWindows();
        AttractionController.hideAllWindows();
    }
}
