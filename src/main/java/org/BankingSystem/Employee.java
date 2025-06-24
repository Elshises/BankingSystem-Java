package org.BankingSystem;

public abstract class Employee {

protected String nationalId;
protected String staffNumber;
protected String firstName;
protected String lastName;
protected String email;
protected String phoneNUmber;
protected enum gender{
        male,female,other;
}
protected String userName;
protected String passwordHash;
protected enum employeeStatus{
    Active,Inactive,Suspended;
}
protected enum employeeRole{

    //Top Level Management
        CEO,
        CFO,
        COO,
        CIO,

        // Middle Management
        Branch_Manager,
                Operations_Manager,
                Credit_Manager,
                Relationship_Manager,
                Loan_Officer,

    // Clerical and Front-Line Staff
        Customer_Service_Representative,
                Bank_Teller,
                Data_Entry_Clerk,
                Accounts_Clerk,

    // Specialized Officers
        IT_Officer,
                System_Administrator,
                Internal_Auditor,
                Compliance_Officer,
                Risk_Manager,
                Treasury_Officer,

    // Security and Support Staff
        Security_Officer,
                Messenger,
                Cleaner,

    //Back Office and Support Roles
        HR_Officer,
                Legal_Officer,
                Marketing_Officer
}












}
