package it.mytest.salestaxes.product;

import it.mytest.salestaxes.tax.Tax;

/**
 * @author Alessandro Buson
 * 
 * Book product
 *
 */
public class BookProduct extends AbstractProduct {

	/**
	 * @param description
	 * @param price
	 * @param imported
	 */
	public BookProduct(String description, double price, boolean imported, int quantity) {
		super(description, price, imported, quantity);
	}

	@Override
	public double getTaxRate() {
		return Tax.BOOK_RATE.getRate();
	}

}
