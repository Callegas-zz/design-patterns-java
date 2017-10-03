package com.callegasdev.account;

import com.callegasdev.account.services.Services;

import java.util.List;

public class CompositeServices {
    private Services services = new Services();

    public void setServices(List<String> standart, List<String> premiums){
        services.setServices(standart, premiums);
    }

    public String[] getServices(){
        return services.getServices();
    }
}
