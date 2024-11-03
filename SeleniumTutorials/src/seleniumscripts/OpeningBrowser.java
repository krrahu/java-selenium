package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OpeningBrowser {
		

	// opening chrome browser 
	public static void OpenChromebrowser() {
			
					System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
					ChromeOptions op= new ChromeOptions();
						op.addArguments("--remote-allow-origins=*"); // use this when url is not launching
					    WebDriver driver= new ChromeDriver(op);
               //	ChromeDriver driver1= new ChromeDriver(); //--> donot  use this always use WebDriver parent reference
                driver.get("https://rahulshettyacademy.com/locatorspractice/");
               
}
		
	/*
	 * opening/launch firefox - geckodriver download public static void
	 * OpenFirefoxbrowser() { System.setProperty("webdriver.gecko.driver",
	 * "C:\\Softwares\\Drivers\\geckodriver.exe"); FirefoxOptions op= new
	 * FirefoxOptions(); op.addArguments("--remote-allow-origins=*"); // use this
	 * when url is not launching WebDriver driver= new FirefoxDriver(op);
	 * driver.get("https://rahulshettyacademy.com/locatorspractice/"); }
	 */
		
		// opening/launch Microsoft edge
		/*
		 * public static void OpenEdgebrowser() {
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\Softwares\\Drivers\\msedgedriver.exe"); FirefoxOptions op= new
		 * FirefoxOptions(); op.addArguments("--remote-allow-origins=*"); // use this
		 * when url is not launching WebDriver driver= new EdgeDriver();
		 * driver.get("https://rahulshettyacademy.com/locatorspractice/"); }
		 */
		
	// reading data from excel file 
		public static void readdata()
		{
			// write the logic here
		}
		
		
		
		public static void main(String[] args) {
			OpeningBrowser ob= new OpeningBrowser();
			//ob.OpenChromebrowser();
			OpeningBrowser.OpenChromebrowser();
			//OpeningBrowser.OpenFirefoxbrowser();
			//OpeningBrowser.OpenEdgebrowser();
		}
}
