package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.AddToCart;
import Pages.homepage;


public class AddtoCartTest extends BaseClass{
	
	AddToCart add;
	homepage homepageObj2;
	
	@BeforeMethod
	public void initiate(){
    add = new AddToCart(driver);          //object created 
    }
	
	@BeforeMethod
	public void initiatehome() {
		homepageObj2 = new homepage(driver);
	}
	
	@Test
	public void test3(){
		//clicked on dresses button
		
		add.Dresses();
		
		//clicked on casual dresses button
		add.CasualDresses();
		
		//selected the dress
		add.Productselected();
		
		//product added to the cart by add button
		add.ProductaddedtoCart();
		
		//cart opening
		add.proceedToCart();
		
		//verifying correct product and its price that was added in the cart
		add.ProductNameVerify();
		add.ProductPriceVerify();
	}

}
