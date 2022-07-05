package Browser;


import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ChildBrowserPop {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://vctcpune.com/");
	WebElement selenium= driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
	LocalDateTime now=LocalDateTime.now();
	String d=dtf.format(now);
	
	ScreenShot.screenshotMethod(driver, "Page");
	
	selenium.click();
	Thread.sleep(3000);
	selenium.click();
	Thread.sleep(3000);
	selenium.click();
	
	//String mainpage=driver.getWindowHandle();

		
	Set<String> address=driver.getWindowHandles();
	
	
/**************handle child browser popup by using iterator method **********************************************
	
	Iterator<String> i=address.iterator();//<String> is a generic which tells us which type of data our set has...in this case String type of data
	
	while(i.hasNext())// it returns true if more element is present in set iteration
	{
		driver.switchTo().window(i.next());//     next() returns the next element/ next value present in iteration of set 
		String actualTitle=	driver.getTitle();
		String expectedTitle="Practice Page";
		if(actualTitle.equals(expectedTitle))
		{
		
         WebElement radio1= driver.findElement(By.xpath("//input[@value=\"Radio1\"]"));
	     radio1.click();
		 //break;//it will stop once the expected condition is met
	   }*/
	
	//**************handle child browser popup by using array<list> class**********************************************
	
	ArrayList<String> list=new ArrayList(address);
    System.out.println(list.get(0));	//main page address
    System.out.println(list.get(1));    //last page address
    System.out.println(list.get(2));   //second page address 
    System.out.println(list.get(3));   //first page address
    
    try{
    	System.out.println(list.get(4));// this is java- IndexOutOfBoundsException runtime exception 
    }
    catch(IndexOutOfBoundsException e)
    {
    	System.out.println("handled by try catch method");
    	
    }
	System.out.println(list.size());
	
	for(int a=0; a<list.size(); a++)
	{
	driver.switchTo().window(list.get(a));
	String actualTitle=	driver.getTitle();
	String expectedTitle="Practice Page";
	if(actualTitle.equals(expectedTitle))
	{
	
     WebElement radio1= driver.findElement(By.xpath("//input[@value=\"Radio1\"]"));
     radio1.click();
	 //break;//it will stop once the expected condition is met
   }


	}
	
	
 }
}