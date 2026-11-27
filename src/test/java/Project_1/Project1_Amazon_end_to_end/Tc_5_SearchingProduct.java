package Project_1.Project1_Amazon_end_to_end;

import org.testng.Reporter;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;

@Listeners(ListenersLogic.class)
public class Tc_5_SearchingProduct extends BaseTest{
	@Test(retryAnalyzer=RetryLogic.class)
	public void SearchProduct() throws InterruptedException {
		Reporter.log("Website Launched");
		HomePage2 homepage2= new HomePage2(driver);
		homepage2.searchProduct();
		
		
	

}
}