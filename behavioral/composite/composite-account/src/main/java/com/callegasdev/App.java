package com.callegasdev;

import com.callegasdev.account.Account;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> santanderStandartServices = new ArrayList<>();
        santanderStandartServices.add("Withdrawal");
        santanderStandartServices.add("Deposit");
        santanderStandartServices.add("Overdraft");

        List<String> santanderPremiumServices = new ArrayList<>();
        santanderPremiumServices.add("Loan");
        santanderPremiumServices.add("Credit Health");

        Account santanderAcc = new Account("Santander");
        santanderAcc.setServices(santanderStandartServices, santanderPremiumServices);
        santanderAcc.getServices();


        List<String> bradescoStandartServices = new ArrayList<>();
        bradescoStandartServices.add("Withdrawal");
        bradescoStandartServices.add("Deposit");

        List<String> bradescoPremiumServices = new ArrayList<>();
        bradescoPremiumServices.add("Overdraft");
        bradescoPremiumServices.add("Loan");

        Account bradescoAcc = new Account("Bradesco");
        bradescoAcc.setServices(bradescoStandartServices, bradescoPremiumServices);
        bradescoAcc.getServices();

    }
}
