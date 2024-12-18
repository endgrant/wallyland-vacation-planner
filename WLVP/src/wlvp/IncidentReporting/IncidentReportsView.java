/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wlvp.IncidentReporting;

import wlvp.AccountCreation.AccountController;

/**
 *
 * @author alanb
 */
public class IncidentReportsView extends javax.swing.JFrame {

    /**
     * Creates new form IncidentReportsView
     */
    public IncidentReportsView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        createNewButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportViewList = new javax.swing.JList<>();
        IncidentReportLabel = new javax.swing.JLabel();
        reviewDetailsButton = new javax.swing.JButton();
        reportBackButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        createNewButton.setBackground(new java.awt.Color(249, 221, 134));
        createNewButton.setText("Create New Report");
        createNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewButtonActionPerformed(evt);
            }
        });

        reportViewList.setModel(ReportController.reportListModel);
        jScrollPane2.setViewportView(reportViewList);

        IncidentReportLabel.setText("INCIDENT REPORTS");

        reviewDetailsButton.setBackground(new java.awt.Color(249, 221, 134));
        reviewDetailsButton.setText("View Report Details");
        reviewDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewDetailsButtonActionPerformed(evt);
            }
        });

        reportBackButton.setBackground(new java.awt.Color(249, 221, 134));
        reportBackButton.setText("Log out");
        reportBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reportBackButton)
                                .addGap(34, 34, 34)
                                .addComponent(IncidentReportLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reviewDetailsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(createNewButton)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IncidentReportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportBackButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewButton)
                    .addComponent(reviewDetailsButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewButtonActionPerformed
        this.setVisible(false);
        ReportController.openNewReportView();
        
    }//GEN-LAST:event_createNewButtonActionPerformed

    private void reportBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBackButtonActionPerformed
        this.setVisible(false);
        AccountController.navigateToAccountCreation();
    }//GEN-LAST:event_reportBackButtonActionPerformed

    private void reviewDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewDetailsButtonActionPerformed
        this.setVisible(false);
        ReportController.openReportDetailView();
    }//GEN-LAST:event_reviewDetailsButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IncidentReportLabel;
    private javax.swing.JButton createNewButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JButton reportBackButton;
    public javax.swing.JList<Report> reportViewList;
    private javax.swing.JButton reviewDetailsButton;
    // End of variables declaration//GEN-END:variables
}
