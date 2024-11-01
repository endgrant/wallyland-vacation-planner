package wlvp.AccountCreation;

import wlvp.IncidentReporting.Report;
import wlvp.IncidentReporting.ReportType;
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
        assert(!initialized);
        
        initialized = true;
        accountCreationView = new AccountCreationView();
        accountCreationView.setSize(600, 600);
        
        initialized = true;
    }
    
    
    /**
     * Checks if the given email is valid
     * @param email
     * @return Returns true if the email is valid
     */
    public static boolean isEmailValid(String email) {
        if (!email.matches("[a-zA-Z0-9_@]+")) { // RegEx for alphanumeric, underscores and at sign
            return false;
        }
        
        // Disallow usernames longer than 16 characters
        if (email.length() > 16) {
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
            if (Character.isLetterOrDigit(c)) {
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
     * @param password
     * @return Returns true if the password is valid
     */
    public static boolean isPasswordValid(String password) {
        if (!password.matches("[a-zA-Z0-9_!&%$#*^()?-]+")) { // RegEx for alphanumeric and certain special characters
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
     * @param type EmployeeType; Leave null when creating a guest user
     * @return The newly created user object
     */
    public static AbstractUser createUser(String email, String password, EmployeeType type) {
        if (type == null) {
            Guest guest = new Guest(nextUserId, email, password);
            nextUserId++;
            user = guest;
            return guest;
        } else {
            Employee employee = new Employee(nextUserId, email, password, type);
            nextUserId++;
            user = employee;
            return employee;
        }
    }
    
    
    /**
     * Navigates to the account creation interface
     */
    public static void navigateToAccountCreation() {
        accountCreationView.setVisible(true);
    }
    
    
    /**
     * Navigates to the account management interface
     */
    public static void navigateToAccountManagement() {
        accountManagementView.setVisible(true);
    }
    
    
    /**
     * Creates a new report
     * @param type The type of the report
     * @return The newly created report object
     */
    public static Report createReport(ReportType type) {
        return new Report(type);
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
    
    
    public static void shareInvite() {
        
    }
}
