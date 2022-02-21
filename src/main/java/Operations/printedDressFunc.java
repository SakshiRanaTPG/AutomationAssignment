package Operations;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import Pages.printedDress;

public class printedDressFunc extends Actions {
	
	HashMap<String,String> productDetails;

	   public static String Product_Name;
	   public static String Product_Price;

	public printedDressFunc(WebDriver driver) {
    	super(driver);
    }
	
	 public HashMap<String,String> ProductaddedtoCart() {
	        Product_Name= GetText(printedDress.ProductName);             //product added to cart and its name&price is stored for verification
	        Product_Price= GetText(printedDress.ProductPrice);
	        productDetails = new HashMap<String, String>();
	        productDetails.put("Product_Name", Product_Name);
	        productDetails.put("Product_Price", Product_Price);
	        click(printedDress.Add);
	        return productDetails;
	    }
	 

	    public OrderFunc proceedToCart() {
	    	click(printedDress.Proceed);
	       return new OrderFunc(driver);
	
	    }
	    
	
}
