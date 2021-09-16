package day4AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;




public class SystemAppSMS {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "DemoSonal");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage","com.android.messaging");
		cap.setCapability("appActivity","com.android.messaging.ui.conversationlist.ConversationListActivity");
		
		AppiumDriver <MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Start new conversation\"]").click();
		
		Thread.sleep(2000);
		
		
		driver.findElementById("com.android.messaging:id/recipient_text_view").sendKeys("2343535464");
	 
		
	((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
		Thread.sleep(2000);
		
		driver.findElementById("com.android.messaging:id/compose_message_text").sendKeys("Hello to ALL");
		
		Thread.sleep(2000);
		
		driver.findElementById("com.android.messaging:id/self_send_icon").click();
		
		
		
		
	}

}
