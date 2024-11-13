package seleniumscripts;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

public class Section14SearchFilter {

	public static void main(String[] args) {
		//--------------- opening/launch Microsoft edge (working fine )--------------------------//

		  System.setProperty("webdriver.edge.driver","C:\\Softwares\\Drivers\\msedgedriver.exe");
		  EdgeOptions opme= new EdgeOptions(); 
		 opme.setAcceptInsecureCerts(true);// use this when site is not private (SSL handling)
		  opme.addArguments("--remote-allow-origins=*"); // use this when url is not launching WebDriver driver= new EdgeDriver();
		  WebDriver driver= new EdgeDriver(opme);
		  System.out.println("Microsoft Edge launch");
		  
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("rice");
		List<WebElement>veglist=driver.findElements(By.xpath("//tr/td[1]"));
		//
		List<WebElement>filterlist=veglist.stream().filter(v->v.getText().contains("Rice")).collect(Collectors.toList());
		// 1 result
		Assert.assertEquals(veglist.size(), filterlist.size());
		System.out.println("test is passed");
		

		
		

	}

}
