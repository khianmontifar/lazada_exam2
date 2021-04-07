package com.lazada.exam2.encapsulation;

public class Product {
	private int id;
	private String productName;
	private String productDescription;
	private String sKU;
	private String price;
	public Product(int id, String productName, String productDescription, String sKU, String price) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
		this.sKU = sKU;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getsKU() {
		return sKU;
	}
	public void setsKU(String sKU) {
		this.sKU = sKU;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
