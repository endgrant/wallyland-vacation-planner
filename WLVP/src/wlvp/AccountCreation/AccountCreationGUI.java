/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wlvp.AccountCreation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import wlvp.IncidentReporting.ReportType;

// Main GUI class
public class AccountCreationGUI extends JFrame {
    private JTextField usernameField;
    private JComboBox<EmployeeType> employeeTypeComboBox;
    private JButton createGuestButton, createEmployeeButton, viewParkPassButton, createReportButton;

    public AccountCreationGUI() {
        setTitle("Account Creation View");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        showAccountCreationScreen();
    }

    private void showAccountCreationScreen() {
        // Clear the frame
        getContentPane().removeAll();
        repaint();

        // Account Creation Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1, 10, 10));

        JLabel titleLabel = new JLabel("Create Account", JLabel.CENTER);
        titleLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
        panel.add(titleLabel);

        // Username field for creating Guest or Employee account
        usernameField = new JTextField();
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);

        // EmployeeType dropdown for creating Employee accounts
        employeeTypeComboBox = new JComboBox<>(EmployeeType.values());
        panel.add(new JLabel("Employee Type (for Employees only):"));
        panel.add(employeeTypeComboBox);

        // Buttons for creating different user types
        createGuestButton = new JButton("Create Guest");
        createGuestButton.addActionListener(e -> createGuest());
        panel.add(createGuestButton);

        createEmployeeButton = new JButton("Create Employee");
        createEmployeeButton.addActionListener(e -> createEmployee());
        panel.add(createEmployeeButton);

        add(panel);
        revalidate();
        repaint();
    }

    private void showGuestDashboard(Guest guest) {
        // Clear the frame
        getContentPane().removeAll();
        repaint();

        // Guest Dashboard Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JLabel welcomeLabel = new JLabel("Welcome, Guest User!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel.add(welcomeLabel);

        // View ParkPass Button
        viewParkPassButton = new JButton("View Park Pass");
        viewParkPassButton.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Park Pass Details: " + (guest.getParkPass() != null ? guest.getParkPass() : "No Park Pass Assigned")));
        panel.add(viewParkPassButton);

        // Create Report Button for Guest
        createReportButton = new JButton("Create Report");
        createReportButton.addActionListener(e -> createReport(new Guest(0, "testguest", "test@example.com", "testpass")));
        panel.add(createReportButton);

        // Back to Account Creation Screen
        JButton backButton = new JButton("Back to Account Creation");
        backButton.addActionListener(e -> showAccountCreationScreen());
        panel.add(backButton);

        add(panel);
        revalidate();
        repaint();
    }

    private void showEmployeeDashboard(Employee employee) {
        // Clear the frame
        getContentPane().removeAll();
        repaint();

        // Employee Dashboard Layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        JLabel welcomeLabel = new JLabel("Welcome, Employee User!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel.add(welcomeLabel);

        // Employee Type
        JLabel employeeTypeLabel = new JLabel("Employee Type: " + employee.getType(), JLabel.CENTER);
        panel.add(employeeTypeLabel);

        // Create Report Button for Employee
        createReportButton = new JButton("Create Report");
        createReportButton.addActionListener(e -> createReport(employee));
        panel.add(createReportButton);

        // Back to Account Creation Screen
        JButton backButton = new JButton("Back to Account Creation");
        backButton.addActionListener(e -> showAccountCreationScreen());
        panel.add(backButton);

        add(panel);
        revalidate();
        repaint();
    }

    private void createGuest() {
        Guest guest = new Guest(0, "testguest", "test@example.com", "testpass");
        JOptionPane.showMessageDialog(this, "Guest account created successfully!");
        showGuestDashboard(guest);
    }

    private void createEmployee() {
        EmployeeType selectedType = (EmployeeType) employeeTypeComboBox.getSelectedItem();
        Employee employee = new Employee(0, "testemployee", "test@example.com", "testpass", selectedType);
        JOptionPane.showMessageDialog(this, "Employee account created successfully!");
        showEmployeeDashboard(employee);
    }

    private void createReport(AbstractUser user) {
        // Placeholder: Simulate creating a report of a specific type
        ReportType reportType = ReportType.Incident; // Example ReportType, replace with actual enum values
        user.createReport(reportType);
        JOptionPane.showMessageDialog(this, "Report created successfully for type: " + reportType);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AccountCreationGUI app = new AccountCreationGUI();
            app.setVisible(true);
        });
    }
}