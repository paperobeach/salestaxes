package it.mytest.salestaxes;

import it.mytest.salestaxes.product.BookProduct;
import it.mytest.salestaxes.product.DefaultProduct;
import it.mytest.salestaxes.product.FoodProduct;
import it.mytest.salestaxes.store.Counter;
import it.mytest.salestaxes.store.Receipt;
import it.mytest.salestaxes.store.ShoppingCart;
import it.mytest.salestaxes.tax.TaxCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ShoppingCart shoppingCart = new ShoppingCart();
    	shoppingCart.addProductToCart(new BookProduct("book", 12.49, false, 1));
    	shoppingCart.addProductToCart(new DefaultProduct("music CD", 14.99, false, 1));
    	shoppingCart.addProductToCart(new FoodProduct("chocolate bar", 0.85, false, 1));
    	
    	Counter counter = new Counter(shoppingCart);
    	counter.setTaxCalculator(new TaxCalculator());
    	Receipt receipt = counter.billCalculation();
    	counter.printReceipt(receipt);
    }
}
