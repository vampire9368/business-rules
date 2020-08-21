package com.payments.model;

public class Customer {


	  private int age;
	  private int discount;
	  private String name;
	  private String address;
	  private Membership membership;
	  

	  public Customer(String name) {
	    super();
	    this.name = name;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public int getAge() {
	    return age;
	  }

	  public void setAge(int age) {
	    this.age = age;
	  }

	  public int getDiscount() {
	    return discount;
	  }

	  public void setDiscount(int discount) {
	    this.discount = discount;
	  }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Membership getMembership() {
		return membership;
	}

	public void setMembership(Membership membership) {
		this.membership = membership;
	}
	  
}
