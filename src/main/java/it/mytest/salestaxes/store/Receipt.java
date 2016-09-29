package it.mytest.salestaxes.store;

import java.util.List;

import it.mytest.salestaxes.product.AbstractProduct;

/**
 * @author Alessandro Buson
 * 
 * The receipt
 *
 */
public class Receipt {

	/**
	 * List of products
	 */
	private List<AbstractProduct> products;
	/**
	 * Total sales taxes
	 */
	private double totalSalesTaxes;
	/**
	 * Total amount
	 */
	private double total;
	/**
	 * @return
	 */
	public List<AbstractProduct> getProducts() {
		return products;
	}
	/**
	 * @param products
	 */
	public void setProducts(List<AbstractProduct> products) {
		this.products = products;
	}
	/**
	 * @return
	 */
	public double getTotalSalesTaxes() {
		return totalSalesTaxes;
	}
	/**
	 * @param totalSalesTaxes
	 */
	public void setTotalSalesTaxes(double totalSalesTaxes) {
		this.totalSalesTaxes = totalSalesTaxes;
	}
	/**
	 * @return
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		String result = "";
		for(AbstractProduct product : products) {
			result += product.getQuantity() + " " + product.toString() + ": " + (product.getTotal()) + "\n";
		}
		result += "Sales Taxes: " + getTotalSalesTaxes() + "\n";
		result += "Total: " + getTotal();
		return result;
	}
	
	
}
