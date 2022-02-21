package Operations;


import Pages.Order;
import org.openqa.selenium.WebDriver;

public class OrderFunc extends Actions {
	
	 //Variables for operations:
    public static String CartProdText;
    public static String CartPriceText;
    
    public OrderFunc(WebDriver driver) {
    	super(driver);
    }

     
    public boolean ProductNameVerify(String Product_Name){
    	CartProdText = GetText(Order.CartProductName);
    	if(Product_Name.equals(CartProdText)) {              //product name is getting verified
    		return(true);
    	}
    	else {
    		return(false);
    	}
                         
        
    }

    public boolean ProductPriceVerify(String Product_Price){
    	CartPriceText = GetText(Order.CartProductPrice);
    	if(Product_Price.equals(CartPriceText)) {              //product Price is getting verified
    		return(true);
    	}
    	else {
    		return(false);
    	}
   
      	    }
}
