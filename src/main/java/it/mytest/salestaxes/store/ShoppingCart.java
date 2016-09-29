package it.mytest.salestaxes.store;

import java.util.ArrayList;
import java.util.List;

import it.mytest.salestaxes.product.AbstractProduct;

/**
 * @author Alessandro Buson
 *
 *	The shopping cart
 */
public class ShoppingCart {

	/**
	 * product list in the cart
	 */
	private List<AbstractProduct> products;
	
	public ShoppingCart() {
		super();
		this.products = new ArrayList<AbstractProduct>();
	}

	public List<AbstractProduct> getProducts() {
		return products;
	}

	public void setProducts(List<AbstractProduct> products) {
		this.products = products;
	}
	
	/**
	 * Adds the product to cart
	 *  
	 * @param product
	 */
	public void addProductToCart(AbstractProduct product) {
		products.add(product);
	}
	
}
