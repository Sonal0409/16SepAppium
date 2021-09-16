package testNgScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class BeforeClassDemo {
	
	public static AndroidDriver<MobileElement> driver;
	
	
	
	@BeforeClass  // this will be the first method that will get executed in the class
	public void startApp() throws MalformedURLException
	{

		System.out.println("Start app");
        DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Nexus5");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
  
	}
	
	@Test(priority='1')
	public void clickonViews()
	{
		System.out.println("Test1 executed");

		MobileElement e1= driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
		
		TouchAction ta = new TouchAction(driver);
		//tap on Views
		
		ta.tap(ElementOption.element(e1)).release().perform();
		
		
	}
		
	@Test(priority='2')
	public void Scroll() throws InterruptedException
	{
		System.out.println("Test2 executed");
		Thread.sleep(2000);
		MobileElement e2= (MobileElement) ((FindsByAndroidUIAutomator)driver)
				.findElementByAndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true))" +
						 ".scrollIntoView(new UiSelector().text(\"Rating Bar\"))");
		
		Thread.sleep(2000);
		e2.click();
	}
	
	@Test(priority='3')
	
	public void RatingStars() throws InterruptedException
	{
		
		TouchAction ta = new TouchAction(driver);
		System.out.println("Test4 executed");
		Thread.sleep(2000);
		
		ta.tap(new PointOption().withCoordinates(618,465)).release().perform();
	
	}
	
	@AfterClass // this is going to be the last method in the class to be executed
	public void ClassApp()
	{
		
		System.out.println("App closed");
		driver.quit();
	}
	
	
	
	
	
	

}
