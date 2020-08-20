package com.payments.model;

public enum Membership {
	NORMAL(1),
	SILVER(2),
	GOLD(3),
	PLATINUM(4);
	
	private final int membershipCode;
	private Membership(int memCode) {
		this.membershipCode = memCode;
	}
}
