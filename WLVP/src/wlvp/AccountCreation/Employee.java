package wlvp.AccountCreation;

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
     * @param type The EmployeeType of this employee
     */
    public Employee(EmployeeType type) {
        this.type = type;
    }
}
