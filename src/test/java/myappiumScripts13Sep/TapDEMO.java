package myappiumScripts13Sep;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TapDEMO {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		
		
		ta.tap(PointOption.point(458, 812)).release().perform();
		
		
		// press on the coordinate
		
	/*	
		ta.press(PointOption.point(458,812))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.release()
		.perform();*/
		
		
		// Longpress : press for certian amount of time
		
		ta.longPress(PointOption.point(425,629))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
		.release().perform();
		
		Thread.sleep(2000);
		
		// Tap on Directions button
		
		//XPATH: //classvalue[@attribute='value]
		
		//If you want to store location of your element in an object, it type will be WebElement or MobileElement
		
	MobileElement e1=driver.findElementByXPath("//android.widget.Button[@text='Directions']");
		
	
		
		ta.tap(ElementOption.element(e1)).release().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
