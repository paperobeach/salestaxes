package it.mytest.salestaxes.store;

import java.text.DecimalFormat;

import it.mytest.salestaxes.product.AbstractProduct;
import it.mytest.salestaxes.tax.ITaxCalculator;
import it.mytest.salestaxes.tax.TaxCalculator;

/**
 * @author Alessandro Buson
 *
 */
public class Counter {

	/**
	 * The shopping Cart
	 */
	private final ShoppingCart shoppingCart;
	/**
	 * The tax calculator
	 */
	private ITaxCalculator taxCalculator;
	
	public Counter(ShoppingCart shoppingCart) {
		super();
		this.shoppingCart = shoppingCart;
	}

	/**
	 * Gets the shopping cart
	 * 
	 * @return
	 */
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	/**
	 * Gets the tax calculator (default tax calculator)
	 * 
	 * @return
	 */
	public ITaxCalculator getTaxCalculator() {
		if(taxCalculator == null) {
			taxCalculator = new TaxCalculator();
		}
		return taxCalculator;
	}

	/**
	 * Sets the tax calculator
	 * 
	 * @param calculator
	 */
	public void setTaxCalculator(ITaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}

	/**
	 * Calculate the bill
	 * 
	 * @param product
	 */
	public Receipt billCalculation() {
		Receipt receipt = new Receipt();
		receipt.setProducts(shoppingCart.getProducts());
		double totalAmount = 0;
		double salesTaxes = 0;
		for (AbstractProduct product : shoppingCart.getProducts()) {
			product.setSalesTaxes(taxCalculator.calculateTax(product.getPrice(), product.getTaxRate(), product.isImported()));
			salesTaxes += product.getSalesTaxes();
			totalAmount += product.getPrice();
		}
		String result = new DecimalFormat("0.00").format(salesTaxes);
		receipt.setTotalSalesTaxes(Double.parseDouble(result.replaceAll(",", ".")));
		result = new DecimalFormat("0.00").format(totalAmount + salesTaxes);
		receipt.setTotal(Double.parseDouble(result.replaceAll(",", ".")));
		
		return receipt;
	}
	
	/**
	 * Prints the receipt 
	 * 
	 * @param receipt
	 */
	public void printReceipt(Receipt receipt) {
		System.out.println(receipt);
	}
}
