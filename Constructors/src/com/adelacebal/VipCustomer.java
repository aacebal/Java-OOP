package com.adelacebal;

public class VipCustomer {

    private String VipName;
    private int creditLimit;
    private String VipEmail;

    public VipCustomer() {
        this("Name", 23, "email");
        System.out.println("Empty constructor");
    }

    public VipCustomer(String vipName, String vipEmail) {
        this(vipEmail,10000, vipEmail);
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
