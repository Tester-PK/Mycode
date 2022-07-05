package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLogin {

	@FindBy(xpath="//input[@id='userid']")private WebElement userName;   
	//@Find= diver.findElement
	
	@FindBy(xpath="//input[@id='password']")private  WebElement password;
	
    @FindBy(xpath="//button[@type='submit']")private WebElement login;
    
    @FindBy(xpath="//input[@id='pin']")private WebElement pin;
    
	@FindBy(xpath="//button[@type='submit']")private WebElement pinSubmit;
	
	@FindBy(xpath="//a[text()='Change user']")private WebElement chnageUser;
	
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgotPassword;
	
	@FindBy(xpath="")private WebElement signUpAccount;
	
	public ZerodhaLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);// PageFactory.initElements this will find the all the elements declared at the start 	
	}
	
	public void enterUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void enterPassword(String pass){
		password.sendKeys(pass);
	}
	
	public void clickOnLogin(){
		login.click();
	}
	
	public void enterPin(String pinNumber){
		pin.sendKeys(pinNumber);
	}
	
	public void clickOnPinSubmit(){
		pinSubmit.click();
	}

	public void clickOnChnageUser(){
		chnageUser.click();
	}
	
	public void clickOnForgotPassword(){
		forgotPassword.click();
	}
	
	public void clickOnSignUpAccount(){
		signUpAccount.click();
	}
}
