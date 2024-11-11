package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Wm {

	public static void main(String[] args) {
		
		
		// chrome launch
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
		ChromeOptions opch= new ChromeOptions();
		//op.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));// handling multiple opening pop-up 
		opch.addArguments("--remote-allow-origins=*"); // use this when url is not launching
		opch.addArguments("--disable-notifications"); // used to habled allow cancel notification 
		 WebDriver driver= new ChromeDriver(opch);
		 
		// WebDriver driver= new ChromeDriver(new ChromeDriverService.Builder().usingPort(65535).build());
		 driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
          System.out.println("chrome launch");
		
		// -----------------------Firefox launch - gecko driver download--------------------------//
//      	System.setProperty("webdriver.gecko.driver","C:\\Softwares\\Drivers\\geckodriver.exe");	
//		  FirefoxOptions opff= new FirefoxOptions();
//		  opff.addArguments("--remote-allow-origins=*"); // use this when url is not launching WebDriver driver= new EdgeDriver();
//			WebDriver driver= new FirefoxDriver(opff);	
//		  driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
//		  System.out.println("Firefox launch");
		  
		  
		//--------------- opening/launch Microsoft edge (working fine )--------------------------//

//		  System.setProperty("webdriver.edge.driver","C:\\Softwares\\Drivers\\msedgedriver.exe");
//		  EdgeOptions opme= new EdgeOptions(); 
//		  opme.addArguments("--remote-allow-origins=*"); // use this when url is not launching WebDriver driver= new EdgeDriver();
//		  WebDriver driver2= new EdgeDriver(opme);	
//		  driver2.get("https://rahulshettyacademy.com/locatorspractice/"); 
//		  System.out.println("Microsoft Edge launch");
		  

		  
	}

}
