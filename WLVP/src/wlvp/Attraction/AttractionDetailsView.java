/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wlvp.Attraction;

import java.awt.Color;
import wlvp.Itinerary.EventSlot;
import wlvp.Itinerary.ItineraryController;

/**
 * @author Daniel
 * @author Grant
 */
public class AttractionDetailsView extends javax.swing.JFrame {
    private Runnable returnMethod;
    
    
    /**
     * Creates new form AttractionDetailsView
     */
    public AttractionDetailsView() {
        initComponents();
        jPanel1.setBackground(Color.decode("#B6DCD4"));
        getContentPane().setBackground(Color.decode("#B6DCD4"));

    }
    
    
    /**
     * Updates the details fields
     */
    public void updateDetailsView() {
        Restaurant test = new Restaurant(123, false, "asdasd", RestaurantType.QuickService);
        if (AttractionController.attraction == null) {
            return;
        }
        
        boolean isOpen = AttractionController.attraction.getStatus();

        if (isOpen) {
            detailStatusTextField.setText("Open");

        } else {
            detailStatusTextField.setText("Closed");
        }

        detailNameTextField.setText(AttractionController.attraction.getName());

    }

    
    /**
     * Assigns the callback method for when the back button is pressed
     * @param method The callback method
     */
    public void setReturnMethod(Runnable method) {
        returnMethod = method;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        detailsNameLabel = new javax.swing.JLabel();
        detailNameTextField = new javax.swing.JTextField();
        detailTypeLabel = new javax.swing.JLabel();
        detailTypeTextField = new javax.swing.JTextField();
        detailStatusLabel = new javax.swing.JLabel();
        detailStatusTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        addToItineraryButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        detailsNameLabel.setText("Name");

        detailNameTextField.setEditable(false);
        detailNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailNameTextFieldActionPerformed(evt);
            }
        });

        detailTypeLabel.setText("Type");

        detailTypeTextField.setEditable(false);

        detailStatusLabel.setText("Status");

        detailStatusTextField.setEditable(false);

        backButton.setBackground(new java.awt.Color(249, 221, 134));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addToItineraryButton.setBackground(new java.awt.Color(249, 221, 134));
        addToItineraryButton.setText("Add to Itinerary");
        addToItineraryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToItineraryButtonActionPerformed(evt);
            }
        });

        toAttractionButton.setBackground(new java.awt.Color(249, 221, 134));
        toAttractionButton.setText("Attractions");
        toAttractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toAttractionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsNameLabel)
                    .addComponent(detailTypeLabel)
                    .addComponent(detailStatusLabel))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detailNameTextField)
                    .addComponent(detailTypeTextField)
                    .addComponent(detailStatusTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addToItineraryButton)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailsNameLabel)
                    .addComponent(detailNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailTypeLabel)
                    .addComponent(detailTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(detailStatusLabel)
                    .addComponent(detailStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addToItineraryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        returnMethod.run(); // Return using whichever navigation method is set
    }//GEN-LAST:event_backButtonActionPerformed
    
    private void addToItineraryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToItineraryButtonActionPerformed

            EventSlot eventToAdd = new EventSlot(AttractionController.attraction);

            ItineraryController.addToItinerary(eventToAdd);

            javax.swing.JOptionPane.showMessageDialog(this, "Event added to itinerary!", "Success", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_addToItineraryButtonActionPerformed

    private void detailNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailNameTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToItineraryButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField detailNameTextField;
    private javax.swing.JLabel detailStatusLabel;
    private javax.swing.JTextField detailStatusTextField;
    private javax.swing.JLabel detailTypeLabel;
    private javax.swing.JTextField detailTypeTextField;
    private javax.swing.JLabel detailsNameLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
