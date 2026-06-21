package gitjava;

import java.io.IOException;

public class GitFirstProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("==============Starting the Java Program ===========");
		System.out.println("Running the Java Program");
		BrowserInitialization bi=new BrowserInitialization("chrome");
		bi.initDriver();
		
		System.out.println("Getting the values from the config.properties file..............");
		ConfigfileData cd= new ConfigfileData();
		String url=cd.getBrowser();
		String browser=cd.getURL();
		String t=cd.getTime();
		System.out.println(url+"  "+browser+"  "+t);
		
		
		System.out.println("============Starting the Java Program =============");
       
	}

}
