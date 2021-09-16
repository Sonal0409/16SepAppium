package day4AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridApptest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		  DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability("deviceName", "96352732140005T");
			cap.setCapability("platformName", "ANDROID");
			cap.setCapability("platformVersion", "11");
		  //  cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		    cap.setCapability("chromedriverExecutable","C:\\Users\\sonal\\Downloads\\chromedriver_win32\\chromedriver.exe");
            cap.setCapability("appPackage", "com.android.chrome");
            cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
			AppiumDriver <MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
				
// always open in native view
			Thread.sleep(5000);
			
			driver.findElementByXPath("//android.view.View[@text='Flipkart']").click();
			
		Set<String> cns= driver.getContextHandles();
		// the names of native view and webview	
			
			System.out.println(cns + "\n\n");
		// [NATIVE_APP, WEBVIEW_chrome]
			
			
		driver.context("WEBVIEW_chrome");
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/a[1]/img").click();
			
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id=\"container\"]/div/div[8]/div/div/div[2]/div/div[2]/div/div[12]/div/ul/div[5]/li/a/div/span").click();	
			
		Thread.sleep(3000);
		
	   driver.context("NATIVE_APP");
	   
	   driver.findElementById("com.android.chrome:id/menu_button").click();
	   
	   
	   driver.findElementByXPath("//android.widget.TextView[@content-desc=\"History\"]").click();
	   
	   
	   
	   
	   
	   
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
