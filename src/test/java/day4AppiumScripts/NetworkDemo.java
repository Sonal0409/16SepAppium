package day4AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.LocksDevice;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.SupportsNetworkStateManagement;
import io.appium.java_client.android.connection.HasNetworkConnection;

public class NetworkDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "DemoSonal");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage","com.android.messaging");
		cap.setCapability("appActivity","com.android.messaging.ui.conversationlist.ConversationListActivity");
		
		AppiumDriver <MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	
		
		//Lock a device
		
		((LocksDevice) driver).lockDevice();
		
		Thread.sleep(2000);
		
		
		((LocksDevice) driver).unlockDevice();
		
		
		((AndroidDriver<MobileElement>) driver).openNotifications();
		
		Thread.sleep(2000);
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		
		Thread.sleep(2000);
		
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		// it tell you if wifi is enabled or not
		// if wifi is ON : true
		//if wifi is OFF : false
		boolean wifi =((HasNetworkConnection) driver).getConnection().isWiFiEnabled();
		
		System.out.println(wifi);
		
		((SupportsNetworkStateManagement) driver).toggleWifi(); // switch off wifi
		
		Thread.sleep(2000);
		
		boolean wifi1 =((HasNetworkConnection) driver).getConnection().isWiFiEnabled();
		
		System.out.println("IS wifi enabled" + wifi1);  //false
		
		boolean air =((HasNetworkConnection) driver).getConnection().isAirplaneModeEnabled();
		
		System.out.println(air);
		
		Thread.sleep(2000);
		
		((SupportsNetworkStateManagement) driver).toggleWifi(); // switch ON wifi
		

		Thread.sleep(2000);
		
boolean wifi2 =((HasNetworkConnection) driver).getConnection().isWiFiEnabled();
		
		System.out.println("IS wifi enabled" + wifi2);  //True
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
