package it.mytest.salestaxes.product;

import java.text.DecimalFormat;

/**
 * @author Alessandro
 * 
 * A class that represents a product
 *
 */
public abstract class AbstractProduct {

	/**
	 * The product description
	 */
	String description;
	/**
	 * The product price
	 */
	double price;
	/**
	 * The taxes amount
	 */
	double salesTaxes;
	/**
	 * True if the product is imported
	 */
	boolean imported;
	
	/**
	 * The quantity
	 */
	int quantity;
	
	/**
	 * @param description
	 * @param price
	 * @param imported
	 */
	public AbstractProduct(String description, double price, boolean imported, int quantity) {
		super();
		this.description = description;
		this.price = price;
		this.imported = imported;
		this.quantity = quantity;
	}
	/**
	 * Gets the description
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Sets the description
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * Gets the price
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * Sets the price 
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * Gets the taxes amount
	 * 
	 * @return
	 */
	public double getSalesTaxes() {
		return salesTaxes;
	}
	/**
	 * Sets the taxes amount
	 * 
	 * @param salesTaxes
	 */
	public void setSalesTaxes(double salesTaxes) {
		this.salesTaxes = salesTaxes;
	}
	/**
	 * Gets if the product is imported
	 * 
	 * @return
	 */
	public boolean isImported() {
		return imported;
	}
	/**
	 * Sets if the product is imported
	 * 
	 * @param imported
	 */
	public void setImported(boolean imported) {
		this.imported = imported;
	}
	/**
	 * Gets the quantity
	 * 
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * Sets the quantity
	 * 
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Get the total price
	 * 
	 * @return
	 */
	public double getTotal() {
		String result = new DecimalFormat("0.00").format(getPrice() + getSalesTaxes());
		return Double.parseDouble(result.replaceAll(",", "."));
	}
	/**
	 * Gets the tax rate
	 * 
	 * @return
	 */
	public abstract double getTaxRate();
	
	@Override
	public String toString() {
		String imported = isImported() ? "imported " : "";
		return imported + getDescription();
	}
	
	
}
