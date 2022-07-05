package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import Browser.OpenBrowser;
import Browser.Parametrization;

public class LoginTest {

	public void LoginWithValidCredentials() throws EncryptedDocumentException, IOException
	{
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("http://kite.zerodha.com/");
		ZerodhaLogin Zerodhalogin=new ZerodhaLogin(driver);
		String username=Parametrization.getTestData(0, 1, "Credentials");
		Zerodhalogin.enterUserName(username);
		String pass=Parametrization.getTestData(1, 1, "Credentials");
		Zerodhalogin.enterPassword(pass);
		Zerodhalogin.clickOnLogin();
	}
	
	public void LoginWithInvalidCredentials() throws EncryptedDocumentException, IOException
	{
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("http://kite.zerodha.com/");
		ZerodhaLogin Zerodhalogin=new ZerodhaLogin(driver);
		String username=Parametrization.getTestData(0, 2, "Credentials");
		Zerodhalogin.enterUserName(username);
		String pass=Parametrization.getTestData(1, 2, "Credentials");
		Zerodhalogin.enterPassword(pass);
		Zerodhalogin.clickOnLogin();
	}
	
	public void LoginWithInvaildUsernameCredentials() throws EncryptedDocumentException, IOException
	{
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("http://kite.zerodha.com/");
		ZerodhaLogin Zerodhalogin=new ZerodhaLogin(driver);
		String username=Parametrization.getTestData(0, 2, "Credentials");
		Zerodhalogin.enterUserName(username);
		String pass=Parametrization.getTestData(1, 1, "Credentials");
		Zerodhalogin.enterPassword(pass);
		Zerodhalogin.clickOnLogin();
	}
	
	public void LoginWithInvaildPasswordCredentials() throws EncryptedDocumentException, IOException
	{
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("http://kite.zerodha.com/");
		ZerodhaLogin Zerodhalogin=new ZerodhaLogin(driver);
		String username=Parametrization.getTestData(0, 1, "Credentials");
		Zerodhalogin.enterUserName(username);
		String pass=Parametrization.getTestData(1, 2, "Credentials");
		Zerodhalogin.enterPassword(pass);
		Zerodhalogin.clickOnLogin();
	}
	
	public void LoginWithoutCredentials() throws EncryptedDocumentException, IOException
	{
		WebDriver driver=OpenBrowser.BrowswerUrlOpen("http://kite.zerodha.com/");
		ZerodhaLogin Zerodhalogin=new ZerodhaLogin(driver);
		Zerodhalogin.clickOnLogin();
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		LoginTest logintest=new LoginTest();
		logintest.LoginWithValidCredentials();
		logintest.LoginWithInvalidCredentials();
		logintest.LoginWithInvaildUsernameCredentials();
		logintest.LoginWithInvaildPasswordCredentials();
		logintest.LoginWithoutCredentials();
	}
}
