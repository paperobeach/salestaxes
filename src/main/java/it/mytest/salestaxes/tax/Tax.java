package it.mytest.salestaxes.tax;

/**
 * @author Alessandro Buson
 *
 */
public enum Tax {
	
	BOOK_RATE(0.0),
	FOOD_RATE(0.0),
	MEDICAL_RATE(0.0),
	DEFAULT_RATE(0.10)
	; 

	final double rate;

	private Tax(double rate) {
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

}
