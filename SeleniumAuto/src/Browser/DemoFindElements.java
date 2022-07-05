package Browser;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DemoFindElements {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Thread.sleep(5000);
		
		WebElement iframe= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(iframe);
		
		Thread.sleep(5000);
		
		List <WebElement> source= driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content')]"));
		
         WebElement target= driver.findElement(By.xpath("//div[@id='trash']"));
		
		for(int i=0; i<source.size(); i++)
		{
			Actions act=new Actions(driver);
			act.dragAndDrop(source.get(i), target);
			act.perform();
			
		}		
				
				
		
	}
}
