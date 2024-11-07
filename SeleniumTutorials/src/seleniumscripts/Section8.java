package seleniumscripts;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Section8 {

	// part - 71  to 75
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*"); // use this when url is not launching
	    WebDriver driver= new ChromeDriver(op);
	    
	    // instance or member variables 
	    int j=0;
	    String [] itemsNeeded= {"cucumer","carrot","beetroot"};
	    // Open webpage
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	    
	    Thread.sleep(4000);
	    driver.manage().window().maximize();
	    List<WebElement>products=    driver.findElements(By.cssSelector("h4.product-name"));
	   // List<WebElement>products=driver.findElements(By.cssSelector("h4.product-name")); // taking all  listed products

		for (int i = 0; i < products.size(); i++) {
			String name=products.get(i).getText();
			// need to format the product name i.e Cucumber - 1 Kg we need Cucumber only not Cucumber - 1 kg to this first split the
			//veg name and quantity in 2 parts  then trim the white at 0 index i.e veg name 
			String[] name1=products.get(i).getText().split("-"); 
			String formattedName=name1[0].trim();
			// convert array into array list for easy search 
			//and check whether the name u extracted is present in array list or not
			List itemsneededlist=Arrays.asList(itemsNeeded);
			if (itemsneededlist.contains(formattedName)){
				j++;
				// click on add  to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); // don't use text it always changed used attributes values

				if (j==itemsNeeded.length) // instead of j==3 use dynamic j==veh.length i.e length of veg array
				{
					break;
					
				}
				
			}
			
		}
	}

}
