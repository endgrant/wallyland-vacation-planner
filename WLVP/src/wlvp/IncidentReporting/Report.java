package wlvp.IncidentReporting;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a user-submitted report such as an incident report or service review
 * @author Grant
 */
public class Report {
    /**
     * Stores all reports
     */
    private static List<Report> allReports = new ArrayList<>();
    private String description;
    /**
     * Unique integer identity
     */
    private int ID;
    
    
    /**
     * The type of this report
     */
    private ReportType type;
    
     
    /**
     * Default constructor
     * @param type The ReportType of this report
     */
    public Report(ReportType type) {
        this.type = type;
        this.ID = generateID(); 
        addReport(this);

    }
    
    private static int generateID() {
        return allReports.size() + 1; // Basic incremented ID
    }
    
    /**
     * @return ReportType The type of this report object
     */
    public ReportType getReportType() {
        return type;
    }
    
     /**
     * Adds new Report to list
     */
     private static void addReport(Report report) {
        allReports.add(report);
    }
    
     
     /**
     * @return all reports that have been added to list
     */
    public static List<Report> getAllReports() {
        return allReports;
    }
    public  void addReportDescription(String description){
        this.description = description;
        
    }
    public int getReportID(){
        return this.ID;
    }
    public String getReportDescription(){
        if(this.description.isEmpty()){
            return "No Description";
        }
        else return this.description;
    }
    @Override
    public String toString(){
        return this.ID + " | "+   getReportDescription();
        
    }
}
