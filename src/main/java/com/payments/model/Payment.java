package com.payments.model;

public class Payment {
	
	private Customer paymrntCustomer;
	private ProductType productType;
	public Customer getPaymrntCustomer() {
		return paymrntCustomer;
	}
	public void setPaymrntCustomer(Customer paymrntCustomer) {
		this.paymrntCustomer = paymrntCustomer;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	
}
