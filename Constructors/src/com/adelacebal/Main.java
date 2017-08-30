package com.adelacebal;

public class Main {

    public static void main(String[] args) {
        BankAccount adelsAccount = new BankAccount(12341234, 200, "Adel Acebal", "adelito@nomail.com", "555 555 5525");


//        adelsAccount.setAccountNumber(12341234);
//        adelsAccount.setAccountBalance(200);
//        adelsAccount.setCustomerName("Adel Acebal");
//        adelsAccount.setCustomerEmail("adelito@nomail.com");
//        adelsAccount.setPhoneNumber("555 555 5525");

        adelsAccount.depositFunds(100);

        adelsAccount.withdrawFunds(50);
    }
}
