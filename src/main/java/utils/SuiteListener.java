package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;

public class SuiteListener extends BaseTest implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	    String name = result.getName();
	    TakesScreenshot t=(TakesScreenshot)driver;
	    File src=t.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./screenshots/"+name+"+"+timestamp+".png");
	    try {
	    	FileUtils.copyFile(src, dest);
	    }
	    catch(IOException e) {
	    	e.printStackTrace();
	    }
	  }
}
