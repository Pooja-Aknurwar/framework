package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public void ConfigDataReader()
	{
		try
		{
			File src = new File("D:\\Automation\\com.Firstproject.Etlhive\\Configuration\\config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);	
		}
		
		catch (Exception e)
		{			
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getChromePath()
	{
		String chromepath = pro.getProperty("ChromeDriver");
		return chromepath;
	}
	
	public String getIEPath()
	{
		String chromepath = pro.getProperty("IEDriver");
		return chromepath;
	}
	
	public String getExcelPath()
	{
		String testdata = pro.getProperty("TestData");
		return testdata;
	}
	
	public String getURL()
	{
		String url = pro.getProperty("URL");
		return url;
	}

	}

