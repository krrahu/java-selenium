package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//extends OpeningBrowser
public class Loginpage  {
	
	public static void main(String[] args) throws InterruptedException {
		OpeningBrowser.OpenChromebrowser();
		Thread.sleep(5000);
		Loginpage.login(null);
		//return void;

	}
	
 
		public static void login(WebDriver driver)
		{
			
	// step 6:- entered correct UN and PWD > select Remember my username check box > click on sign
	//WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("rahul");
	driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("#chkboxOne")).click();
	driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	//driver.findElement(By.className("signInBtn")).click();
	System.out.println("login sucessfully");
		}
	

}
