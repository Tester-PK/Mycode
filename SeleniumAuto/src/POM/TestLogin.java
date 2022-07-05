package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Browser.OpenBrowser;
import Browser.Parametrization;

public class TestLogin {

    WebDriver driver;
    
	@BeforeMethod
	public void callbrowser() {
		driver=OpenBrowser.BrowswerUrlOpen("http://kite.zerodha.com/");
	}
	
	@Test
	public void LoginWithValidCredentials() throws EncryptedDocumentException, IOException {
		ZerodhaLogin Zerodhalogin=new ZerodhaLogin(driver);
		String username=Parametrization.getTestData(0, 1, "Credentials");
		Zerodhalogin.enterUserName(username);
		String pass=Parametrization.getTestData(1, 1, "Credentials");
		Zerodhalogin.enterPassword(pass);
		Zerodhalogin.clickOnLogin();
	}
	
	@Test
	public void LoginWitoutValidCredentials() throws EncryptedDocumentException, IOException {
		ZerodhaLogin Zerodhalogin=new ZerodhaLogin(driver);
		Zerodhalogin.clickOnLogin();
	}
	
}
