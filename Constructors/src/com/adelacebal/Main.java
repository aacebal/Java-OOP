package com.adelacebal;

public class Main {

    public static void main(String[] args) {
//        BankAccount johnsAccount = new BankAccount();
//        BankAccount adelsAccount = new BankAccount(12341234, 200, "Adel Acebal",
//                                                   "adelito@nomail.com", "555 555 5525");
//        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail.com", "123 123 1234");


//        adelsAccount.setAccountNumber(12341234);
//        adelsAccount.setAccountBalance(200);
//        adelsAccount.setCustomerName("Adel Acebal");
//        adelsAccount.setCustomerEmail("adelito@nomail.com");
//        adelsAccount.setPhoneNumber("555 555 5525");

//        System.out.println(adelsAccount.getAccountBalance());
//        System.out.println(adelsAccount.getCustomerName());
//
//        adelsAccount.depositFunds(100);
//
//        adelsAccount.withdrawFunds(50);
//
//        System.out.println(johnsAccount.getAccountBalance());
//        System.out.println(johnsAccount.getCustomerName());
//
//        johnsAccount.depositFunds(100);
//
//        johnsAccount.withdrawFunds(50);
//
//        System.out.println(timsAccount.getAccountNumber());


        VipCustomer importantCustomer = new VipCustomer();
        System.out.println(importantCustomer.getVipName());
        System.out.println(importantCustomer.getVipEmail());
        System.out.println(importantCustomer.getCreditLimit());

        VipCustomer importantCustomer2 = new VipCustomer("Adel", "aacebal@mail.com");
        System.out.println(importantCustomer2.getVipName());
        System.out.println(importantCustomer2.getVipEmail());
        System.out.println(importantCustomer2.getCreditLimit());


        VipCustomer importantCustomer3 = new VipCustomer("Tim", 1000, "tim@mail.com");
        System.out.println(importantCustomer3.getVipName());
        System.out.println(importantCustomer3.getVipEmail());
        System.out.println(importantCustomer3.getCreditLimit());
    }
}
