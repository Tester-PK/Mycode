package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement accountList;
	
	@FindBy(xpath="(//span[ @class='nav-action-inner'])[1]")private WebElement signInOption;
	
	@FindBy(xpath="//input[@id='ap_email']")private WebElement userNameEmail;
	
	@FindBy(xpath="//input[@id='continue']")private WebElement continueButton;
	
	@FindBy(xpath="//span[@class='a-expander-prompt']")private WebElement needHelp;
	
	@FindBy(xpath="//a[@id='auth-fpp-link-bottom']")private WebElement forgotPassword;
	
	@FindBy(xpath="//a[@id='ap-other-signin-issues-link']")private WebElement signInIssue;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")private WebElement createAccount;
	
	@FindBy(xpath="//a[text()='Conditions of Use']")private WebElement conditionOfUse;
	
	@FindBy(xpath="//a[text()='Privacy Notice']")private WebElement privacyNotice;

	@FindBy(xpath="(//a[@class='a-link-normal'])[6]")private WebElement help;
	
	
	public AmazonLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void mouseOverAccountList(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(accountList);
		act.perform();
	}
	
	public void clickOnsignInOption()
	{
		signInOption.click();	
	}
	
	public void enterEmailId(String emailid)
	{
		userNameEmail.sendKeys(emailid);	
	}

	public void clickOncContinueButton()
	{
		continueButton.click();
	}
	
	public void clickOncNeedHelp()
	{
		needHelp.click();
	}
	
	public void clickOnForgotPassword()
	{
		forgotPassword.click();
	}
	
	public void clickOnsignInIssue()
	{
		signInIssue.click();
	}
	public void clickOnCreateAccount()
	{
		createAccount.click();
	}
	public void clickOnCondition()
	{
		conditionOfUse.click();
	}
	public void clickOnPrivacy()
	{
		privacyNotice.click();
	}
	
	public void clickOnHelp()
	{
		help.click();
	}
	
}
