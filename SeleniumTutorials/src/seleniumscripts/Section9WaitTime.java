package seleniumscripts;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Section9WaitTime {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*"); // use this when url is not launching
	    WebDriver driver= new ChromeDriver(op);
	    // implicit wait  is global time wait 
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	// explicit wait
	WebDriverWait w =new WebDriverWait(driver,null);
	
	    String [] itemsNeeded= {"cucumer","carrot","beetroot"};
	 
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	    Thread.sleep(4000);
	    // calling addItems () refer section 8 for code explanation
	    addItems(driver, itemsNeeded); //  Section9.addItems(driver, itemsNeeded);
	    driver.manage().window().maximize();
	 // click  on PROCEED TO CHECKOUT
	    driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click(); 
	    
	 // explicit wait is defined for selected code
	    w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("//button[contains(text(),'PROCEED TO CHECKOUT')]")));
	    
	    // enter promo code 
	    driver.findElement(By.className("promoCode")).sendKeys("test");
	    driver.findElement(By.xpath("//button[@class='promoBtn']")).click(); // css--> button[class='promoBtn']
	   
	    // explicit wait  
	    w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[class='promoInfo']"))); // By.cssSelector("span[class='promoInfo']") this is locator 
	
	    // grab text for promo applied successfully
	    driver.findElement(By.cssSelector("span[class='promoInfo']")).getText(); //x-path --> //span[@class='promoInfo']
	    
	    
	}    

	
	
	
//  addItems method 
	public static void addItems(WebDriver driver, String [] itemsNeeded) {
		int j=0;
		
	   List<WebElement>products=driver.findElements(By.cssSelector("h4.product-name")); // taking all  listed products

		for (int i = 0; i < products.size(); i++) {
			String name=products.get(i).getText();

			String[] name1=products.get(i).getText().split("-"); 
			String formattedName=name1[0].trim();

			List itemsneededlist=Arrays.asList(itemsNeeded);
			if (itemsneededlist.contains(formattedName)){
				j++;
				
				// click on add  to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j==itemsNeeded.length) 
				{
					break;
					
				}
				
			}
			
		}
	}
}
