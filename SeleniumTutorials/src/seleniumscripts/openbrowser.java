package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openbrowser {

	public static void main(String[] args) throws InterruptedException {
		// all type of browser path setting
		
		//WebDriverManager.chromedriver().setup(); // use this when we don't want set path for browser
		
		
		// firefox launch - geckodriver download
//		System.setProperty("webdriver.gecko.driver","C:\\Softwares\\Drivers\\geckodriver.exe");
//		WebDriver driver= new FirefoxDriver();
		
		
		  //micrsoft edge launch 
//		System.setProperty("webdriver.edge.driver","C:\\Softwares\\Drivers\\msedgedriver.exe"); 
//		WebDriver driver= new EdgeDriver();
		 
				
		// chrome launch 
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTutorials\\Drivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*"); // use want url not launhes
	    WebDriver driver= new ChromeDriver(op);
		
		//WebDriver driver= new ChromeDriver();
		//driver.get("https://googlechromelabs.github.io/chrome-for-testing/");
   Thread.sleep(3000);
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("browsr is closed");
	
		

	}

}
