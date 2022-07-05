package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://www.facebook.com/");
		
		/*WebElement login= driver.findElement(By.tagName("button"));// locator by tagName
		
		WebElement userName= driver.findElement(By.id("email"));// locator by id
		
		WebElement pass= driver.findElement(By.name("pass"));// locatXFTor by name
		
		//WebElement forgot= driver.findElement(By.id("login_link"));// locator by id******************************************
		
		userName.sendKeys("Velocity");// sendKeys is method of WebElement 
		
		Thread.sleep(3000);
		
		pass.sendKeys("katraj"); // sendKeys is method of WebElement 
		
		Thread.sleep(3000);  // for this we add throws InterruptedException
		
		login.click(); // click is method of WebElement     ***************************************************************
		
       //Thread.sleep(3000);  // for this we add throws InterruptedException
		
       //forgot.click(); // click is method of WebElement 
		
		
		WebElement userName= driver.findElement(By.cssSelector("input[id='email']")); //locator by css    tagname[atrribute= "attributevalue"]
		

		WebElement pass= driver.findElement(By.cssSelector("input[type='password']"));//locator by css    tagname[atrribute= "attributevalue"]
	
		WebElement logn= driver.findElement(By.id("loginbutton")); //locator by id
		
		userName.sendKeys("Velocity");
		Thread.sleep(3000);
		pass.sendKeys("Katraj");
		Thread.sleep(3000);
		logn.click();
		
		//WebElement forgot= driver.findElement(By.linkText("Forgotten password'")); //locator by text
       //forgot.click();
				
	
		//WebElement forgot= driver.findElement(By.partialLinkText("Forgotten")); //locator by text
		///forgot.click();*/
		
        WebElement userName= driver.findElement(By.xpath("//input[@id='email']")); //locator Xpath by atrribute  //tagname[@atrribute= "attributevalue"]
		

		WebElement pass= driver.findElement(By.xpath("//input[@name='pass']"));
	
		WebElement log= driver.findElement(By.xpath("//button[contains(@data-testid, royal_login)]"));  // loator xpath by contains   //tagname[contains(@attributename, partialAttributeValue)] 
		
		/*WebElement forgot= driver.findElement(By.xpath("//a[text()='Forgotten password']"));  //locator Xpath by text //tagname[text()= "textvalue"]
		
		
		WebElement create= driver.findElement(By.xpath("//a[@rel='async']"));*/
		
		userName.sendKeys("Velocity");
		
		Thread.sleep(3000);
		
		//userName.clear(); 
		
		pass.sendKeys("katraj");
		
		Thread.sleep(3000);
		
		log.click();
		
		/*forgot.click();
		
		create.click();*/
		
	
		
		
	}
}
