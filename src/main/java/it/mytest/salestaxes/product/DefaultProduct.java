package it.mytest.salestaxes.product;

import it.mytest.salestaxes.tax.Tax;

/**
 * @author Alessandro Buson
 * 
 * default product
 *
 */
public class DefaultProduct extends AbstractProduct {

	public DefaultProduct(String description, double price, boolean imported, int quantity) {
		super(description, price, imported, quantity);
	}

	@Override
	public double getTaxRate() {
		return Tax.DEFAULT_RATE.getRate();
	}

}
