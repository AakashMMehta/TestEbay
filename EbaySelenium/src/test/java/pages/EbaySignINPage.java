package pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageBase.PageBase;
import utility.PropertyReader;

public class EbaySignINPage extends PageBase
{
	PropertyReader r=new PropertyReader();
	//Page factory Elements
	/*For identifying the elements with selenium we can use @FindBy ,@FindBys
		 * */
	@FindBy(xpath="//input[@name=\"userid\"]")  //for UserNamefield
	public WebElement username;
		
	@FindBy(xpath="//input[@name=\"pass\"]")  //for passwordfield
	public WebElement password;
	
	@FindBy(xpath="//*[@id=\"sgnBt\"]")  //for signin button
	public WebElement Signinbtn;
	
	Logger logger=Logger.getLogger("EbaySignINPage");
	
	public EbaySignINPage(WebDriver driver)
	{
		super(driver);
		//page factory init
		PageFactory.initElements(driver, this);
	}
	//Method for completing login
	public EbayPostLogin oncompleteSignIn() throws IOException
	{
			username.sendKeys(r.readProperty("Username"));
			logger.info("Username entered");
			password.sendKeys(r.readProperty("Password"));
			logger.info("Password entered");
			Signinbtn.click();	
			logger.info("Clicked on signin button");
		
		return new EbayPostLogin(driver);
		
	}
}
