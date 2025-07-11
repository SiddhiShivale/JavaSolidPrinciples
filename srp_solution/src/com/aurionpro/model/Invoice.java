package com.aurionpro.model;

public class Invoice {
	
	private static int idCounter = 1;
	private int invoiceId;
	private String productDescription;
	private double productCost;
	private double discountPercent;
	private final int tax = 10;
	
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public int getTax() {
		return tax;
	}
	
	public Invoice(String productDescription, double productCost, double discountPercent) {
		super();
		this.invoiceId = idCounter++;
		this.productDescription = productDescription;
		this.productCost = productCost;
		this.discountPercent = discountPercent;
	}
	public Invoice() {
		super();
	}
	
	public double calculateDiscount() {
		return productCost * discountPercent / 100;
	}
	
	public double calculateTax() {
		double discountedPrice = productCost - calculateDiscount();
		return discountedPrice * tax / 100;
	}
	
	public double calculateFinalCost() {
		return productCost + calculateTax() - calculateDiscount();
	}
	
}
