package org.BankingSystem;

public abstract class Account {

    private String accountId;
    private enum accountType{current,savings,loan;}
    private double accountBalance;
    private double overdraftLimit;
    private double interestRate;


}
