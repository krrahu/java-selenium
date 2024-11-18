package seleniumscripts;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Section13 {

	public static void main(String[] args) throws IOException {
		//--------------- opening/launch Microsoft edge (working fine )--------------------------//

		  System.setProperty("webdriver.edge.driver","C:\\Softwares\\Drivers\\msedgedriver.exe");
		  EdgeOptions opme= new EdgeOptions(); 
		 opme.setAcceptInsecureCerts(true);// use this when site is not private (SSL handling)
		  opme.addArguments("--remote-allow-origins=*"); // use this when url is not launching WebDriver driver= new EdgeDriver();
		  WebDriver driver= new EdgeDriver(opme);
		  System.out.println("Microsoft Edge launch");
		 // driver.get("https://expired.badssl.com/");
		
		  // -----------download file at any defined location--------------------//
//		  Map<String, Object> prefs = new HashMap<String, Object>();
//		 prefs.put("download.default_directory", "/directory/path");
//		  
		  //----------- handling a proxy server in selenium --------------------//
//		  Proxy proxy = new Proxy();
//		 proxy.setHttpProxy("ipaddress:4444");
//		 opme.setCapability("proxy", proxy);

		 
		
//		  driver.getTitle();
//		  driver.manage().window().maximize();
//		  driver.manage().deleteAllCookies();
//		  driver.manage().deleteCookieNamed("");
		  
		//------------------ to take screenshot---------------------------//
			//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(src, new File ("C:\\Users\\rkumar20\\screenshots\\pic.png"));
			
		  
		  //------------------ handle broken link (url)---------//
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		//SoftAssert a=new SoftAssert();
		
		//List<WebElement>	links= driver.findElements(By.xpath("//a")); --> try this if it works 
		
			for (WebElement link : links)
			{
				String url =link.getAttribute("href");
				HttpURLConnection con=(HttpURLConnection)new URL(url).openConnection();
				con.setRequestMethod("HEAD");
				con.connect();
				int response=con.getResponseCode();
				System.out.println(response);
				
				// one way using for each loop but here it stop exusting code once broken link found
				if (response>400)
				{
					System.out.println("The link text with link"+link.getText()+"is broken with code"+response);
					//Assert.assertTrue(false);
				}
		  
				// 2nd Way bu using soft assert , it will check all link 
				
              // a.assertTrue(response<400, "The link with Text"+link.getText()+" is broken with code" +response);
			              
			}
			// a.assertAll();  
			 
			}
	
		  	  
		  
	}
