package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
			
				driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   Thread.sleep(3000);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.findElement(By.id("inputUsername")).sendKeys("rahul");
				driver.findElement(By.name("inputPassword")).sendKeys("hello123");
				driver.findElement(By.className("signInBtn")).click();
				System.out.println("login sucessfully");
				//driver.quit();
				//System.out.println("browsr is closed");
			
				

	}

}
