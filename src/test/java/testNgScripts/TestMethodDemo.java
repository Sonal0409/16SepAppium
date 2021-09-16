package testNgScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class TestMethodDemo {
	
	// @Test annotation with appium code in it
	// Any method which has @Test annotation will be called as TestMethod.
	
	@Test(priority='1')
	public void clickViews() throws MalformedURLException // TestMethod
	{
		
        DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Nexus5");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		MobileElement e1= driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
		 TouchAction ta = new TouchAction(driver);
	
		//tap on Views
		 
		  ta.tap(ElementOption.element(e1)).release().perform();
	}
		
	
	@Test(priority='2') // 2nd test method
	public void Scrolltillend() throws InterruptedException, MalformedURLException
	{

        DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Nexus5");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		MobileElement e1= driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
		 TouchAction ta = new TouchAction(driver);
	
		//tap on Views
		 
		  ta.tap(ElementOption.element(e1)).release().perform();
	
		 Thread.sleep(3000);
		 
		  // Scroll until the element is visible using UIAutomator framework
		 
		 
		 MobileElement m2= (MobileElement) ((FindsByAndroidUIAutomator)driver)
		  .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		 + ".scrollIntoView(new UiSelector().text(\"TextFields\"))");
		 
		 
		 m2.click();
		 
		 
		
		
	}	
		
		
		
		
	

}


















