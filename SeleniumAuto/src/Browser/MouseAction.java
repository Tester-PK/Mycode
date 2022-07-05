package Browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction 
{

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClick= driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		
		act.contextClick(rightClick);// to perform right click
		act.perform();//to perform the above action
		
		Thread.sleep(5000);
		
		WebElement option= driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-delete context-menu-visible']"));
		Thread.sleep(5000);
		option.click();
		Thread.sleep(5000);
        Alert a=driver.switchTo().alert();
    	Thread.sleep(5000);
        a.accept();
        
		//act.doubleClick(option);
		//act.perform();
		
		
		
	}
}
