package appiumInstructor;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidUiAutomatorDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sep6");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		//cap.setCapability("appActivity", "io.appium.android.apis.preference.SwitchPreference");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		MobileElement m1= (MobileElement) ((FindsByAndroidUIAutomator)driver)
				.findElementByAndroidUIAutomator("new UiSelector().text(\"Preference\")");
		System.out.println(m1.getText());
		m1.click();
		
		MobileElement m2= (MobileElement) ((FindsByAndroidUIAutomator)driver)
				.findElementByAndroidUIAutomator("new UiSelector().text(\"3. Preference dependencies\")");
		System.out.println(m2.getText());
		
		m2.click();
		
		MobileElement m3= (MobileElement) ((FindsByAndroidUIAutomator)driver)
				.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/checkbox\")");
		System.out.println(m3.getText());
		m3.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
