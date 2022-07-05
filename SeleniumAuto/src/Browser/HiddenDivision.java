package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://www.facebook.com/");
		
		WebElement create= driver.findElement(By.xpath("//a[@rel='async']"));
		create.click();
		Thread.sleep(3000);
		
		WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("abc");
		Thread.sleep(3000);
		
		WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("def");
		Thread.sleep(3000);
		
		WebElement mobileNumber= driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobileNumber.sendKeys("1234567890");
		Thread.sleep(3000);
		
		WebElement pass= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("1233abnsR@1");
		Thread.sleep(3000);
		
		WebElement dd= driver.findElement(By.xpath("//select[@id='day']"));
		dd.click();
		
		Select sel=new Select(dd);
		sel.selectByVisibleText("10");
		Thread.sleep(3000);
		
		WebElement mm= driver.findElement(By.xpath("//select[@id='month']"));
		Select sl=new Select(mm);

		sl.selectByVisibleText("Aug");
		Thread.sleep(3000);
		
		WebElement yy= driver.findElement(By.xpath("//select[@id='year']"));
		Select se=new Select(yy);
		se.selectByVisibleText("1996");
		Thread.sleep(3000);
		
		WebElement gender= driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		gender.click();
		Thread.sleep(3000);
		
		WebElement signUp= driver.findElement(By.id("//button[@name='websubmit']"));
		signUp.click();
			
		}
}
