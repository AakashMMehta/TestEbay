//code for Test base which will going to be extended by test cases it reads required properties from external file
package pageBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utility.PropertyReader;

public class TestBase 
{
	protected static String  browser;
	
	//Selenium Driver initiization
	public WebDriver driver;
	
	@BeforeSuite
	public void setUp() throws IOException
	{
		PropertyReader r=new PropertyReader();//Creating object of property reader
		switch(r.readProperty("BrowserType"))//Using PropertyReader object for calling browser type
		{
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
			driver=new ChromeDriver();	
    		break;
    		
		case "Firefox":
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
		}
		
		
		driver.manage().window().maximize();//Maximize the window
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");//Navigating to Ebay
	}		
		
	@AfterSuite
	public void tearDown() throws IOException 
	{

		driver.quit();
		
	}
	
}
