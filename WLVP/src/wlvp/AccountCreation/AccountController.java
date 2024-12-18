package wlvp.AccountCreation;

import wlvp.IncidentReporting.Report;
import wlvp.IncidentReporting.ReportType;
import wlvp.ParkPass.ParkPassController;
import wlvp.WLVP;

/**
 * @author Grant
 */
public class AccountController {

    private static boolean initialized;
    private static int nextUserId = 0;
    private static AbstractUser user;
    private static AccountCreationView accountCreationView;
    private static AccountManagerView accountManagementView;

    /**
     * Initializes the account controller
     */
    public static void initialize() {
        assert (!initialized);
        initialized = true;

        accountCreationView = new AccountCreationView();
        accountManagementView = new AccountManagerView();
    }

    /**
     * Checks if the given email is valid
     *
     * @param email
     * @return Returns true if the email is valid
     */
    public static boolean isEmailValid(String email) {
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            return false;
        }
        
        // Disallow emails longer than 32 characters
        if (email.length() > 32) {
            return false;
        }

        // Check if there are at least 3 alphanumeric characters
        int count = 0;
        for (char c : email.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                count++;
            }
        }

        // Check if there is exactly one at symbol
        boolean exactlyOne = false;
        for (char c : email.toCharArray()) {
            if (c == '@') {
                if (exactlyOne) {
                    exactlyOne = false;
                    break;
                } else {
                    exactlyOne = true;
                }
            }
        }

        return count >= 3 && exactlyOne;
    }

    /**
     * Checks if the given password is valid
     *
     * @param password
     * @return Returns true if the password is valid
     */
    public static boolean isPasswordValid(String password) {
        if (!password.matches("^[a-zA-Z0-9!@#$%^&*()-_+=]+$")) {
            return false;
        }

        // Disallow passwords shorter than 8 characters or longer than 24
        if (password.length() < 8 || password.length() > 24) {
            return false;
        }

        // Check if there are at least 3 alphanumeric characters
        int count = 0;
        for (char c : password.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                count++;
            }
        }

        return count >= 3;
    }

    /**
     * @param email
     * @param password
     * @return The newly created guest object
     */
    public static Guest createGuest(String email, String password) {
        Guest guest = new Guest(nextUserId, email, password);
        nextUserId++;
        user = guest;
        
        WLVP.guestList.add(guest);
        
        return guest;
    }

    /**
     * @param email
     * @param password
     * @param type The type of the employee
     * @return The newly created employee object
     */
    public static Employee createEmployee(String email, String password, EmployeeType type) {
        Employee employee = new Employee(nextUserId, email, password, type);
        nextUserId++;
        user = employee;
        
        WLVP.employeeList.add(employee);

        return employee;
    }

    /**
     * Navigates to the account creation interface
     */
    public static void navigateToAccountCreation() {
        WLVP.closeOtherWindows();
        accountCreationView.setVisible(true);
    }

    /**
     * Navigates to the account management interface
     */
    public static void navigateToAccountManagement() {
        accountManagementView.updateFields(user.getEmail(), user.getPassword());
        WLVP.closeOtherWindows();
        accountManagementView.setVisible(true);
    }
    
    /**
     * Hides all related windows
     */
    public static void hideAllWindows() {
        accountCreationView.setVisible(false);
        accountManagementView.setVisible(false);
    }

    
    /**
     * Creates a new report
     *
     * @param type The type of the report
     * @return The newly created report object
     */
    public static Report createReport(ReportType type) {
        return new Report(type);
    }
    
    
    /**
     * Signs the user in
     * @param email The user's email
     * @param password The user's password
     * @return The account associated with the credentials
     */
    public static AbstractUser login(String email, String password) {
        user = null;

        for (Guest guest : WLVP.guestList) {
            if (guest.getEmail().equals(email) && guest.getPassword().equals(password)) {
                user = guest;
            }
        }
        
        for (Employee employee : WLVP.employeeList) {
            if (employee.getEmail().equals(email) && employee.getPassword().equals(password)) {
                user = employee;
            }
        }
        
        return user;
    }
    
    
    /**
     * Signs the user out and returns to the landing page
     */
    public static void logout() {
        navigateToAccountCreation();
    }

    /**
     * @param newEmail The new email
     */
    public static void changeEmail(String newEmail) {
        user.email = newEmail;
    }

    /**
     * @param newPassword The new password
     */
    public static void changePassword(String newPassword) {
        user.password = newPassword;
    }

}
