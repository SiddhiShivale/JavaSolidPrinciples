package com.aurionpro.test;
import com.aurionpro.model.PrintInvoice;

public class InvoiceTest {
	
	public static void main(String[] args) {
	
		PrintInvoice printInvoice = new PrintInvoice("Earphone", 1000, 10);
		printInvoice.printInvoice();
	}
}
