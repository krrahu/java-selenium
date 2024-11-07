package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowsactivity {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*"); // use this when url is not launching
	    WebDriver driver= new ChromeDriver(op);
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();
	    driver.navigate().to("https://rahulshettyacademy.com/");
	    driver.navigate().back();
	    Thread.sleep(4000);
	    driver.navigate().forward();
	    System.out.println("end");

	}

}
