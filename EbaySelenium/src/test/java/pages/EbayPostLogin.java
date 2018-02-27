package pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageBase.PageBase;
import utility.PropertyReader;

public class EbayPostLogin extends PageBase
{
	
	@FindBy(xpath="//*[@id=\"gh-ac\"]")
	public WebElement Search;
	
	@FindBy(id="gh-btn")
	public WebElement SearchButton;
	
	Logger logger=Logger.getLogger("EbayAddToCart");
	
	PropertyReader r=new PropertyReader();
	
	public EbayPostLogin(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	//Method for chechking user is on main page
	public EbayProducts SearchProduct()
	{
		try {
			Search.sendKeys(r.readProperty("rolex_watch"));
			logger.info("product name entered");
			SearchButton.click();
			logger.info("product searched");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new EbayProducts (driver);
	}

	
}
