package com.adelacebal;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String customerEmail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double fundsToDeposit) {
        this.accountBalance += fundsToDeposit;

        System.out.println("The remaining balance is " + this.accountBalance);
        return this.accountBalance;
    }

    public double withdrawFunds(double fundsToWithdraw) {
        if (this.accountBalance >= fundsToWithdraw) {
            this.accountBalance -= fundsToWithdraw;
            System.out.println("The remaining balance is " + this.accountBalance);
            return this.accountBalance;
        }

        System.out.println("Insufficient funds");
        return this.accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
