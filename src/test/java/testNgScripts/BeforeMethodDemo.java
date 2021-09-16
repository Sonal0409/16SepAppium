package testNgScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class BeforeMethodDemo {
	
	// global /static variable
	public static AndroidDriver<MobileElement> driver;
	
	
	// Start the app on the device
	@BeforeMethod
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
	
	
	//Functional Test : to test preference menu option
	@Test(priority='1')
	public void clickDemo() throws InterruptedException
	{
		System.out.println("Executed first Test");
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("3. Preference dependencies").click();
		
	}
	
	
	@Test (priority='2')  //2nd test method
	public void dragandDropDemo() throws InterruptedException
	{
     MobileElement e1= driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
		
     TouchAction ta = new TouchAction(driver);
		
		//tap on Views
		
    ta.tap(ElementOption.element(e1)).release().perform();
		
	MobileElement e2 = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");
	
	ta.tap(ElementOption.element(e2)).release().perform();
	
	Thread.sleep(2000);
	
	
	MobileElement drag = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
	
	MobileElement drop = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
	
	ta.longPress(ElementOption.element(drag))
	.moveTo(ElementOption.element(drop))
	.release().perform();
		
		
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		System.out.println("quit app");
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
