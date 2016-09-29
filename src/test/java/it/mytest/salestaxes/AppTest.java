package it.mytest.salestaxes;

import it.mytest.salestaxes.product.BookProduct;
import it.mytest.salestaxes.product.DefaultProduct;
import it.mytest.salestaxes.product.FoodProduct;
import it.mytest.salestaxes.product.MedicalProduct;
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
    	shoppingCart.addProductToCart(new BookProduct("book", 12.49, false, 1));
    	shoppingCart.addProductToCart(new DefaultProduct("music CD", 14.99, false, 1));
    	shoppingCart.addProductToCart(new FoodProduct("chocolate bar", 0.85, false, 1));
    	
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
    	shoppingCart.addProductToCart(new FoodProduct("box of chocolates", 10.00, true, 1));
    	shoppingCart.addProductToCart(new DefaultProduct("bottle of perfume", 47.50, true, 1));
    	
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
    	shoppingCart.addProductToCart(new DefaultProduct("bottle of perfume", 27.99, true, 1));
    	shoppingCart.addProductToCart(new DefaultProduct("bottle of perfume", 18.99, false, 1));
    	shoppingCart.addProductToCart(new MedicalProduct("packet of headache", 9.75, false, 1));
    	shoppingCart.addProductToCart(new FoodProduct("chocolates", 11.25, true, 1));
    	
    	Counter counter = new Counter(shoppingCart);
    	counter.setTaxCalculator(new TaxCalculator());
    	Receipt receipt = counter.billCalculation();
    	counter.printReceipt(receipt);
    }
}
