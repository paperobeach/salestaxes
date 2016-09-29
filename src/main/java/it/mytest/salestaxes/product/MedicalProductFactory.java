package it.mytest.salestaxes.product;

/**
 * @author Alessandro Buson
 * 
 * Factory for medical product creation
 *
 */
public class MedicalProductFactory extends AbstractProductFactory {

	@Override
	public AbstractProduct getProduct(String description, double price, boolean imported, int quantity) {
		return new MedicalProduct(description, price, imported, quantity);
	}

}
