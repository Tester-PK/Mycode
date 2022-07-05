package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser 
{

public static WebDriver BrowswerUrlOpen (String url) {  // this method returns the WebDriver which is driver 
		
	System.setProperty("webdriver.chrome.driver", "C:\\Autosele\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
    driver.manage().window().maximize();
    return driver;
    
	}




}

