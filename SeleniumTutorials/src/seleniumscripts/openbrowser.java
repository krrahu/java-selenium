package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openbrowser {

	public static void main(String[] args) throws InterruptedException {
		// all type of browser path setting
		
	
		/*firefox launch
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();*/
		
		/*
		 * //micrsoft edge launch System.setProperty("webdriver.edge.driver",
		 * "C:\\Softwares\\Drivers\\msedgedriver.exe"); WebDriver driver= new
		 * EdgeDriver();
		 */
				
		// chrome launch 
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTutorials\\Drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");

		ChromeOptions op= new ChromeOptions(); op.addArguments("--remote-allow-origins=*"); // use want url not launhes
	    WebDriver driver= new ChromeDriver(op);
	   // Thread.sleep(3000);
		driver.get("https://test-rca.customer.tui/validate-booking");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
	
		

	}

}
