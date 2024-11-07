package seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rca {

	public static void main(String[] args) throws InterruptedException {

		/*chrome launch*/
				System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.google.co.in/");
				//Thread.sleep(3000);
				
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.quit();
				//driver.close();

	}

}
