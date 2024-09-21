package wlvp;

/**
 * Represents a user-submitted report such as an incident report or service review
 * @author Grant
 */
public class Report {
    /**
     * Unique integer identity
     */
    private int ID;
    
    
    /**
     * The type of this report
     */
    private ReportType type;
    
    
    /**
     * @return ReportType The type of this report object
     */
    public ReportType getReportType() {
        return type;
    }
}
