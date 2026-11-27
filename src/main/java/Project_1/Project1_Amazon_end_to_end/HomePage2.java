package Project_1.Project1_Amazon_end_to_end;

import java.time.Duration;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage2 {
	WebDriver driver;
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement accountandList;
	
	@FindBy(linkText="Start here.")
	private WebElement newuser;
	
	@FindBy(xpath="//a[@class='nav-action-signin-button']")
	private WebElement signin;
	
	@FindBy(xpath="//button[text()='Manage Profiles']")
	private WebElement manageprofile;
	
	@FindBy(xpath="//a[text()='Manage profile']")
	private WebElement profile;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchtextbox;
	
	//step 2
	public void AccountAndList(WebDriver driver)
	{
		Actions a1= new Actions(driver); //creating method inside method
		a1.moveToElement(accountandList).perform();
	}
	
	public void NewUser() {
		wait.until(ExpectedConditions.elementToBeClickable(newuser));
		newuser.click();
		}
	
	public void clickonsignin(WebDriver driver)
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	}
	
	public void ManageProfiles()
	{
		wait.until(ExpectedConditions.elementToBeClickable(manageprofile));
		manageprofile.click();
	}
	
	public void editprofile()
	{
		wait.until(ExpectedConditions.elementToBeClickable(profile));
		profile.click();
	}
	
	public void searchProduct()
	{
		wait.until(ExpectedConditions.visibilityOf(searchtextbox));
		searchtextbox.sendKeys("shoes"+Keys.ENTER);
	}
	//step3

	public HomePage2(WebDriver driver)        //Constructor
	{
		PageFactory.initElements(driver, this);
	}
	

}
