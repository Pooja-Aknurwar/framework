package Utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShot 
{

public static void captureScreenShotTaken(WebDriver ldriver, String screenshotname) throws Exception{
// Take screenshot and store as a file format            

	TakesScreenshot ts = (TakesScreenshot)ldriver;
	File src=ts.getScreenshotAs(OutputType.FILE);           
	String dest = "./ScreenShot/"+screenshotname+".jpeg";
	File destination = new File(dest);
	// now copy the  screenshot to desired location using copyFile method
	FileUtils.copyFile(src, destination);
	//return dest;
		
}
		 
}
	

