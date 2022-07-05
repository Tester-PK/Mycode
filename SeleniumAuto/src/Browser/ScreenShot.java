package Browser;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot {

		
public static void screenshotMethod(WebDriver driver, String name) throws IOException, InterruptedException {
		
	SimpleDateFormat formatter=new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
	Date date=new Date();
	String datetime=formatter.format(date);
	System.out.println(datetime);
	
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Thread.sleep(3500);
		
		File destination=new File("C:\\Users\\hp\\Documents\\Testing\\SeleAutoNotes\\Screenshot\\"+name+""+datetime+".jpg");
		
		FileHandler.copy(source, destination);		
} 
	

}