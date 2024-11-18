package seleniumscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Section15NewLocators {

	public static void main(String[] args) {
		// --------------- opening/launch Microsoft edge (working fine
		// )--------------------------//

		System.setProperty("webdriver.edge.driver", "C:\\Softwares\\Drivers\\msedgedriver.exe");
		EdgeOptions opme = new EdgeOptions();
		opme.setAcceptInsecureCerts(true);// use this when site is not private (SSL handling)
		opme.addArguments("--remote-allow-origins=*"); // use this when url is not launching 
		WebDriver driver = new EdgeDriver(opme);
		System.out.println("Microsoft Edge launch");
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));

		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));

		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();

		WebElement iceCreamLabel = driver
				.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

		WebElement rdb = driver.findElement(By.id("inlineRadio1"));

		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());

	}

}
