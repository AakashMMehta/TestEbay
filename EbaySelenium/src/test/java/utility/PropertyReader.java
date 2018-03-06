package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader
{
	public String readProperty(String key) throws IOException
	{
		String result;
		Properties prop=new Properties();//creating object of Properties
		FileInputStream ip=new FileInputStream("C:\\Users\\AA337112\\git\\TestEbay\\EbaySelenium\\Resources\\PropertyFile\\EbayDataPool.properties");
		prop.load(ip);	//Loading property from file	
		result=prop.getProperty(key);
		return result;
		
	}
	
}
