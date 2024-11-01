package wlvp.AccountCreation;

import wlvp.IncidentReporting.ReportType;

/**
 * Abstract base class for users
 * @author Grant
 */
public abstract class AbstractUser {
   String email;
   String password;

   
    /**
     * Unique integer identity
     */
    protected int ID;
    
    public int getID(){ 
        return ID;
    }
    
    public void setID(int ID){ 
        this.ID = ID;        
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    /**
     * Creates a new report
     * @param type The ReportType of the report to be created
     * @return ReportType The newly generated report
     */
    protected ReportType createReport(ReportType type) {
        return null;
    }  
    
    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", email='" + email + '\'' +
                '}';
    }
}

