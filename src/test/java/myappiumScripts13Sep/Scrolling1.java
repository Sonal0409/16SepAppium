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
import io.appium.java_client.touch.offset.PointOption;


public class Scrolling1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		
		// Perform scrolling from point1(425,1766) to point 2 (360,564)
		ta.press(new PointOption().withCoordinates(509,1679)).moveTo(new PointOption().withCoordinates(520,625))
	.release()
	.perform();
		
		ta.press(new PointOption().withCoordinates(509,1679)).moveTo(new PointOption().withCoordinates(520,625))
		.release()
		.perform();
		
		ta.press(new PointOption().withCoordinates(509,1679)).moveTo(new PointOption().withCoordinates(520,625))
		.release()
		.perform();
		
		Thread.sleep(3000);
		//Scroll 3 times , and tap on textfields
		
		MobileElement e2 = driver.findElementByAccessibilityId("TextFields");
		
		ta.tap(ElementOption.element(e2)).release().perform();
		
		Thread.sleep(3000);
		
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("A");
		
		driver.pressKey(new KeyEvent(AndroidKey.P));
		
		driver.pressKey(new KeyEvent(AndroidKey.P));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.U));
		driver.pressKey(new KeyEvent(AndroidKey.M));
		
		Thread.sleep(3000);
		
		driver.findElementById("io.appium.android.apis:id/edit").clear();
		

		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
