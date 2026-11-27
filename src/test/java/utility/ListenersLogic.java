package utility;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener {

	public static WebDriver driver;
	
	public void captureScreenshot(ITestResult result, String status) 
	{
		TakesScreenshot ts= (TakesScreenshot) driver;   //explicitly
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destinaton= new File("C:\\Users\\Dell\\eclipse-workspace\\Project1_Amazon_end_to_end\\test-output\\Screenshot\\"+status+"\\"+result.getName()+".png");
		
		try {
			FileHandler.copy(source, destinaton);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Pass by Listner");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		captureScreenshot(result, "Pass");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		captureScreenshot(result, "Fail");
	}


}
