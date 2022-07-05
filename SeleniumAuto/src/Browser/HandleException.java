package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleException {

	public static void main(String[] args)
	{
		System.out.println("testing start");
		
		for(int a=1; a<1;a++)    // this is logical error due to logic not correct but this will not run and not shown o/p at console  // compile time error due to syntax error  
		{
			
			System.out.println("compilation error");
		}
		

		WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://vctcpune.com/selenium/practice.html");
		
		WebElement hide= driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();
		
		try {
		WebElement text= driver.findElement(By.xpath("//input[@id='displayed-text]")); 
		text.sendKeys("display");
		}
		catch(Exception e) {
			System.out.println("field was not available");// selenium- NoSuchElementException this is run time exception handled by try-catch method 
		}
		try
		{
			
		ScreenShot.screenshotMethod(driver, "Pagetest");// java-IOException is compile time exception handled by try-catch method
		}
		catch(Exception e) 
		{
			System.out.println("Handle code");
			
			
		}
		System.out.println("testingmiddle");
		try 
		{
			
		int a=20;
		int b=0;
		int c=a/b;  //// java-ArithmaticException is run time exception handled by try-catch method
		System.out.println("risky code");
		}
		catch(Throwable e)  // we can write (Exception e) alos 
		{
			System.out.println("Handle code");
		}
		System.out.println("exception handled withput abnormal termination of code");
		}
	
	}


