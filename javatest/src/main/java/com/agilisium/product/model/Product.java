package com.agilisium.product.model;

import java.math.BigDecimal;

public class Product {
	private String productName;
	private Long prodcutId;
	private BigDecimal price;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getProdcutId() {
		return prodcutId;
	}

	public void setProdcutId(Long prodcutId) {
		this.prodcutId = prodcutId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", prodcutId=" + prodcutId + ", price=" + price + "]";
	}

}
