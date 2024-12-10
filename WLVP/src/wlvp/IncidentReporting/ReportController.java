/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp.IncidentReporting;

import javax.swing.DefaultListModel;
import wlvp.WLVP;

/**
 *
 * @author Daniel
 */
public class ReportController {
    private static boolean initialized = false;
    public static ReportDetailView reportDetailView;
    public static IncidentReportsView reportView;
    public static NewReportView newReportView;
    public static Report report;
    public static DefaultListModel<Report> reportListModel = new DefaultListModel<>();
    
    public static void initialize(){
        assert(!initialized);

        initialized = true;
        
        populateReportList();
        populateListModel();
        
        
        reportDetailView = new ReportDetailView();
        
        reportView = new IncidentReportsView();
        
        newReportView = new NewReportView(); 
    }
    
    
    /**
     * Navigates to the IncidentReportsView
     */
    public static void navigateToReportsView() {
        WLVP.closeOtherWindows();
        reportView.setVisible(true);
    }
    
    
    public static void openReportDetailView(){
        report =  reportView.reportViewList.getSelectedValue();
        reportDetailView.reportTypeTextField.setText(report.getReportID()+"");
        reportDetailView.reportDetailsText.setText(report.getReportDescription());
    }
    public static void openNewReportView(){
        newReportView.setVisible(true);
        
    }
    public static void addNewReport(){
        if(newReportView.getButtonGroup1().getSelection().equals(newReportView.incidentRadioButton)){
            Report nr = new Report(ReportType.Incident);
        }
        if(newReportView.getButtonGroup1().getSelection().equals(newReportView.feedbackRadioButton)){
            Report nr = new Report(ReportType.Feedback);
        }
        if(newReportView.getButtonGroup1().getSelection().equals(newReportView.updateRadioButton)){
            Report nr = new Report(ReportType.Update);
        }
        else{
            newReportView.reportErrorLabel.setText("Must selected a report type before adding report");
        }
        
            
        
    }
    public static void populateReportList(){
        Report r1 = new Report(ReportType.Feedback);
        r1.addReportDescription("What a great ride!");
        Report r2 = new Report(ReportType.Incident);
        r2.addReportDescription("Clean up on aisle 12 ");
        Report r3 = new Report(ReportType.Update);
        r3.addReportDescription("Aisle 12 has been cleaned up");
        
    }
    
    public static void populateListModel(){
        
        for(int i = 0; i < report.getAllReports().size(); i++){
            reportListModel.add(i, report);     
        }
    }
    
    
}
