package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy (xpath="//input[@id='Password']")
	WebElement txtPassward;
	
	@FindBy (xpath="//button[normalize-space()='Log in']")
	WebElement btnlogin;
	
	@FindBy (xpath="//a[normalize-space()='Logout']")
	WebElement btnlogout;
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setPassward(String pwd) {
		txtPassward.clear();
		txtPassward.sendKeys(pwd);
	}
	
	public void clickLogin (){
		btnlogin.click();
		
	}
	
	public void clickLogout (){
		btnlogout.click();
		
	}
}