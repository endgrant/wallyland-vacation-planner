package wlvp.AccountCreation;

import wlvp.IncidentReporting.ReportType;

/**
 * Abstract base class for users
 * @author Grant
 */
public abstract class AbstractUser {
    /**
     * Unique integer identity
     */
    protected int ID;
    
    
    /**
     * Creates a new report
     * @param type The ReportType of the report to be created
     * @return ReportType The newly generated report
     */
    protected ReportType createReport(ReportType type) {
        return null;
    }
}
