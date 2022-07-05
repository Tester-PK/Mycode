package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframeDemo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(5000);
		
		/*WebElement skipsignin= driver.findElement(By.xpath("//button[@id='btn2']"));
		
		skipsignin.click();
		
		Thread.sleep(5000);
		
	  WebElement dropdown= driver.findElement(By.xpath("(//a[@href=\"SwitchTo.html\"])[1]"));
		
	   dropdown.click();
	   
	   Thread.sleep(5000);*/
	   
	   WebElement frameoption= driver.findElement(By.xpath("//a[@href='Frames.html']"));
		
	   frameoption.click();
	   
		Thread.sleep(5000);
		
		WebElement iframe= driver.findElement(By.xpath("(//iframe[@name='SingleFrame']"));
		
		driver.switchTo().frame(0);// switch by index
		driver.switchTo().frame("singleframe");//switch by id
		driver.switchTo().frame(iframe);//switch by WebElement
		
		WebElement input= driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("Velocity");
		driver.close();
		
	}
}
