package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpeningBrowser {
		
	public static void main(String[] args) {
		//OpeningBrowser ob= new OpeningBrowser();
		//OpeningBrowser.OpenChromebrowser();   
		//OpeningBrowser.OpenChromebrowser(); --> directly using class name 
		//OpeningBrowser.OpenFirefoxbrowser();
		OpeningBrowser.OpenEdgeBrowser();
	}
	
	
	// opening chrome browser 
//	public static void OpenChromebrowser() {
			
	//	System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
		//ChromeOptions op= new ChromeOptions();
		//op.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));// handling multiple opening pop-up 
		//op.addArguments("--remote-allow-origins=*"); // use this when url is not launching
		//op.addArguments("--disable-notifications"); // used to habled allow cancel notification 
		//DesiredCapabilities cp=new DesiredCapabilities();
		//cp.setCapability(ChromeOptions.CAPABILITY, op);
		//op.merge(cp);
		//return op;
		
	   // WebDriver driver= new ChromeDriver(op);
    //	ChromeDriver driver1= new ChromeDriver(); //--> donot  use this always use WebDriver parent reference
                //driver.get("https://rahulshettyacademy.com/locatorspractice/");
               // driver.get("https://www.amazon.com/");
               
//}
		//----------------------------firefox ( not working )-------------------------------------------//	
	/*
	 * opening/launch firefox - geckodriver download public static void
	 * OpenFirefoxbrowser() { System.setProperty("webdriver.gecko.driver",
	 * "C:\\Softwares\\Drivers\\geckodriver.exe"); FirefoxOptions op= new
	 * FirefoxOptions(); op.addArguments("--remote-allow-origins=*"); // use this
	 * when url is not launching WebDriver driver= new FirefoxDriver(op);
	 * driver.get("https://rahulshettyacademy.com/locatorspractice/"); }
	 */
		
	//--------------- opening/launch Microsoft edge (working fine )--------------------------//
	public static void OpenEdgeBrowser() {
	  System.setProperty("webdriver.edge.driver","C:\\Softwares\\Drivers\\msedgedriver.exe");
	  EdgeOptions opme= new EdgeOptions(); 
	  opme.addArguments("--remote-allow-origins=*"); // use this when url is not launching WebDriver driver= new EdgeDriver();
	  WebDriver driver= new EdgeDriver(opme);
	  System.out.println("Microsoft Edge launch");
	  driver.get("https://www.amazon.com/");
		 
		
	// reading data from excel file 
		//public static void readdata()
	//	{
			// write the logic here
		//}
		
		
		
	}	
}
