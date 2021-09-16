package appiumInstructor;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosCheck {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\sonal\\Documents\\Appium-Simplelearn\\apkfiles\\ApiDemos.apk");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sep6");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	}

}
