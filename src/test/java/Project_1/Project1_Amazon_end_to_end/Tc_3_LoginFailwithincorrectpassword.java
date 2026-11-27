package Project_1.Project1_Amazon_end_to_end;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;

@Listeners(ListenersLogic.class)
public class Tc_3_LoginFailwithincorrectpassword extends BaseTest {
	
	@Test(retryAnalyzer=RetryLogic.class)
	public void LoginwithInvalid() throws InterruptedException {
		Reporter.log("Website Launched");
		HomePage2 homepage2= new HomePage2(driver);
		homepage2.AccountAndList(driver);
		homepage2.clickonsignin(driver);
		
		RegistrationPage registrationpage= new RegistrationPage(driver);
		registrationpage.username();
		registrationpage.clickoncontinue();
		registrationpage.enterpasswordinvalid();
		registrationpage.clickonSignin();
		
		
		WebElement textforassertion =driver.findElement(By.xpath("//div[@id='auth-error-message-box']/div/div"));
		Assert.assertEquals(textforassertion.getText(), "Your password is incorrect", "Invalid Password");
		
		
		
}		
	}

