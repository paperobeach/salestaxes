package it.mytest.salestaxes.tax;

/**
 * @author Alessandro Buson
 * 
 * Tax calculator
 *
 */
public interface ITaxCalculator {

	/**
	 * Calculate the tax amount
	 * 
	 * @param price
	 * @param taxRate
	 * @param imported
	 * @return
	 */
	public double calculateTax(double price, double taxRate, boolean imported);
	
}
