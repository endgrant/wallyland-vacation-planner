/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wlvp.ParkPass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Daniel
 */
public class ParkPassView extends javax.swing.JFrame implements ActionListener {
    private static ParkPassController parkPassController;
    /**
     * Creates new form ParkPassView
     */
    public ParkPassView() {
        
        initComponents();
        
        parsePass(parkPassController.getParkPass());
        
        
    }
    public void parsePass(ParkPass parkPass){
        
        availableCreditsTextField.setText(parkPass.getCredits()+ "");
        
        
    }
      public void AddActionListeners(){
        addCreditsButton.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == addCreditsButton){
            int amount = Integer.parseInt(creditTextField.getText());
            parkPassController.addCredits(amount);
            
        }
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
        viewUserList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        guestListView = new javax.swing.JList<>();
        availableCreditsTextField = new javax.swing.JTextField();
        availableCreditLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parkPassPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        parkPassLabel.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        parkPassLabel.setText("Park Pass");
        parkPassLabel.setToolTipText("");
        parkPassLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        parkPassPanel.add(parkPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 20));

        creditsLabel.setText("Credit Amount");
        parkPassPanel.add(creditsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        creditTextField.setText("0.00");
        parkPassPanel.add(creditTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        addCreditsButton.setText("Add Credits");
        parkPassPanel.add(addCreditsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 108, -1));

        toItineraryButton.setText("Itinerary");
        parkPassPanel.add(toItineraryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 6, 92, -1));

        toAccountButton.setText("Account");
        parkPassPanel.add(toAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));

        viewUserList.setText("Refresh");
        parkPassPanel.add(viewUserList, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 387, -1, -1));

        guestListView.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(guestListView);

        parkPassPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 153, 288, 228));
        parkPassPanel.add(availableCreditsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 100, -1));

        availableCreditLabel.setText("Credits Available");
        parkPassPanel.add(availableCreditLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

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
    private javax.swing.JLabel availableCreditLabel;
    private javax.swing.JTextField availableCreditsTextField;
    private javax.swing.JTextField creditTextField;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JList<String> guestListView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel parkPassLabel;
    private javax.swing.JPanel parkPassPanel;
    public javax.swing.JButton toAccountButton;
    private javax.swing.JButton toItineraryButton;
    public javax.swing.JButton viewUserList;
    // End of variables declaration//GEN-END:variables
}
