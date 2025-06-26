package JavaSwingClasses;
import org.BankingSystem.Customers;
import org.mindrot.jbcrypt.BCrypt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    public class UserRegForm extends JFrame {

        private JTextField firstNameField, lastNameField, idNumberField, emailField,
                phoneNumberField, kraPinField, userNameField;
        private JPasswordField passwordField, confirmPasswordField;


        private String firstName;
        private String lastName;
        private int idNumber;
        private String email;
        private String phoneNumber;
        private String kraPin;
        private String userName;
        private String passwordHash;


        public UserRegForm() {
            setTitle("User Registration");
            setSize(400, 500);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel(new GridLayout(10, 2, 5, 5));
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            // Add labels and fields
            panel.add(new JLabel("First Name:"));
            firstNameField = new JTextField();
            panel.add(firstNameField);

            panel.add(new JLabel("Last Name:"));
            lastNameField = new JTextField();
            panel.add(lastNameField);

            panel.add(new JLabel("ID Number:"));
            idNumberField = new JTextField();
            panel.add(idNumberField);

            panel.add(new JLabel("Email:"));
            emailField = new JTextField();
            panel.add(emailField);

            panel.add(new JLabel("Phone Number:"));
            phoneNumberField = new JTextField();
            panel.add(phoneNumberField);

            panel.add(new JLabel("KRA Pin:"));
            kraPinField = new JTextField();
            panel.add(kraPinField);

            panel.add(new JLabel("Username:"));
            userNameField = new JTextField();
            panel.add(userNameField);

            panel.add(new JLabel("Password:"));
            passwordField = new JPasswordField();
            panel.add(passwordField);

            panel.add(new JLabel("Confirm Password:"));
            confirmPasswordField = new JPasswordField();
            panel.add(confirmPasswordField);

            JButton registerButton = new JButton("Register");
            panel.add(registerButton);

            JButton clearButton = new JButton("Clear");
            panel.add(clearButton);

            add(panel);
            setVisible(true);

            // Button logic
            registerButton.addActionListener(e -> {
                pushValues();
                new Customers().register(this);

            });

            clearButton.addActionListener(e -> clearForm());
        }



        public void pushValues(){

            firstName = firstNameField.getText();
            lastName = lastNameField.getText();
            email = emailField.getText();
            idNumber = Integer.parseInt( idNumberField.getText());
            phoneNumber = phoneNumberField.getText();
            kraPin = kraPinField.getText();
            userName = userNameField.getText();

            String password1 = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());
            if (!password1.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            passwordHash = BCrypt.hashpw(password1,BCrypt.gensalt());
            JOptionPane.showMessageDialog(this, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }

        private void clearForm() {
            firstNameField.setText("");
            lastNameField.setText("");
            idNumberField.setText("");
            emailField.setText("");
            phoneNumberField.setText("");
            kraPinField.setText("");
            userNameField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
        }

        public String getFirstName(){
            return this.firstName;
        }
        public String getLastName(){
            return this.lastName;
        }
        public  int getIdNumber(){
            return this.idNumber;
        }
        public String  getEmail(){
            return this.email;
        }
        public String getPhonenumber(){
            return this.phoneNumber;
        }
        public String getKraPin(){
            return this.kraPin;
        }
        public String getUsername(){
            return this.userName;
        }
        public String getpasswordHash(){
            return this.passwordHash;
        }


        public static void main(String[] args) {
            SwingUtilities.invokeLater(UserRegForm::new);
        }
    }









