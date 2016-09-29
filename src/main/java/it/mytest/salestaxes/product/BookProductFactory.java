package it.mytest.salestaxes.product;

/**
 * @author Alessandro Buson
 * 
 * Factory for book product creation
 *
 */
public class BookProductFactory extends AbstractProductFactory {

	@Override
	public AbstractProduct getProduct(String description, double price, boolean imported, int quantity) {
		return new BookProduct(description, price, imported, quantity);
	}

}
