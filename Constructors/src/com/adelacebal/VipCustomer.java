package com.adelacebal;

public class VipCustomer {

    private String VipName;
    private int creditLimit;
    private String VipEmail;

    public VipCustomer() {
        this("Defaul Name", 100, "defaultemail@email.com");
        System.out.println("Empty constructor");
    }

    public VipCustomer(String vipName, String vipEmail) {
        this(vipName,1000000, vipEmail);
    }

    public VipCustomer(String vipName, int creditLimit, String vipEmail) {
        this.VipName = vipName;
        this.creditLimit = creditLimit;
        this.VipEmail = vipEmail;
    }

    public String getVipName() {
        return VipName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getVipEmail() {
        return VipEmail;
    }
}
