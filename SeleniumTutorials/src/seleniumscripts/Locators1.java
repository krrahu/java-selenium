package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators1 {

	// dynamically submitting the Password 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*"); // use this when url is not launching
	    WebDriver driver= new ChromeDriver(op);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String PWD=getpwd(driver);// calling getpwd method 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(PWD);// password filed
		driver.findElement(By.className("signInBtn")).click();
		System.out.println("login sucessfully");

	}

	// creating a method to store password in variable and use it in login instead of hardcode
	public static String getpwd(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//  (step -click on Forgot your password?)
		driver.findElement(By.linkText("Forgot your password?")).click();
		// (step -reset login and store error message)
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	
        String passwordText= driver.findElement(By.className("infoMsg")).getText();
        
        // Please use temporary password 'rahulshettyacademy' to Login.
        
    String[] passwordArray  =  passwordText.split("'");
//    String[] passwordArray1  =  passwordArray[1].split("'");
//    String PWD=passwordArray1[0];
    String PWD=passwordArray[1].split("'")[0];
    return PWD;
    
    //1st split 
    // 0th index -Please use temporary password
    // 1st index - rahulshettyacademy' to Login. --> this will capture
    
    //2nd time  split 
    // 0th index -rahulshettyacademy --> this will capture
    // 1st index - to Login.
    
	}
}
