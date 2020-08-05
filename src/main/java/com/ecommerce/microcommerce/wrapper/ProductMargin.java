package com.ecommerce.microcommerce.wrapper;

import com.ecommerce.microcommerce.model.Product;

public class ProductMargin {
	private Product product;
	private int margin;
	
	public ProductMargin(Product product, int margin) {
		this.product = product;
		this.margin = margin;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getMargin() {
		return margin;
	}

	public void setMargin(int margin) {
		this.margin = margin;
	}

}
