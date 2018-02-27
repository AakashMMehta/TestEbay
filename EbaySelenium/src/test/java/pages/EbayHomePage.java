package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageBase.PageBase;
import utility.ClearLog;

public class EbayHomePage extends PageBase
{
	//Page factory Elements
	/*For identifying the elements with appium we can use @FindBy ,@FindBys
	 * */
	@FindBy(xpath="//*[@id=\"gh-ug\"]/a")
	public WebElement loginlink;
	
	Logger logger=Logger.getLogger("EbayHomePage");
	
	ClearLog tut=new ClearLog();
	
	public EbayHomePage(WebDriver driver) 
	{
		super(driver);
		//page factory init
		PageFactory.initElements(driver, this);
	}
	
	//Method for SignIN
	public EbaySignINPage onclickSignIN()
	{
		tut.rollLogFile(logger);
		loginlink.click();
		logger.info("Clicked on login link");
		return new EbaySignINPage(driver);
	}

}
