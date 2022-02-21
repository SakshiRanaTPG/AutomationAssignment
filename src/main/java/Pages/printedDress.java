package Pages;

import org.openqa.selenium.By;

public class printedDress {

	 public static final By ProductName= By.xpath("//h1[@itemprop='name']");
	 public static final By ProductPrice= By.xpath("//span[@itemprop='price']");  
	 public static final By Add= By.xpath("//p[@class='buttons_bottom_block no-print']//button");
	 public static final By Proceed= By.xpath("//a[@class='btn btn-default button button-medium']");
	
}
