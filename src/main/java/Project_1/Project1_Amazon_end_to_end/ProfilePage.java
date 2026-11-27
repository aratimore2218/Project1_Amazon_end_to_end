package Project_1.Project1_Amazon_end_to_end;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
	WebDriver driver;
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	//step 1
	@FindBy(xpath="//div[@class='a-changeover editNameChangeover']/following-sibling::span[@class='a-declarative']/child::*/child::*")
	private WebElement edit;
	
	@FindBy(id="editProfileNameInputId")
	private WebElement updatename;

	@FindBy(id="editProfileContinueButton")
	private WebElement editcontinue;
	//step2
	public void editdetails()
	{
		wait.until(ExpectedConditions.elementToBeClickable(edit));
		edit.click();
	}
	
	public void entername()
	{
		wait.until(ExpectedConditions.visibilityOf(updatename));
		updatename.sendKeys(" More ");
	}
	public void editcontinuebutton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(editcontinue));
		editcontinue.click();
	}
	
	//step 3
	public ProfilePage(WebDriver driver)        //Constructor
	{
		PageFactory.initElements(driver, this);
	}	
	
	
}
