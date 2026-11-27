package Project_1.Project1_Amazon_end_to_end;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class Tc_2_LoginwithValid extends BaseTest{
	
	@Test(retryAnalyzer=RetryLogic.class)
		public void LoginwithValid() throws InterruptedException {
			
			Reporter.log("Website Launched");
			HomePage2 homepage2= new HomePage2(driver);
			homepage2.AccountAndList(driver);
			homepage2.clickonsignin(driver);
			
			RegistrationPage registrationpage= new RegistrationPage(driver);
			registrationpage.username();
			registrationpage.clickoncontinue();
			registrationpage.enterpassword();
			registrationpage.clickonSignin();
			
		
			
	}
	}
	


