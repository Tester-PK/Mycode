package Browser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MockTest {

public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://Autosele//chromedriver_win32//chromedriver.exe");

			WebDriver driver=new ChromeDriver();

			driver.get("https://www.myvi.in/");
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.manage().window().minimize();
			Thread.sleep(3000);
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(3000);
			
			File desitination= new File("C:\\Users\\hp\\Documents\\Testing\\SeleAutoNotes\\Screenshot\\abc.jpg");
			Thread.sleep(3000);
			
			
			FileHandler.copy(source, desitination);
			
			WebElement add= driver.findElement(By.xpath("//button[@id='close']"));
			WebElement acctype= driver.findElement(By.xpath("//label[@for='radio-1-set'])[1]"));
			WebElement acctype1= driver.findElement(By.xpath("//label[@for='radio-1-set'])[1]"));
		
			
			
}

}
