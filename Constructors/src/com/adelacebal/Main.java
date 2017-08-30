package com.adelacebal;

public class Main {

    public static void main(String[] args) {
        BankAccount adelsAccount = new BankAccount();

        adelsAccount.depositFunds(100);

        adelsAccount.withdrawFunds(50);
    }
}
