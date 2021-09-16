package scripts16Sep;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class RealdeviceTest {
	
	@Parameters({"deviceName","Version","URL"})
	@Test
	public void RealApiDemos(String deviceName, String Version, String URL) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", deviceName);
		cap.setCapability("platformVersion", Version);
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL(URL),cap);
		MobileElement e1= driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");	
TouchAction ta = new TouchAction(driver);
		
		//tap on Views
		
		ta.tap(ElementOption.element(e1)).release().perform();
		
		Thread.sleep(2000);
		MobileElement e2= (MobileElement) ((FindsByAndroidUIAutomator)driver)
				.findElementByAndroidUIAutomator( "new UiScrollable(new UiSelector().scrollable(true))" +
						 ".scrollIntoView(new UiSelector().text(\"Rating Bar\"))");
		
		Thread.sleep(2000);
		e2.click();
		
		Thread.sleep(2000);
		
		ta.tap(new PointOption().withCoordinates(618,465)).release().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
