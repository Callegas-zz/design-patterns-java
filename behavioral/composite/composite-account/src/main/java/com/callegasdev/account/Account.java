package com.callegasdev.account;

import java.util.List;

public class Account {

    private String bank;

    public Account(String bank) {
        this.bank = bank;
    }

    private CompositeServices compositeServices = new CompositeServices();

    public void getServices(){
        for (int i = 0; i < compositeServices.getServices().length; i++) {
            System.out.println(this.bank + " services: " + compositeServices.getServices()[i]);
        }
    }

    public void setServices(List<String> simples, List<String> premiums){
        compositeServices.setServices(simples, premiums);
    }


}
