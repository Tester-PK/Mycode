package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	
	
	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Thread.sleep(5000);
		
		WebElement iframe= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(iframe);
		
		Thread.sleep(5000);
		
		WebElement image= driver.findElement(By.xpath("//li[contains(@class,'ui-widget-content')]"));
		
		WebElement target= driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act=new Actions(driver); // Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
		
		act.dragAndDrop(image, target);
		
		act.perform();
		*/


		
		//draganddrop by using clickAndHold
		
        WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		Thread.sleep(5000);
	    WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']")); 
		WebElement titleB = driver.findElement(By.xpath("//li[text()= 'B']")); 
	    Actions actions = new Actions(driver); 
	    actions.moveToElement(titleC).perform(); 
		actions.clickAndHold().perform(); // Call clickAndHold() method to perform click and hold operation. 
		actions.moveToElement(titleB).perform(); 
		actions.release().perform();
		  
  
		//actions.moveByOffset(100,200);//
		//actions.perform();
		
		//actions.dragAndDropBy(image, 500,200);// click and hold image location and move to muse to the offset position and release the mouse 
		//actions.perform();
		
	}
}
