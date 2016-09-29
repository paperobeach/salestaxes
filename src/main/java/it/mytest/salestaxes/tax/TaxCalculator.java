package it.mytest.salestaxes.tax;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Alessandro Buson
 *
 */
public class TaxCalculator implements ITaxCalculator {

	/* (non-Javadoc)
	 * @see it.mytest.salestaxes.tax.ITaxCalculator#calculateTax(double, double, boolean)
	 */
	public double calculateTax(double price, double taxRate, boolean imported) {
		double salesTax = price * taxRate;
		if(imported) {
			salesTax += price * 0.05;
		}
		double toRound = salesTax / 0.05 + 0.5;
		double rounded = new BigDecimal(toRound).setScale(0, RoundingMode.HALF_DOWN).doubleValue();
		return (int)(rounded) * 0.05;
	}

}
