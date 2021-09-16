package day4AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class SystemApptestCallDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		//test the system application : Contacts
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Nexus5");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage","com.android.contacts");
		cap.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
		
		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		MobileElement e1= (MobileElement) ((FindsByAndroidUIAutomator)driver)
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Y2\"))");
				
		Thread.sleep(3000);
		
	//	e1.click();
		
		//collect all the contacts in the list and then select Y2 and click on it
		
		
		List<MobileElement> contacts = driver.findElementsByClassName("android.widget.TextView");
		
		// Count the number of elements on the page with the same classname
		int contactcount=contacts.size();
		System.out.println(contactcount);
		
		// start a for loop that will go to every element in the list and click on the matched text given by user
		
		for(int i=0; i<contactcount;i++)
		{
			if(contacts.get(i).getText().equalsIgnoreCase("Y2"))
			{
				contacts.get(i).click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		
		
		MobileElement e2 = (MobileElement) driver.findElementsById("com.android.contacts:id/icon").get(0);
		
		TouchAction ta = new TouchAction(driver);
		
		ta.tap(ElementOption.element(e2)).release().perform();
		
		Thread.sleep(3000);
		
		
	ta.press(new PointOption().withCoordinates(545, 1606)).release().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
