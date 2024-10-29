package wlvp.AccountCreation;

import java.util.List;
import wlvp.Attraction.AbstractAttraction;
import wlvp.IncidentReporting.Report;
import static wlvp.IncidentReporting.Report.getAllReports;

/**
 * Park employee class
 * @author Grant
 */
public class Employee extends AbstractUser {
    /**
     * The EmployeeType of this employee
     */
    private EmployeeType type;
    
    
    /**
     * Default constructor
     * @param id
     * @param username
     * @param email
     * @param password
     * @param type The EmployeeType of this employee
     */
    public Employee(int id, String username, String email, String password, EmployeeType type) {
        this.ID = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.type = type;
    }
    
  
     public List <Report> viewReports() {
         return getAllReports(); 
    }

    public void updateAttractions(AbstractAttraction attraction, boolean newStatus) {
        attraction.setStatus(newStatus);
       }
    }

