package myappiumScripts13Sep;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeDemo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		

        DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "96352732140005T");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		
		Thread.sleep(5000);
		
		// Swipe form one coordinate to another coordinate
		// press (c1), wait(2 sec), moveTo(C2), release , perform
		// C1 : (452,628)
		//C2 : (428,1243)
		
		TouchAction ta = new TouchAction(driver);
		
		ta.press(PointOption.point(452,628))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.moveTo(PointOption.point(401,1428))
		.release().perform();
		
		
		
		
		
		
		
		
		
		
		

	}

}
