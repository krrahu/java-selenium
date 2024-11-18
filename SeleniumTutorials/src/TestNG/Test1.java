package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 { 
	
	@BeforeClass
	public void BC()
	{
		System.out.println("  -->@Beforeclassis excuting");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("  -->@Afterclassis excuting");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("-->@BeforeMethod is excuting");

	}
	// 
	@AfterMethod
	public void am()
	{
		System.out.println("-->@AfterMethod is excuting");

	}
	@BeforeSuite
	public void BS() {
		System.out.println(" -->@BeforeSuite is excuting");

	}
	
	@AfterSuite
	public void AS() {
		System.out.println(" -->@AfterSuite is excuting");

	}

	@BeforeTest
	public void BT() {
		System.out.println("-->@BeforeTest is  excuting");
	}

	@Test
	public void test() {
		System.out.println("--> @Test is excuting ");

	}
	@AfterTest
	public void AT() {
		System.out.println(" -->@AfterTest is excuting");

	}

	

	

}
