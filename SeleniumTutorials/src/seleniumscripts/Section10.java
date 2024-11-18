package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Section10 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedrivert.exe");
		ChromeOptions op= new ChromeOptions();
		//op.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));// handling multiple opening pop-up 
		op.addArguments("--remote-allow-origins=*"); // use this when url is not launching
		op.addArguments("--disable-notifications"); // used to habled allow cancel notification 
	    WebDriver driver= new ChromeDriver(op);
	    driver.get("https://www.amazon.com/");
	   
//		   System.out.println(driver.findElement(By.xpath(" //span[@id='nav-link-accountList-nav-line-1']")).getText());// Sign in text 
	    
	   // actions class ( to move cursor) 
	   Actions a=new Actions(driver);
	  
	  
	   
	   //-------------- moving mouse to specific element like hello ,Sign in--------------------// 
	// WebElement move=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	// a.moveToElement(move).build().perform(); 
//	a.moveToElement(driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))).build().perform();
		
		
		//------------- entering hello keyword ----------------------//
		WebElement move1=driver.findElement(By.id("nav-search-bar-form"));
		a.moveToElement(move1).click().keyDown(Keys.SHIFT).sendKeys("hello");
		
	
		
		// ----------------how to handle frames (part 91,92)----------------// 
		// frame is used to drag and drop frames 
		// window handling - .getWindowHandles();
		
		
	}

}
