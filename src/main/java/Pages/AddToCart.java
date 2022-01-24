package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Actions.actions;


public class AddToCart extends actions{

	
	  public AddToCart(WebDriver driver){
		  super(driver);
		  }
	    
	    //elements are found here, all by xpaths:
	    public static final By Dressesbtn= By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']");
	    public static final By Casualbtn= By.xpath("//ul[@class='tree dynamized']/li/a[contains(text(), 'Casual Dresses')]");
	    public static final By Product= By.xpath("//a[@class='product_img_link']//img");
	    public static final By ProductName= By.xpath("//h1[@itemprop='name']");
	    public static final By ProductPrice= By.xpath("//span[@itemprop='price']");  
	    public static final By Add= By.xpath("//p[@class='buttons_bottom_block no-print']//button");
	    public static final By Proceed= By.xpath("//a[@class='btn btn-default button button-medium']");
	    public static final By CartProductName= By.xpath("//td[@class='cart_description']//p[@class='product-name']//a");
	    public static final By CartProductPrice= By.xpath("//td[@class='cart_unit']//span[@id='product_price_3_13_0']//span[@class='price']");
	    
	    //Variables for operations:
	    public static String Product_Name;
	    public static String Product_Price;
	    public static String CartProdText;
	    public static String CartPriceText;
	    
	
	    public void Dresses(){
	        click(Dressesbtn); //clicking on dresses button
	        
	    }

	    public void CasualDresses(){
	        click(Casualbtn);     //clicking on casual dresses button
	    }

	    public void Productselected(){
	        click(Product);
	    }

	    public void ProductaddedtoCart() {
	    	
	        Product_Name= GetText(ProductName);             //product added to cart and its name&price is stored for verification
	        Product_Price= GetText(ProductPrice);
	        click(Add);
	    }
	    
	    public void proceedToCart() {
	    	click(Proceed);                     //proceed to cart button clicked
	    }
	   
        
	    public void ProductNameVerify(){
	    	CartProdText = GetText(CartProductName);
	        Assert.assertEquals(Product_Name, CartProdText);                   //product name is getting verified
	        
	    }

	    public void ProductPriceVerify(){
	    	CartPriceText = GetText(CartProductPrice);
	        Assert.assertTrue(TextEquals(Product_Price, CartProductPrice));        //product price is getting verified
	      	    }
}
