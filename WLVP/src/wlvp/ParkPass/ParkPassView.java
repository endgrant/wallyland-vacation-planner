/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wlvp.ParkPass;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parkPassPanel = new javax.swing.JPanel();
        parkPassLabel = new javax.swing.JLabel();
        creditsLabel = new javax.swing.JLabel();
        creditTextField = new javax.swing.JTextField();
        addCreditsButton = new javax.swing.JButton();
        toItineraryButton = new javax.swing.JButton();
        toAccountButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parkPassLabel.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        parkPassLabel.setText("Park Pass");
        parkPassLabel.setToolTipText("");
        parkPassLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        creditsLabel.setText("Credit Amount");

        creditTextField.setText("0.00");

        addCreditsButton.setText("Add Credits");

        toItineraryButton.setText("Itinerary");

        toAccountButton.setText("Account");

        logoutButton.setText("Log Out");

        javax.swing.GroupLayout parkPassPanelLayout = new javax.swing.GroupLayout(parkPassPanel);
        parkPassPanel.setLayout(parkPassPanelLayout);
        parkPassPanelLayout.setHorizontalGroup(
            parkPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parkPassPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(parkPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(parkPassPanelLayout.createSequentialGroup()
                        .addComponent(creditsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(creditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(parkPassPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(logoutButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parkPassPanelLayout.createSequentialGroup()
                        .addComponent(toAccountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parkPassLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(parkPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCreditsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toItineraryButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        parkPassPanelLayout.setVerticalGroup(
            parkPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parkPassPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parkPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parkPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toAccountButton)
                    .addComponent(toItineraryButton))
                .addGap(25, 25, 25)
                .addGroup(parkPassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditsLabel)
                    .addComponent(creditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCreditsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parkPassPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parkPassPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addCreditsButton;
    private javax.swing.JTextField creditTextField;
    private javax.swing.JLabel creditsLabel;
    public javax.swing.JButton logoutButton;
    private javax.swing.JLabel parkPassLabel;
    private javax.swing.JPanel parkPassPanel;
    public javax.swing.JButton toAccountButton;
    private javax.swing.JButton toItineraryButton;
    // End of variables declaration//GEN-END:variables
}
