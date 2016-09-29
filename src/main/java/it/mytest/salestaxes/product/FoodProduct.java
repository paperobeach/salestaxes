package it.mytest.salestaxes.product;

import it.mytest.salestaxes.tax.Tax;

/**
 * @author Alessandro Buson
 * 
 * Food product
 */
public class FoodProduct extends AbstractProduct {

	public FoodProduct(String description, double price, boolean imported, int quantity) {
		super(description, price, imported, quantity);
	}

	@Override
	public double getTaxRate() {
		return Tax.FOOD_RATE.getRate();
	}

}
