package com.payments.service;

import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import com.payments.config.DroolsConfig;
import com.payments.model.Customer;
@Service
public class CustomerService {


    private KieSession kieSession=new DroolsConfig().getKieSession();

    public Customer insertCustomer(Customer customer){
        kieSession.insert(customer);
        kieSession.fireAllRules();
        return  customer;

    }

}
