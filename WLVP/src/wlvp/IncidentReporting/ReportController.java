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
        boolean hasDescription = false;
        
        if(!newReportView.reportText.getText().isBlank()){
            hasDescription = true;
            
        }
        
        
        
        
        if(newReportView.getButtonGroup1().getSelection().isSelected()){
            Report nr = new Report(ReportType.Incident);
           
            if(hasDescription){
                nr.addReportDescription(newReportView.reportText.getText());
            }
            
        }
        else if(newReportView.getButtonGroup1().getSelection().isSelected()){
            Report nr = new Report(ReportType.Feedback);
            
            if(hasDescription){
                nr.addReportDescription(newReportView.reportText.getText());
            }
            report = nr;
        }
        else if(newReportView.getButtonGroup1().getSelection().isSelected()){
            Report nr = new Report(ReportType.Update);
             
            if(hasDescription){
                nr.addReportDescription(newReportView.reportText.getText());
            }
            report = nr;
        }
        else{
            newReportView.reportErrorLabel.setText("Must selected a report type before adding a new report");
           
        }
        System.out.println(Report.getAllReports().toString());
        
        
            
        
    }
    public static void populateReportList(){
        Report r1 = new Report(ReportType.Feedback);
        r1.addReportDescription("What a great ride!");
        report = r1;
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
