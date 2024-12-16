/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wlvp.Attraction;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import wlvp.ParkPass.ParkPassController;

/**
 * @author Daniel
 * @author Grant
 */
public class AttractionView extends javax.swing.JFrame{
    private Runnable returnMethod = ParkPassController::navigateToParkPass;
    public static DefaultListModel<AbstractAttraction> rideListModel = new DefaultListModel<>();
    public static DefaultListModel<AbstractAttraction> restaurantListModel = new DefaultListModel<>();
    public static ArrayList<AbstractAttraction> attractionList = new ArrayList<>();

    
    public AttractionView() {        
        updateListModels();
        initComponents();
        jPanel1.setBackground(Color.decode("#B6DCD4"));
        getContentPane().setBackground(Color.decode("#B6DCD4"));

    }
    
    
    /**
     * Updates the attraction lists
     */

    public static void updateListModels() {
        rideListModel = AttractionController.getRideListModel();
        restaurantListModel = AttractionController.getRestaurantListModel();
        attractionList = AttractionController.attractionList;
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
        rideListLabel = new javax.swing.JLabel();
        restaurantListLabel = new javax.swing.JLabel();
        rideScrollPane = new javax.swing.JScrollPane();
        rideList = new javax.swing.JList<>();
        restaurantScrollPane = new javax.swing.JScrollPane();
        restaurantList = new javax.swing.JList<>();
        attractionLabel = new javax.swing.JLabel();
        showDetailsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        rideListLabel.setText("Rides");

        restaurantListLabel.setText("Restaurants");

        rideList.setModel(rideListModel);
        rideList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                rideListValueChanged(evt);
            }
        });
        rideScrollPane.setViewportView(rideList);

        restaurantList.setModel(restaurantListModel);
        restaurantList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                restaurantListValueChanged(evt);
            }
        });
        restaurantScrollPane.setViewportView(restaurantList);

        attractionLabel.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        attractionLabel.setText("Attractions");

        showDetailsButton.setBackground(new java.awt.Color(249, 221, 134));
        showDetailsButton.setText("Show Details");
        showDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDetailsButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(249, 221, 134));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rideScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rideListLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(restaurantListLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(restaurantScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addGap(46, 46, 46))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(showDetailsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(attractionLabel)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(attractionLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rideListLabel)
                    .addComponent(restaurantListLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rideScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(restaurantScrollPane))
                .addGap(18, 18, 18)
                .addComponent(showDetailsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void showDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDetailsButtonActionPerformed

        if (!rideList.isSelectionEmpty()) {
            AttractionController.attraction = rideList.getSelectedValue();
        } else if (!restaurantList.isSelectionEmpty()) {
            AttractionController.attraction = restaurantList.getSelectedValue();
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Please select an attraction to view details.",
                    "No Selection",
                    javax.swing.JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        AttractionController.navigateToAttractionDetailsView(AttractionController::navigateToAttractionView, AttractionController.attraction);

    }//GEN-LAST:event_showDetailsButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        returnMethod.run(); // Return using whichever navigation method is set
    }//GEN-LAST:event_backButtonActionPerformed

    private void rideListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_rideListValueChanged
        if (!restaurantList.getValueIsAdjusting() && !restaurantList.isSelectionEmpty()) {
            restaurantList.clearSelection();
        }
    }//GEN-LAST:event_rideListValueChanged

    private void restaurantListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_restaurantListValueChanged
        if (!rideList.getValueIsAdjusting() && !rideList.isSelectionEmpty()) {
            rideList.clearSelection();
        }
    }//GEN-LAST:event_restaurantListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attractionLabel;
    public javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JList<AbstractAttraction> restaurantList;
    private javax.swing.JLabel restaurantListLabel;
    private javax.swing.JScrollPane restaurantScrollPane;
    private javax.swing.JList<AbstractAttraction> rideList;
    private javax.swing.JLabel rideListLabel;
    private javax.swing.JScrollPane rideScrollPane;
    public javax.swing.JButton showDetailsButton;
    // End of variables declaration//GEN-END:variables

}
