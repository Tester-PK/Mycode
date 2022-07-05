package Browser;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Autosele\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://vctppune.com/");// get method is help us to open a url on browser
		
		driver.navigate().to("https://www.facebook.com/");   // to open url
		driver.navigate().back();    // to go to previous page of browser
		driver.navigate().forward();  // to go to next page of browser
		driver.navigate().refresh();   // to refresh the web page
		
		String actualTitle="Velocity | Pune's Best Software Testing Center ";
		String currentTitle= driver.getTitle();
		
		if (actualTitle.equals(currentTitle)) {
			System.out.println(" Title is matching");
		}
	
		else {
			System.out.println(" Title is incorrect");
			
		}
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.manage().window().maximize();  //miximize the browser
		driver.manage().window().minimize();  //minimize the browser
		
		Dimension d=new Dimension(2000,3000);  
		driver.manage().window().setSize(d);   // to change the size of browser
		
		Point p=new Point(500,600);
		driver.manage().window().setPosition(p);   // to change the position of browser
		
	}
	
}