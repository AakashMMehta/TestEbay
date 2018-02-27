package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageBase.PageBase;

public class EbayProductDetailsPage extends PageBase{
	
	@FindBy(linkText="Add to cart")
	public WebElement AddToCart;
	
	Logger logger=Logger.getLogger("EbayAddToCart");

	public EbayProductDetailsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void ProductAction() {
	AddToCart.click();
	logger.info("clicked on add to cart");
	}
	
}
