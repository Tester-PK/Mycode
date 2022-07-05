package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframeWithinIframe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("http://demo.automationtesting.in/Frames.html");
		
		/*
		WebElement skipsignin= driver.findElement(By.xpath("(//button[@id='btn2']"));
		
		skipsignin.click();
		*/
		
		
		WebElement iframe= driver.findElement(By.xpath("(//a[@href='#Multiple']"));
		iframe.click();
		
		WebElement outeriframe= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(1);
		/*
		driver.switchTo().frame(outeriframe);  */
		
		WebElement inneriframe= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inneriframe);
		inneriframe.sendKeys("Velocity");
		
		Thread.sleep(5000);
		
		
	 driver.switchTo().parentFrame();
	
	 
	 driver.switchTo().defaultContent();
	 
	//	driver.close();
		
	}
}
