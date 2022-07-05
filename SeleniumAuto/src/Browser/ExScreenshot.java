package Browser;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

public class ExScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("https://vctcpune.com/");
		
		Thread.sleep(3500);
		
		ScreenShot.screenshotMethod(driver, "Page") ;
		
		
	}
	

		
	}


