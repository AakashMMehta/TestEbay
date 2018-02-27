package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageBase.PageBase;

public class EbayProducts extends PageBase{
	
	@FindBy(linkText="ROLEX Submariner Stainless Steel Ceramic Bezel 116610LN Watch")
	public WebElement rolex;
	
	Logger logger=Logger.getLogger("EbayAddToCart");

	public EbayProducts(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public EbayProductDetailsPage selectProduct() {
	rolex.click();
	logger.info("clicked on the product");
	return new EbayProductDetailsPage(driver);
	}
}