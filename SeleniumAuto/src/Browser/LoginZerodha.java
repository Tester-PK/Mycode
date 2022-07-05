package Browser;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginZerodha 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
	WebDriver driver=OpenBrowser.BrowswerUrlOpen("http://kite.zerodha.com/");
	
	Thread.sleep(7000);
	
	String userName=Parametrization.getTestData(0, 1, "Credentials");  // this is called data driver testing as data is extracted to test from test date_excelsheet test the functionality 
	WebElement userId= driver.findElement(By.xpath("//input[@id='userid']"));
    userId.sendKeys(userName);
    
    String pass=Parametrization.getTestData(1, 1, "Credentials");
    WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
    password.sendKeys(pass);
     
    WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
    login.click();
    
    Thread.sleep(7000);
    
    String pinNumber=Parametrization.getTestData(2, 1, "Credentials");
    WebElement pin= driver.findElement(By.xpath("//input[@id='pin']"));
    pin.sendKeys(pinNumber);
    
    WebElement pinSubmit= driver.findElement(By.xpath("//button[@type='submit']"));
    pinSubmit.click();
    
    
    }

		
	}

