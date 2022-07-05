package POM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExecution {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@Test(invocationCount=2)
	public void testa()
	{
		System.out.println("test1 executed");
	}
	
	@Test (enabled=false)
	public void test()
	{
		System.out.println("skip executed");
	}
	
	@Test()
	public void test1()
	{
		System.out.println("test2 executed");
	} 
	
	@Test(priority=1,timeOut=2000)
	public void login() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("test3 executed");
	}
	
	@Test(priority=2, dependsOnMethods={"login"}) 
	public void homePage()
	{
		System.out.println("test3 executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	
}
