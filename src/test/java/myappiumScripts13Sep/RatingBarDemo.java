package myappiumScripts13Sep;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class RatingBarDemo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "96352732140005T");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

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
