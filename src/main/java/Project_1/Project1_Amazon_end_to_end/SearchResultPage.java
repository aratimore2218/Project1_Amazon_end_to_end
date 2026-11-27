package Project_1.Project1_Amazon_end_to_end;

import java.time.Duration;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(id="nav-search-dropdown-card")
	private WebElement searchdropdown;
	
    
    @FindBy(xpath="//span[@data-action='a-dropdown-button']")
    private WebElement sortby;

    @FindBy(xpath="//a[contains(text(),'Price: Low to High')]")
    private WebElement lowtohigh;
    
    @FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
    private WebElement selectitem;
    
    @FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
    private WebElement reviews;
	
	//Step2
	
	public void SearchDropdownBox(WebDriver driver)
	{
	    wait.until(ExpectedConditions.elementToBeClickable(searchdropdown)).click();
	    Actions actions = new Actions(driver);
	    actions.sendKeys("Amazon Fresh").sendKeys(Keys.ENTER).perform();
	}
	
	public void SortBy()
	{
		wait.until(ExpectedConditions.elementToBeClickable(sortby)).click();
	}
	public void LowToHigh()
	{
		wait.until(ExpectedConditions.elementToBeClickable(lowtohigh)).click();
	}
	
	public void ClickonFirst()
	{
		wait.until(ExpectedConditions.elementToBeClickable(selectitem)).click();
	}
	public void Reviews()
	{
		wait.until(ExpectedConditions.visibilityOf(reviews));
		reviews.click();
	}

	
	//step 3
	public SearchResultPage(WebDriver driver)
	{
	    this.driver = driver;
	    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    PageFactory.initElements(driver, this);
	}

}
