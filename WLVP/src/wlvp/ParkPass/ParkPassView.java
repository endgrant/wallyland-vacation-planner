/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wlvp.ParkPass;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import wlvp.AccountCreation.AccountController;
import wlvp.AccountCreation.Guest;
import wlvp.Attraction.AttractionController;
import wlvp.Itinerary.ItineraryController;

/**
 *
 * @author Daniel
 */
public class ParkPassView extends javax.swing.JFrame {

    /**
     * Creates new form ParkPassView
     */
    public ParkPassView() {
        initComponents();
        getContentPane().setBackground(Color.decode("#B6DCD4"));

    }

    public void parsePass(ParkPass parkPass) {
        availableCreditsTextField.setText(Integer.toString(parkPass.getCredits()));
        DefaultListModel<Guest> model = new DefaultListModel();
        for (Guest guest : parkPass.getGuests()) {
            model.addElement(guest);
        }

        guestListView.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parkPassLabel = new javax.swing.JLabel();
        inviteEmailField = new javax.swing.JTextField();
        removeGuestButton = new javax.swing.JButton();
        toItineraryButton = new javax.swing.JButton();
        toAccountButton = new javax.swing.JButton();
        guestScrollPane = new javax.swing.JScrollPane();
        guestListView = new javax.swing.JList<>();
        availableCreditsTextField = new javax.swing.JTextField();
        guestListLabel = new javax.swing.JLabel();
        availableCreditLabel = new javax.swing.JLabel();
        creditTextField = new javax.swing.JTextField();
        addCreditsButton = new javax.swing.JButton();
        inviteGuestButton = new javax.swing.JButton();
        attractionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(38, 217, 217));

        parkPassLabel.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        parkPassLabel.setText("Welcome!");
        parkPassLabel.setToolTipText("");
        parkPassLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        removeGuestButton.setBackground(new java.awt.Color(249, 221, 134));
        removeGuestButton.setText("Remove");
        removeGuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeGuestButtonActionPerformed(evt);
            }
        });

        toItineraryButton.setBackground(new java.awt.Color(253, 179, 105));
        toItineraryButton.setText("Itinerary");
        toItineraryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toItineraryButtonActionPerformed(evt);
            }
        });

        toAccountButton.setBackground(new java.awt.Color(253, 179, 105));
        toAccountButton.setText("Account");
        toAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toAccountButtonActionPerformed(evt);
            }
        });

        guestListView.setModel(new DefaultListModel<Guest>());
        guestScrollPane.setViewportView(guestListView);

        availableCreditsTextField.setEditable(false);

        guestListLabel.setText("Guests");
        guestListLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        availableCreditLabel.setText("Credits Available");
        availableCreditLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        creditTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        creditTextField.setText("0");
        creditTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditTextFieldActionPerformed(evt);
            }
        });

        addCreditsButton.setBackground(new java.awt.Color(249, 221, 134));
        addCreditsButton.setText("Add Credits");
        addCreditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCreditsButtonActionPerformed(evt);
            }
        });

        inviteGuestButton.setBackground(new java.awt.Color(249, 221, 134));
        inviteGuestButton.setText("Invite");
        inviteGuestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviteGuestButtonActionPerformed(evt);
            }
        });

        attractionButton.setBackground(new java.awt.Color(253, 179, 105));
        attractionButton.setText("Attractions");
        attractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attractionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guestScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inviteEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inviteGuestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeGuestButton, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(availableCreditsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(creditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(parkPassLabel)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(availableCreditLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(guestListLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(toAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(attractionButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toItineraryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addCreditsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toItineraryButton)
                    .addComponent(toAccountButton)
                    .addComponent(attractionButton))
                .addGap(18, 18, 18)
                .addComponent(parkPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availableCreditLabel)
                    .addComponent(addCreditsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availableCreditsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guestListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inviteEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inviteGuestButton)
                    .addComponent(removeGuestButton))
                .addGap(18, 18, 18)
                .addComponent(guestScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toAccountButtonActionPerformed
        AccountController.navigateToAccountManagement();
    }//GEN-LAST:event_toAccountButtonActionPerformed

    private void toItineraryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toItineraryButtonActionPerformed
        ItineraryController.navigateToItinerary();
    }//GEN-LAST:event_toItineraryButtonActionPerformed

    private void removeGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeGuestButtonActionPerformed
        int index = guestListView.getSelectedIndex();
        Guest selectedGuest = guestListView.getModel().getElementAt(index);
        ParkPassController.removeGuest(selectedGuest);

        parsePass(ParkPassController.getParkPass());
    }//GEN-LAST:event_removeGuestButtonActionPerformed

    private void addCreditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCreditsButtonActionPerformed
        try {
            ParkPassController.addCredits(Integer.parseInt(creditTextField.getText()));
        } catch (NumberFormatException ex) {

        }
    }//GEN-LAST:event_addCreditsButtonActionPerformed

    private void inviteGuestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inviteGuestButtonActionPerformed
        boolean success = ParkPassController.inviteGuest(inviteEmailField.getText());

        parsePass(ParkPassController.getParkPass());
    }//GEN-LAST:event_inviteGuestButtonActionPerformed

    private void attractionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attractionButtonActionPerformed
        AttractionController.navigateToAttractionView(ParkPassController::navigateToParkPass);
    }//GEN-LAST:event_attractionButtonActionPerformed

    private void creditTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addCreditsButton;
    private javax.swing.JButton attractionButton;
    private javax.swing.JLabel availableCreditLabel;
    private javax.swing.JTextField availableCreditsTextField;
    private javax.swing.JTextField creditTextField;
    private javax.swing.JLabel guestListLabel;
    private javax.swing.JList<Guest> guestListView;
    private javax.swing.JScrollPane guestScrollPane;
    private javax.swing.JTextField inviteEmailField;
    public javax.swing.JButton inviteGuestButton;
    private javax.swing.JLabel parkPassLabel;
    public javax.swing.JButton removeGuestButton;
    public javax.swing.JButton toAccountButton;
    private javax.swing.JButton toItineraryButton;
    // End of variables declaration//GEN-END:variables
}
