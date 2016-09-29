package it.mytest.salestaxes.product;

/**
 * @author Alessandro Buson
 * 
 * Factory for default product creation
 *
 */
public class DefaultProductFactory extends AbstractProductFactory {

	@Override
	public AbstractProduct getProduct(String description, double price, boolean imported, int quantity) {
		return new DefaultProduct(description, price, imported, quantity);
	}

}
