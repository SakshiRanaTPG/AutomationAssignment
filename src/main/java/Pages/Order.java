package Pages;

import org.openqa.selenium.By;

public class Order {

	//elements are found here, all by xpaths:
    public static final By CartProductName= By.xpath("//td[@class='cart_description']//p[@class='product-name']//a");
    public static final By CartProductPrice= By.xpath("//td[@class='cart_unit']//span[@id='product_price_3_13_0']//span[@class='price']");
}
