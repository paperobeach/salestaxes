package it.mytest.salestaxes;

import it.mytest.salestaxes.product.BookProductFactory;
import it.mytest.salestaxes.product.DefaultProductFactory;
import it.mytest.salestaxes.product.FoodProductFactory;
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
    	BookProductFactory bookProductFactory = new BookProductFactory();
    	DefaultProductFactory defaultProductFactory = new DefaultProductFactory();
    	FoodProductFactory foodProductFactory = new FoodProductFactory();
    	
    	shoppingCart.addProductToCart(bookProductFactory.getProduct("book", 12.49, false, 1));
    	shoppingCart.addProductToCart(defaultProductFactory.getProduct("music CD", 14.99, false, 1));
    	shoppingCart.addProductToCart(foodProductFactory.getProduct("chocolate bar", 0.85, false, 1));
    	
    	Counter counter = new Counter(shoppingCart);
    	counter.setTaxCalculator(new TaxCalculator());
    	Receipt receipt = counter.billCalculation();
    	counter.printReceipt(receipt);
    }
}
