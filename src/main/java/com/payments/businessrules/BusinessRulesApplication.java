package com.payments.businessrules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.payments.model.Customer;
import com.payments.service.CustomerService;

@SpringBootApplication
@ComponentScan({"com.payments"})
@EntityScan("com.payments")
public class BusinessRulesApplication  implements CommandLineRunner {
	

@Autowired
CustomerService service;

	public static void main(String[] args) {
		SpringApplication.run(BusinessRulesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	    Customer customer1 = new Customer("Frank");
	    customer1.setAge(4);
	    
	    Customer customer2 = new Customer("John");
	    customer2.setAge(1);
	    
	    Customer customer3 = new Customer("Mat");
	    customer2.setAge(24);
	      
	    service.insertCustomer(customer1);
	    service.insertCustomer(customer2);
	    service.insertCustomer(customer3);
	      
	    System.out.println("Allowed discount John: " +customer1.getDiscount());
	    System.out.println("Allowed discount Frank: " +customer2.getDiscount());
	    System.out.println("Allowed discount Mat: " +customer3.getDiscount());
	}

}
