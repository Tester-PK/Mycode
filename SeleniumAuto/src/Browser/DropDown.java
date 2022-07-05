package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		//Example with select class 
		
	/*	WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://vctcpune.com/selenium/practice.html");
	
		WebElement list=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select sel=new Select(list);   ////option[text()='Option2']
		
		// below 3 are methods of Select class
		
		sel.selectByIndex(3);//  
		//sel.deselectByValue("option3");
		//sel.deselectByVisibleText("Option3");
		*/
		
		/*	WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://vctcpune.com/selenium/practice.html");
		
		WebElement list=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		Select sel=new Select(list);   ////option[text()='Option2']
		
		// below 3 are methods of Select class
		
		sel.selectByIndex(3);//  
		//sel.deselectByValue("option3");
		//sel.deselectByVisibleText("Option3");
		*/
		
		//Example with without using select class 
		
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://demo.guru99.com/");
		
		WebElement field=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		field.click();
		Thread.sleep(3000);
		
		WebElement list1=driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
		list1.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		field.click();
		
		WebElement list2=driver.findElement(By.xpath("//a[text()='Radio & Checkbox Demo']"));
		list2.click();
		
		driver.navigate().back();
		
	}
}