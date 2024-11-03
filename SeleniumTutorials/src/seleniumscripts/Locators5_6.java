package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Assert;

public class Locators5_6 {

	public static void main(String[] args) throws InterruptedException {
		// chrome launch 
				
				
			System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
				ChromeOptions op= new ChromeOptions();
				op.addArguments("--remote-allow-origins=*"); // use this when url is not launching
			    WebDriver driver= new ChromeDriver(op);
				
		//	ChromeDriver driver= new ChromeDriver(); --> do use this always use WebDriver parent reference
			
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				// id Locator (step 1)
				driver.findElement(By.id("inputUsername")).sendKeys("rahul");
				// name Locator
				driver.findElement(By.name("inputPassword")).sendKeys("hello123");
				// class name Locator (step 1)
				driver.findElement(By.className("signInBtn")).click();
				// css locator ((step 1)
		   System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // when credentials is wrong 
				System.out.println("login unsucessfully due to inccorect PWD or UN"); 
				
				// link text Locator (step 2-click on Forgot your password?)
				driver.findElement(By.linkText("Forgot your password?")).click();
				System.out.println("naviagte to forgot password screen");
				
				// X-path and CSS  Locator (step 3-enterning the values for name,email,phone number)
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("test");
				driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@gmail.com");
				driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("98878798798");
				
				// class name Locator (step 4-reset login and store error message)
				driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
				
			    System.out.println(driver.findElement(By.className("infoMsg")).getText()); // error message
			    System.out.println(" reset button clicked and error messge captuured ");
			    
				// storing text of reset login button -some extra validation
			    System.out.println(driver.findElement(By.className("reset-pwd-btn")).getText()); 
			    // some extra validation (
				driver.findElement(By.xpath("//input[@type='text'][3]")).clear();
				driver.findElement(By.cssSelector("input[type='text']:nth-child(5)")).sendKeys("99999999");
				driver.findElement(By.cssSelector("input[type='text']:nth-child(5)")).clear();
				driver.findElement(By.xpath("//form/input[3]")).sendKeys("12121212");
				
				// xpath Locator (step 4- click on Go to login page button)
				
				driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
				Thread.sleep(2000);
				
				
				// step 6:- entered correct UN and PWD > select Remember my username check box > click on sign
				
				driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("rahul");
				//driver.findElement(By.cssSelector("Input[type*=’pass’]")).sendKeys("rahulshettyacademy"); // partial text
				driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
				driver.findElement(By.cssSelector("#chkboxOne")).click();
				driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
				//driver.findElement(By.className("signInBtn")).click();
				
				System.out.println("login sucessfully");
				// get and store and print success message 
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//p[@xpath='1']")).getText(); // Xpath
			System.out.println(driver.findElement(By.tagName("p")).getText());//  tag name 
			//Assert.assertEquals("","");
				
				
				// step 7:-  logout 
				driver.findElement(By.className("logout-btn")).click();
				
                // driver.quit();
				// System.out.println("browsr is closed");
			
			

	}

}
