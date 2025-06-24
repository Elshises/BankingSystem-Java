package org.BankingSystem;

import java.util.Date;

public class Loan {

    private int loanId;
    private int customerId;
    private String accountId;
    private enum loanType{ personal,mortgage,auto,student,business;}
    private double amount;
    private double interestRate;
    private int termMonths;
    private Date issueDate;
    private Date dueDate;
    private enum loanStatus{active,closed,defaulted,pending;}
    private double monthlyPayment;
    private double balanceRemaining;
    private Date createdAt;
    private Date updatedAt;


}
