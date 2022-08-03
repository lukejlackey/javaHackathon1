package com.heidichen.abstractdemo;

public class CreditCardPayment extends Payment{
	private String cardNum, ownerName, expDate;

	public CreditCardPayment(double amount, String cardNum, String ownerName, String expDate) {
		super(amount);
		this.cardNum = cardNum;
		this.ownerName = ownerName;
		this.expDate = expDate;
	}
	
	@Override
	public void paymentDetails() {
		super.paymentDetails();
		System.out.println("Card Number: " + cardNum + " | owner: " + ownerName + " | Exp Date" + expDate);
	}
	
}
