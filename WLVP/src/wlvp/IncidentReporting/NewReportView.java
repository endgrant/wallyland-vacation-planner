/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wlvp.IncidentReporting;

import java.awt.Color;
import javax.swing.ButtonGroup;

/**
 *
 * @author Daniel
 */
public class NewReportView extends javax.swing.JFrame {

    /**
     * Creates new form NewIncidentView
     */
    public NewReportView() {
        initComponents();
        addButtonsToGroup();
        getContentPane().setBackground(Color.decode("#B6DCD4"));
    }
    
    
    public void addButtonsToGroup(){
        buttonGroup1.add(updateRadioButton);
        buttonGroup1.add(feedbackRadioButton);
        buttonGroup1.add(incidentRadioButton);
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        reportTypeLabel = new javax.swing.JLabel();
        incidentRadioButton = new javax.swing.JRadioButton();
        feedbackRadioButton = new javax.swing.JRadioButton();
        updateRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        reportErrorLabel = new javax.swing.JLabel();
        addReportButton = new javax.swing.JButton();
        newReportExitWithoutSavingButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        reportTypeLabel.setText("Report Type: ");

        incidentRadioButton.setText("Incident");

        feedbackRadioButton.setText("Feedback");

        updateRadioButton.setText("Update");

        reportText.setColumns(20);
        reportText.setRows(5);
        jScrollPane1.setViewportView(reportText);

        jLabel1.setText("Report:");

        addReportButton.setBackground(new java.awt.Color(249, 221, 134));
        addReportButton.setText("Add Report");
        addReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReportButtonActionPerformed(evt);
            }
        });

        newReportExitWithoutSavingButton.setBackground(new java.awt.Color(249, 221, 134));
        newReportExitWithoutSavingButton.setText("Back");
        newReportExitWithoutSavingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReportExitWithoutSavingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(reportErrorLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(reportTypeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(incidentRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(feedbackRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(updateRadioButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newReportExitWithoutSavingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addReportButton))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportTypeLabel)
                    .addComponent(incidentRadioButton)
                    .addComponent(feedbackRadioButton)
                    .addComponent(updateRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addReportButton)
                .addGap(18, 18, 18)
                .addComponent(newReportExitWithoutSavingButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, 5, -1, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newReportExitWithoutSavingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReportExitWithoutSavingButtonActionPerformed
       this.setVisible(false);
       ReportController.navigateToReportsView();
    }//GEN-LAST:event_newReportExitWithoutSavingButtonActionPerformed

    private void addReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addReportButtonActionPerformed
       this.setVisible(false);
       ReportController.addNewReport();
       ReportController.populateListModel();
       ReportController.navigateToReportsView();
       
    }//GEN-LAST:event_addReportButtonActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addReportButton;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JRadioButton feedbackRadioButton;
    public javax.swing.JRadioButton incidentRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton newReportExitWithoutSavingButton;
    public javax.swing.JLabel reportErrorLabel;
    public javax.swing.JTextArea reportText;
    private javax.swing.JLabel reportTypeLabel;
    public javax.swing.JRadioButton updateRadioButton;
    // End of variables declaration//GEN-END:variables
}
