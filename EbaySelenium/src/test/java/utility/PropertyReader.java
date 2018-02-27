package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader
{
	public String readProperty(String key) throws IOException
	{
		String result;
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("D:\\ServiceNow\\EbaySelenium\\Resources\\PropertyFile\\EbayDataPool.properties");
		prop.load(ip);		
		result=prop.getProperty(key);
		return result;
		
	}
	
}
