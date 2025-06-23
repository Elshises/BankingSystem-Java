package org.BankingSystem;

import java.util.Date;

public class AtmMachine {
    private int atmId;
    private String atmLocation;
    private String branchId ;
    private enum status {
        active, inactive, maintenance, out_of_service, low_cash, offline, decomissioned,reloading
    }
    private double maxCashCapacity;
    private double currentCash;
    private Date lastMaintained;
    private enum networkType{
        Vpn,LAN,FourG
    }
    private String IPv4Address;
    private String IPv6Address;
    private String softwareVersion;
    private String serialNumber;


    public void maintainAtm(){


    }
    public void getTransactionLog(){

    }
    public void getCashLevel(){

    }
    public void loadCash(){

    }
    public void insertCard(){

    }
    public void authenticateUse(){

    }
    public void checkBalance(){


    }
    public void printReceipt(){

    }
    public void ejectCard(){

    }


}
