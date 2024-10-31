package wlvp.AccountCreation;

import wlvp.IncidentReporting.Report;
import wlvp.IncidentReporting.ReportType;
import wlvp.WLVP;

/**
 * @author Grant
 */
public class AccountController {
    private int nextUserId = 0;
    
    
    /**
     * Checks if the given username is valid
     * @param username
     * @return Returns true if the username is valid
     */
    public static boolean isUsernameValid(String username) {
        if (!username.matches("[a-zA-Z0-9_]+")) { // RegEx for alphanumeric and underscores
            return false;
        }
        
        // Disallow usernames longer than 16 characters
        if (username.length() > 16) {
            return false;
        }
        
        // Check if there are at least 3 alphanumeric characters
        int count = 0;
        for (char c : username.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                count++;
            }
        }
        
        return count >= 3;
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
     * @param username
     * @param email
     * @param password
     * @param type EmployeeType; Leave null when creating a guest user
     * @return The newly created user object
     */
    public AbstractUser createUser(String username, String email, String password, EmployeeType type) {
        if (type == null) {
            Guest guest = new Guest(nextUserId, username, email, password);
            nextUserId++;
            return guest;
        } else {
            Employee employee = new Employee(nextUserId, username, email, password, type);
            nextUserId++;
            return employee;
        }
    }
    
    
    /**
     * Navigates to the park pass interface
     */
    public void navigateToParkPass() {
        WLVP.accountView.setVisible(false);
        WLVP.passView.setVisible(true);
    }
    
    
    /**
     * Creates a new report
     * @param type The type of the report
     * @return The newly created report object
     */
    public Report createReport(ReportType type) {
        return new Report(type);
    }
    
    
    /**
     * Signs the user out and returns to the landing page
     */
    public void logout() {
        
    }
}
