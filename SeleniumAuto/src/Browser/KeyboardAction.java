package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

public static void main(String[] args) throws InterruptedException {
		
		
WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://demoqa.com/text-box");
		
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		
		WebElement userName= driver.findElement(By.xpath("//input[@id='userName']"));
		userName.sendKeys("pradeep");
		
		act.sendKeys(Keys.TAB);
		act.perform();
		act.sendKeys("pradeep@gmail.com");
		act.perform();
		
		act.sendKeys(Keys.TAB);
		act.perform();
		act.sendKeys("Velocity katraj");
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		WebElement submit=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		
		JavascriptExecutor execute=((JavascriptExecutor)driver);
	//execute.executeAsyncScript("arguments[0].scrollIntoView(true)", submit);//will scroll till the element is visible
		execute.executeScript("window.scrollBy(100,500)");// by using page coordinates 
		act.sendKeys(Keys.TAB);
		act.perform();
		act.click();
		act.perform();
		
		/*act.keyDown(Keys.SHIFT);  // to re
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.TAB);
		act.keyUp(Keys.SHIFT);
		act.build().perform();
		*/

		
		
	
	}

}
