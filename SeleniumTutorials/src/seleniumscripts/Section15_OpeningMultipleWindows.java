package seleniumscripts;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Section15_OpeningMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Softwares\\Drivers\\msedgedriver.exe");
		EdgeOptions opme = new EdgeOptions();
		opme.setAcceptInsecureCerts(true);// use this when site is not private (SSL handling)
		opme.addArguments("--remote-allow-origins=*"); // use this when url is not launching 
		WebDriver driver = new EdgeDriver(opme);
		System.out.println("Microsoft Edge launch");
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		//Switching Window
		//driver.switchTo().newWindow(WindowType.TAB); // for new tab 
		driver.switchTo().newWindow(WindowType.WINDOW); // for window 

// now we will handle new tab or window transfer the control to child  and back to parent window
		Set<String> handles=driver.getWindowHandles();
         Iterator<String> it=handles.iterator();
          String parentWindowId = it.next();

		String childWindow =it.next();

		driver.switchTo().window(childWindow);

		driver.get("https://rahulshettyacademy.com/");

		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))

		.get(1).getText();

		driver.switchTo().window(parentWindowId);

		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
                    name.sendKeys(courseName);


		//Screenshot

		//File file=name.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(file, new File("logo.png")); // --> to solve this compile error we to add coommonIO jar files



		//GEt Height & Width

		System.out.println(name.getRect().getDimension().getHeight());

		System.out.println(name.getRect().getDimension().getWidth());

		//driver.quit();

		}



		

}


