package seleniumscripts;

//import selenium.webdriver.chrome.options  
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;

public class Section7_DropSelection {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
			ChromeOptions op= new ChromeOptions();
			//op.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));// handling multiple opening pop-up 
			op.addArguments("--remote-allow-origins=*"); // use this when url is not launching
			op.addArguments("--disable-notifications"); // used to habled allow cancel notification 
		    WebDriver driver= new ChromeDriver(op);		    		
		    
		    // ------------------part - 52 ------------------
		    
//		    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		   WebElement el= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 //select[@xpath='1'] or //select[@id='ctl00_mainContent_DropDownListCurrency'] or css--> select[name='ctl00$mainContent$DropDownListCurrency']
 
		   //System.out.println(el.getText());
		 //this is drop so we need to perform click so we will use selct class
//		   Select dropdown= new Select (el);
//		   dropdown.selectByIndex(3);
//		 System.out.println(dropdown.getFirstSelectedOption().getText()); // text of seected value from down 
//		 dropdown.selectByVisibleText("AED"); // from drop down text 
//		 System.out.println(dropdown.getFirstSelectedOption().getText()); 
//		 dropdown.selectByValue("INR"); // this attribute value take it by inspecting the filed
//		 System.out.println(dropdown.getFirstSelectedOption().getText());  
		 
		 //------------------ part -53  ()------------------
		driver.navigate().to("https://www.spicejet.com/");
	
		
		 driver.manage().window().maximize();
		 System.out.println("screen got maximize");
		
		// opening passenger drop down 
	
		 driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']")).click();
		 System.out.println("test 1"); 
			// click on add Adult  passenger 
		 driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click(); // for single selection 
	
		 System.out.println("test 2");
		
		 // selecting passenger count by using loop by using while or for loop
		 
		 // 1st way - while loop
//		 int i=1;
//		 while (i<5)
//		 {
//			 driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click(); 
//			 i++;
//			 
//		 }
		 
		 // 2nd way -for loop 
		 for (int j = 0; j < 5; j++) {
			 driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click(); 
		}
		 
	// clicking on done button	 
	 driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		 driver.close();
		 
	// -----------------55 dynamic dropdown ( interview)( revisit due to spice jet pop-up issue)-----------------
		    
		// driver.navigate().to("https://www.spicejet.com/");
		 
		//div[contains(text(),'IXB')]--> xpath 
		//  //a[@value='MAA']  - Xpath for chennai
		//  //a[@value='BLR']


//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        driver.findElement(By.xpath("//a[@value='BLR']")).click();
//
//		Thread.sleep(2000);
//         driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//	
         // ------------------56 (parent child x path) ( revisit due to spice jet pop-up issue)------------------
         
         
         // ------------------58 ( handling auto suggestive dropdowns using selenium WebElement------------------
         
//          driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//          driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("ind");
//          // li[class='ui-menu-item']:nth-child(1)
//          Thread.sleep(2000);
//          List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//          
//          for (WebElement webElement : options) {
//        	  if (webElement.getText().equalsIgnoreCase("India")) {
//        		  webElement.click();
//        		  System.out.println("india is selected");
//        		  
//			} 
//        	  else {
//System.out.println("check xpath is wrong");// why  this is printing if  
//			}
//			
//		}
  
		    
		    // ------------------part - 60 (spice jet- checkbox removed so use any other url )--------- ---------//
          
        //  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
          
       
       // first check box with out selecting
      // System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); 
    // first check box selected
        // driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click(); 
      // partial text
       //  System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); 
        // System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']:nth-child(1)")).getText());
     
        
         // input[type='checkbox'] --> totalcount of checkbox
       // System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());
         
       // ----------------------------------Assertion(part 61)----------------------------------
//        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//        System.out.println("assertion pass");
//       Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//       System.out.println("assertion failed next line of code will not execute");
//      
       
       // ------------------part - 63 (calendar using , we revist this in future session )------------------//
       
     //  driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    //  driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();// open calender 
     // driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight")).click(); //directly select current date 
       
       
   
       // ---------part 64- checking calendar is enabled or not ------------//
//       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//      System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));// getting attributes for return date calender
//      driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']")).click(); // round trip 
//      System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // getting attributes for return date calender  when round trip i.e 1
//      driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click(); // one way 
//      
//      if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) 
//      {
//		
//    	  System.out.println("it's enabled for round trip i.e  1 ");
//    	  Assert.assertTrue(true);
//    	  
//	} else {
//
//		System.out.println("it's disabled for one way trip i.e 0.5");
//		Assert.assertTrue(true);
//	}
//      
//      
//  
	
	// ---------part 66- end to end (spice jet)------------//
	//  opem url>select  from and to destination> select dept date > select passenger>select student checkbox
	
	
	// ---------part 68 (spice jet)------------//
		    //driver.navigate().to("https://www.spicejet.com/");
		  // Thread.sleep(8000);
		   //driver.switchTo().alert().dismiss(); 
		    
		    
//		    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		 // signle buttom on alert 
//		   driver.findElement(By.id("name")).sendKeys("Alert - test");
//		   driver.findElement(By.id("alertbtn")).click();
//		   System.out.println(driver.switchTo().alert().getText());
//		    driver.switchTo().alert().accept();
//	
//		 // 2 buttons on alert 
//		    
//		    driver.findElement(By.id("name")).sendKeys("cofirm -test");
//		    driver.findElement(By.cssSelector("[id='confirmbtn']")).click(); // 
//		    System.out.println(driver.switchTo().alert().getText());
//		    driver.switchTo().alert().dismiss();
//		    
		    
		    
		    //-----------------------------------------------------------------------------------//
		   // driver.quit();
			}
}
