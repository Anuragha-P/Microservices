package com.wipro.java.microservices.solid;

public class InvoicePersistance {
	
	Invoice invoice;

	public InvoicePersistance(Invoice invoice) {

		this.invoice=invoice;

	}

	public void saveToFile(String filename) {}
	
}