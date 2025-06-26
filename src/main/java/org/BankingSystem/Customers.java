package org.BankingSystem;

import java.sql.*;

import JavaSwingClasses.UserRegForm;
import org.mindrot.jbcrypt.BCrypt;

import javax.swing.*;


public class Customers {

    private String firstName;
    private String lastName;
    private int idNumber;
    private String email;
    private String phoneNumber;
    private String kraPin;
    private String userName;
    private String passwordHash;

    private String accountNumber;

    String url  = "jdbc:mysql://localhost/Bankdatabase";
    String user = "root";
    String DBpassword = "12345678";



    public void register(UserRegForm regForm){
        firstName = regForm.getFirstName();
        lastName = regForm.getLastName();
        idNumber = regForm.getIdNumber();
        email = regForm.getEmail();
        phoneNumber = regForm.getPhonenumber();
        kraPin = regForm.getKraPin();
        userName = regForm.getUsername();
        passwordHash = regForm.getpasswordHash();

        try{
            Connection conn = DriverManager.getConnection(url,user,DBpassword);
            String query = "INSERT INTO Customer (firstName,lastName,National_id,email,phoneNumber,Kra_Pin,Username,Password_hash) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1,firstName);
            pstmt.setString(2,lastName);
            pstmt.setInt(3,idNumber);
            pstmt.setString(4,email);
            pstmt.setString(5,phoneNumber);
            pstmt.setString(6,kraPin);
            pstmt.setString(7,userName);
            pstmt.setString(8,passwordHash);
            if(passwordHash!=null) {
                pstmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "User : " + userName, "Success", JOptionPane.INFORMATION_MESSAGE);
            }c


        }
        catch(Exception e){

            e.printStackTrace();
        }



    }
    public void createAccount(){

    }
    public void widthrawCash(){

    }
    public void despositCash(){

    }
    public void borrowLoan(){

    }
    public void Login(){

    }
    public void repayLoan(){

    }
    public void freezeAccount(){

    }
    public void checkAccountBalance(){

    }
}
