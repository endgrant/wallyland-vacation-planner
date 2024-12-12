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
        WLVP.closeOtherWindows();
        
        if(reportView.reportViewList.isSelectionEmpty()){
            reportView.reportViewList.setSelectedIndex(0);
        }
            
        report = reportView.reportViewList.getSelectedValue();
        reportDetailView.IDDetailTextField.setText(report.getReportID()+"");
        reportDetailView.reportTypeTextField.setText(report.getReportType().toString());
        reportDetailView.reportDetailsText.setText(report.getReportDescription());
        reportDetailView.setVisible(true);
    }
    public static void openNewReportView(){
        WLVP.closeOtherWindows();
       
        newReportView.setVisible(true);
     
    }
    public static void addNewReport(){
        report = new Report(ReportType.Incident);
        if(newReportView.updateRadioButton.isSelected()){
            report.setReportType(ReportType.Update);
            report.addReportDescription(newReportView.reportText.getText());
            
            
        }
        else if(newReportView.feedbackRadioButton.isSelected()){
            report.setReportType(ReportType.Feedback);
            report.addReportDescription(newReportView.reportText.getText());  
        }
        else if(newReportView.incidentRadioButton.isSelected()){
            report.setReportType(ReportType.Incident);
            report.addReportDescription(newReportView.reportText.getText());  
        }
        else{
            newReportView.reportErrorLabel.setText("Must selected a report type before adding a new report");
           
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
        reportListModel.clear();
        for(int i = 0; i < Report.getAllReports().size(); i++){
            reportListModel.add(i,Report.getAllReports().get(i)); 
            
              
            
        }
        
    }
    
    
}
