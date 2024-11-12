package seleniumscripts;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import dev.failsafe.internal.util.Assert;

public class Section11 {

	public static void main(String[] args) throws InterruptedException {
		
	
		
		//--------------- opening/launch Microsoft edge (working fine )--------------------------//

		  System.setProperty("webdriver.edge.driver","C:\\Softwares\\Drivers\\msedgedriver.exe");
		  EdgeOptions opme= new EdgeOptions(); 
		  opme.addArguments("--remote-allow-origins=*"); // use this when url is not launching WebDriver driver= new EdgeDriver();
		  WebDriver driver= new EdgeDriver(opme);
		  System.out.println("Microsoft Edge launch");
		  
		
		//------------------------------------------------------------------------------------------------------------//
		  
//		  driver.get("http://www.qaclickacademy.com/");
//			driver.manage().window().maximize();
//		
//	// re 1
//		System.out.println(driver.findElements(By.tagName("a")).size()); // link on whole page 
//		// Re 2
//	WebElement	fotterlink= driver.findElement(By.id("footer-part"));  // fotter section
//	System.out.println(fotterlink.findElements(By.tagName("a")).size());  // link on fotter section
//	
//	// Re 3: cal the total count on column first
//		  
//	WebElement ct=driver.findElement(By.cssSelector("div[class='col-lg-4 col-md-6']")); // first coulmn 
//	System.out.println(ct.findElements(By.tagName("a")).size()); // count 
//	
//	// Re 4:click on each link and open in seperate Tab
//	for (int i = 0; i < ct.findElements(By.tagName("a")).size(); i++) {
//
//		//ct.findElements(By.tagName("a")).get(i).click(); //--> if we use this new window will open & conrol will move as well next window so second link will not open due to locator not found in first page hence use above logic    
//		
//		String  clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
//		ct.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
//		
//		
//		// Re 5: open all the Tabs
//		Set<String> abc=driver.getWindowHandles();
//		Iterator <String> it= abc.iterator();
//		
//		while (it.hasNext()) {
//			
//			driver.switchTo().window(it.next());
//			System.out.println(driver.getTitle());
//			}
//}
//	
		//---------------------------------------part 98 and 99---------------------------------------------------------------------//f
//			Scanner sc = new Scanner(System.in);
//			String monthnumber=sc.nextLine();
//			String date=sc.nextLine();
//			String year=sc.nextLine();
			
		  String monthnumber="6";
			String date="15";
			String year="2027";

			
			 String[] str= {monthnumber,date,year};
		 
		  
		     driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
			  driver.manage().window().maximize();
			  driver.findElement(By.className("react-date-picker__inputGroup")).click();// open calender
			  driver.findElement(By.className("react-calendar__navigation")).click(); // click on month
			  driver.findElement(By.className("react-calendar__navigation")).click(); // again click on month
			
			   driver.findElement(By.xpath("//button[text()='"+year+"']")).click();  // selecting year
			   // selecting month
			   driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthnumber)-1).click();
			   // selecting date 
			   driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click(); 
			   
			   driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText(); // it doest have text info so go with below 
			   List<WebElement> move1=  driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
			   
			   for (int i = 0; i < move1.size(); i++) {
				   System.out.println(move1.get(i).getAttribute("value"));
				
				 // Assert.assertEquals(move1.get(i).getAttribute("value"),str[i]);  --> getting compile eror cheeck why?
				
				  
			}
			  
	
	}



}
