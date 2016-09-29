package it.mytest.salestaxes;

import it.mytest.salestaxes.product.BookProductFactory;
import it.mytest.salestaxes.product.DefaultProductFactory;
import it.mytest.salestaxes.product.FoodProductFactory;
import it.mytest.salestaxes.product.MedicalProductFactory;
import it.mytest.salestaxes.store.Counter;
import it.mytest.salestaxes.store.Receipt;
import it.mytest.salestaxes.store.ShoppingCart;
import it.mytest.salestaxes.tax.TaxCalculator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	/**
	 * Factory book product
	 */
	BookProductFactory bookProductFactory = new BookProductFactory();
	/**
	 * Factory default product
	 */
	DefaultProductFactory defaultProductFactory = new DefaultProductFactory();
	/**
	 * Factory food product
	 */
	FoodProductFactory foodProductFactory = new FoodProductFactory();
	/**
	 * Factory medical product
	 */
	MedicalProductFactory medicalProductFactory = new MedicalProductFactory();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * First test
     */
    public void testInput1()
    {
    	ShoppingCart shoppingCart = new ShoppingCart();
    	shoppingCart.addProductToCart(bookProductFactory.getProduct("book", 12.49, false, 1));
    	shoppingCart.addProductToCart(defaultProductFactory.getProduct("music CD", 14.99, false, 1));
    	shoppingCart.addProductToCart(foodProductFactory.getProduct("chocolate bar", 0.85, false, 1));
    	
    	Counter counter = new Counter(shoppingCart);
    	counter.setTaxCalculator(new TaxCalculator());
    	Receipt receipt = counter.billCalculation();
    	counter.printReceipt(receipt);
    }
    
    /**
     * Second test
     */
    public void testInput2()
    {
    	ShoppingCart shoppingCart = new ShoppingCart();
    	shoppingCart.addProductToCart(foodProductFactory.getProduct("box of chocolates", 10.00, true, 1));
    	shoppingCart.addProductToCart(defaultProductFactory.getProduct("bottle of perfume", 47.50, true, 1));
    	
    	Counter counter = new Counter(shoppingCart);
    	counter.setTaxCalculator(new TaxCalculator());
    	Receipt receipt = counter.billCalculation();
    	counter.printReceipt(receipt);
    }
    
    /**
     * Third test
     */
    public void testInput3()
    {
    	ShoppingCart shoppingCart = new ShoppingCart();
    	shoppingCart.addProductToCart(defaultProductFactory.getProduct("bottle of perfume", 27.99, true, 1));
    	shoppingCart.addProductToCart(defaultProductFactory.getProduct("bottle of perfume", 18.99, false, 1));
    	shoppingCart.addProductToCart(medicalProductFactory.getProduct("packet of headache", 9.75, false, 1));
    	shoppingCart.addProductToCart(foodProductFactory.getProduct("chocolates", 11.25, true, 1));
    	
    	Counter counter = new Counter(shoppingCart);
    	counter.setTaxCalculator(new TaxCalculator());
    	Receipt receipt = counter.billCalculation();
    	counter.printReceipt(receipt);
    }
}
