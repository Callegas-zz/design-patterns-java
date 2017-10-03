package com.callegasdev.account.services;

import java.util.List;

public class Services {
    private StandartServices standartServices = new StandartServices();
    private PremiumServices premiumServices = new PremiumServices();

    public void setServices(List<String> standart, List<String> premiums){
        standartServices.setServices(standart);
        premiumServices.setServices(premiums);
    }

    public String[] getServices(){
        return new String[] {String.valueOf(standartServices.getServices()), String.valueOf(premiumServices.getServices())};
    }
}
