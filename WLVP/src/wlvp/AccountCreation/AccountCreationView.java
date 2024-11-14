package wlvp.AccountCreation;

import javax.swing.JOptionPane;
import wlvp.ParkPass.ParkPassController;

/**
 *
 * @author alanb
 */
public class AccountCreationView extends javax.swing.JFrame {

    /**
     * Creates new form AccountCreationView
     */
    public AccountCreationView() {
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

        accountLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        createNewAcctButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        accountLabel.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        accountLabel.setText("Account Login");

        emailTextField.setText("Enter Email ID");
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        passwordLabel.setText("Password");

        passwordTextField.setText("Enter Password");
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        createNewAcctButton.setText("Create New");
        createNewAcctButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewAcctButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        titleLabel.setText("WELCOME TO WLVP!");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Log In");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createNewAcctButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton)
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel)
                            .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewAcctButton)
                    .addComponent(logoutButton))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        String email = emailTextField.getText();
    if (AccountController.isEmailValid(email)) {
        JOptionPane.showMessageDialog(this, "Email is valid.");
    } else {
        JOptionPane.showMessageDialog(this, "Invalid email format. Please try again.");
    }
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
       String password = passwordTextField.getText();
    if (AccountController.isPasswordValid(password)) {
        JOptionPane.showMessageDialog(this, "Password is valid.");
    } else {
        JOptionPane.showMessageDialog(this, "Invalid password. Password must be 8-24 characters and contain at least 3 alphanumeric characters.");
    }
    }//GEN-LAST:event_passwordTextFieldActionPerformed

<<<<<<< HEAD
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String email = jTextField1.getText();
        String password = jTextField3.getText();

        // Validate email and password before creating the user
        if (AccountController.isEmailValid(email) && AccountController.isPasswordValid(password)) {
            AccountController.createGuest(email, password); // Assuming this is a guest user (type null)
            ParkPassController.navigateToParkPass();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email or password format. Please try again.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
=======
    private void createNewAcctButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewAcctButtonActionPerformed
      String email = emailTextField.getText();
    String password = passwordTextField.getText();

    // Validate email and password before creating the user
    if (AccountController.isEmailValid(email) && AccountController.isPasswordValid(password)) {
        AccountController.createUser(email, password, null); // Assuming this is a guest user (type null)
        AccountController.navigateToAccountManagement();
    } else {
        JOptionPane.showMessageDialog(this, "Invalid email or password format. Please try again.");
    }
    }//GEN-LAST:event_createNewAcctButtonActionPerformed
>>>>>>> alan

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
     AccountController.logout();
      navigateToAccountCreation();
    JOptionPane.showMessageDialog(this, "You have logged out successfully.");
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLabel;
    private javax.swing.JButton createNewAcctButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}