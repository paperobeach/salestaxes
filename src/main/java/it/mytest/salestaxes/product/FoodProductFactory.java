package it.mytest.salestaxes.product;

/**
 * @author Alessandro Buson
 * 
 * Factory for food product creation
 *
 */
public class FoodProductFactory extends AbstractProductFactory {

	@Override
	public AbstractProduct getProduct(String description, double price, boolean imported, int quantity) {
		return new FoodProduct(description, price, imported, quantity);
	}

}
