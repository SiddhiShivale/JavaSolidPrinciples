package com.aurionpro.test;

import com.aurionpro.model.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("Earphone", 1000, 10);
		invoice.printInvoice();
	}

}
