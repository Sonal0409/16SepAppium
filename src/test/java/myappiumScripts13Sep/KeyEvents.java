package myappiumScripts13Sep;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.ElementOption;

public class KeyEvents {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

        DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "96352732140005T");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		
		Thread.sleep(3000);
		
		// Tap on a coordinate in google maps :tap() -->
		
		TouchAction ta = new TouchAction(driver);
		
		
		MobileElement e1=driver.findElementByXPath("//android.widget.TextView[@text='Search here']");
		
		ta.tap(ElementOption.element(e1)).release().perform();
		
		Thread.sleep(3000);
		
		driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text").sendKeys("A");
		
		driver.pressKey(new KeyEvent(AndroidKey.P));
		driver.pressKey(new KeyEvent(AndroidKey.P));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.U));
		driver.pressKey(new KeyEvent(AndroidKey.M));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
		
		
		
		
		
		
		

	}

}
