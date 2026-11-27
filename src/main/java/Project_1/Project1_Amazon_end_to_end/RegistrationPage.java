package Project_1.Project1_Amazon_end_to_end;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@FindBy(id="ap_email_login")
	WebElement emailid;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continuebutton;
	
	@FindBy(xpath="//h1[text()='It looks like you are new to Amazon']")
	WebElement createaccount;
	
	@FindBy(xpath="//input[@id='ap_email_login']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signInSubmit;
	
	
	//step 2
		public void enterEmailId()
		{
		
		wait.until(ExpectedConditions.visibilityOf(emailid));
		emailid.sendKeys("vrindasingh536@gmail.com");
		
		}
		public void clickoncontinueButton()
		{
			wait.until(ExpectedConditions.elementToBeClickable(continuebutton));
			continuebutton.click();
		}
		
		public void createaccount()
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.textToBePresentInElement(createaccount, "It looks like you are new to Amazon"));
		}
		
		public void username()
		{
			wait.until(ExpectedConditions.elementToBeClickable(username));
			username.click();
		    username.sendKeys("8855913018");
		    }
		public void clickoncontinue()
		{
			wait.until(ExpectedConditions.elementToBeClickable(continuebutton));
			continuebutton.click();
		}
		
		
		public void enterpassword()
		{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Arati@1234");
		
		}
		
		public void clickonSignin()
		{
			wait.until(ExpectedConditions.elementToBeClickable(signInSubmit));
			signInSubmit.click();
		}
		
		public void enterpasswordinvalid()
		{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("krishna");
		
		}
		
		//step 3
		public RegistrationPage(WebDriver driver)        //Constructor
		{
			PageFactory.initElements(driver, this);
		}

		
		public String verifingRegistrationPage()
		{
			String title= createaccount.getText();
			return title;
		}
	   public String verifyingInvalidPassword()
	   {
	   String title= password.getText();
	   return title;
	   
}
}

