package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

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
				driver.findElement(By.id("inputUsername")).sendKeys("rahul");
				driver.findElement(By.name("inputPassword")).sendKeys("hello123");
				driver.findElement(By.className("signInBtn")).click();
		          System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // when crendial is wrong 
				System.out.println("login un sucessfully");
				
				driver.findElement(By.linkText("Forgot your password?")).click();
				System.out.println("naviagte to gorgot password page");
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("test");
				driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@gmail.com");
				driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("98878798798");
				driver.findElement(By.className("reset-pwd-btn")).click();
				System.out.println(driver.findElement(By.className("infoMsg")).getText());
				
				driver.findElement(By.xpath("//input[@type='text'][3]")).clear();
				driver.findElement(By.cssSelector("input[type='text']:nth-child(5)")).sendKeys("99999999");
				
				//System.out.println("login sucessfully");
				
				//driver.quit();
				//System.out.println("browsr is closed");
			
				System.out.println();

	}

}
