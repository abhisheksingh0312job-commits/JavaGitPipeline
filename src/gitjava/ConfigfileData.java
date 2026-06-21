package gitjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigfileData {

	
	Properties prop;
	
	public ConfigfileData() throws IOException
	{
		FileInputStream fis=new FileInputStream("config.properties");
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
