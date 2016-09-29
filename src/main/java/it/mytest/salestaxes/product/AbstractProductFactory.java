package it.mytest.salestaxes.product;

/**
 * @author Alessandro Buson
 * 
 * Factory for product creation
 *
 */
public abstract class AbstractProductFactory {

	public abstract AbstractProduct getProduct(String description, double price, boolean imported, int quantity);
	
}
