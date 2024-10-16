package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		 driver=new ChromeDriver();
		 lp =new LoginPage(driver);
	    
	}

	@When("User Open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	    
	}

	@When("User Enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String passward) {
		
		lp.setUserName(email);
		lp.setPassward(passward);
	    
	}

	@When("I click on the Login")
	public void i_click_on_the_login() {
		lp.clickLogin();
	    
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful.")){
			driver.close();
			Assert.assertTrue(false);
			
		}
		else
		{
			Assert.assertEquals(title,driver.getTitle());
		}
	   
	}

	@When("User click out link")
	public void user_click_out_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(3000);
		
	    
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
		
		
	  
	}

}
