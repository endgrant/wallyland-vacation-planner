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
    private final EmployeeType type;
    
    
    /**
     * Default constructor
     * @param id
     * @param email
     * @param password
     * @param type The EmployeeType of this employee
     */
    public Employee(int id, String email, String password, EmployeeType type) {
        this.ID = id;
        this.email = email;
        this.password = password;
        this.type = type;
    }
    
  
    /**
     * @return The type of this employee
     */
    public EmployeeType getType() {
        return type;
    }
    
    
    public List <Report> viewReports() {
         return getAllReports(); 
    }

    public void updateAttractions(AbstractAttraction attraction, boolean newStatus) {
        attraction.setStatus(newStatus);
       }
    }

