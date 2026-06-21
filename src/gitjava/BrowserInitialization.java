package gitjava;

public class BrowserInitialization {
	
	String browser;
	public BrowserInitialization(String browser)
	{
		this.browser=browser;
	}
	
	public void initDriver()
	{
		System.out.println("Hello Dude I am going to run on "+ this.browser+ " browser");
	}
	

}
