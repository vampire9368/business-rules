package com.payments.model;

public enum ProductType {
	PHYSICAL(1),
	MEMBERSHIP(2),
	VIDEO(3);
	
	private final int prodTypeCode;
	
	private ProductType(int typeCode) {
		this.prodTypeCode = typeCode;
	}
}
