package com.aurionpro.model;

public class PrintInvoice extends Invoice{
	
	public PrintInvoice() {
		super();
	}

	public PrintInvoice(String productDescription, double productCost, double discountPercent) {
		super(productDescription, productCost, discountPercent);
	}

	public void printInvoice() {
		System.out.println("Invoice id: " + getInvoiceId());
		System.out.println("Product Description: " + getProductDescription());
		System.out.println("Product Cost: " + getProductCost());
		System.out.println("Discount: " + getDiscountPercent() + "%");
		System.out.println("Price after discount: " + (getProductCost() - calculateDiscount()));
		System.out.println("Tax: " + getTax() + "%");
		System.out.println("Final cost: " + calculateFinalCost());
	}
}


