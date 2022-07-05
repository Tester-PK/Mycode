package Browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpAlert {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://nxtgenaiacademy.com/alertandpopup/");
	
	WebElement alertBox= driver.findElement(By.xpath("//button[@name='alertbox']"));
	
	WebElement confirmAlert= driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
	
	WebElement promptAlertBox= driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
	
	/*alertBox.click();
	/Alert a= driver.switchTo().alert();
	Thread.sleep(3000);
	a.accept();
	
	confirmAlert.click();
	Alert a= driver.switchTo().alert();
	System.out.println(a.getText());
	a.dismiss();*/
	
	promptAlertBox.click();
	Alert a= driver.switchTo().alert();
	Thread.sleep(3000);
	a.sendKeys("No");
	Thread.sleep(3000);
	a.accept();
	
}
}
