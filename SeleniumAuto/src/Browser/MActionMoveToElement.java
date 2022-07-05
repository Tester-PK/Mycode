package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MActionMoveToElement {


public static void main(String[] args) throws InterruptedException {
	WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://www.amazon.in/");
	Thread.sleep(5000);
	WebElement mouseover= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	
	Actions act=new Actions(driver);
	act.moveToElement(mouseover);
	act.perform();
	
	WebElement account= driver.findElement(By.xpath("//span[text()='Your Orders']"));
	Thread.sleep(5000);
	account.click();
	
	
}
	
	
}
