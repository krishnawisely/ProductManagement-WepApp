package com.dayone.model;

public class Product {
	private String prod_name;
	private float price;
	private String prod_details;
	private String warranty;

	public String getProd_name() {
		return prod_name;
	}

	@Override
	public String toString() {
		return "Product [prod_name=" + prod_name + ", price=" + price + ", prod_details=" + prod_details + ", warranty="
				+ warranty + "]";
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getProd_details() {
		return prod_details;
	}

	public void setProd_details(String prod_details) {
		this.prod_details = prod_details;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
}
