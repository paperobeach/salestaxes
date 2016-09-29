package it.mytest.salestaxes.product;

import it.mytest.salestaxes.tax.Tax;

/**
 * @author Alessandro Buson
 * 
 * Medical product
 *
 */
public class MedicalProduct extends AbstractProduct {

	public MedicalProduct(String description, double price, boolean imported, int quantity) {
		super(description, price, imported, quantity);
	}

	@Override
	public double getTaxRate() {
		return Tax.MEDICAL_RATE.getRate();
	}

}
