package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Rca {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
				System.setProperty("webdriver.edge.driver", "C:\\Softwares\\Drivers\\msedgedriver.exe");
				EdgeOptions opme = new EdgeOptions();
				opme.setAcceptInsecureCerts(true);// use this when site is not private (SSL handling)
				opme.addArguments("--remote-allow-origins=*"); // use this when url is not launching 
				WebDriver driver = new EdgeDriver(opme);
				System.out.println("Microsoft Edge launch");
				driver.get("https://rahulshettyacademy.com/angularpractice/");
				String title=driver.getTitle();
				System.out.println(driver.getCurrentUrl());
				
				//System.out.println(driver.getTitle());
				System.out.println(title);
				String exptitle= "ProtoCommerce";

				while (title.equalsIgnoreCase(exptitle)) {
					System.out.println("title match");
					return ;
				}
				
				driver.quit();
				//driver.close();

	}

}
