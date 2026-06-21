package gitjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigfileData {

	
	Properties prop;
	FileInputStream fis;
	
	public ConfigfileData() throws IOException
	{ 
		prop=new Properties();
		fis=new FileInputStream("config.properties");
		prop.load(fis);
	}
	
	public String getBrowser()
	{
	    return prop.getProperty("browser");
	}
	public String getURL()
	{
	    return prop.getProperty("url");
	}
	
	public String getTime()
	{
		return prop.getProperty("timeout");
	}
	
}
