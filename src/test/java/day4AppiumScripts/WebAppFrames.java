package day4AppiumScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebAppFrames {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		

		  DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability("deviceName", "96352732140005T");
			cap.setCapability("platformName", "ANDROID");
			cap.setCapability("platformVersion", "11");
		    cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		    cap.setCapability("chromedriverExecutable","C:\\Users\\sonal\\Downloads\\chromedriver_win32\\chromedriver.exe");

			AppiumDriver <MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			
		
		driver.get("https://jqueryui.com/droppable/");	
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
	String text1= driver.findElementByXPath("//*[@id=\"draggable\"]").getText();
		
		System.out.println(text1);
		
		String text2= driver.findElementByXPath("//*[@id=\"droppable\"]").getText();
		
		
		System.out.println(text2);
		
		driver.switchTo().parentFrame();
		
		driver.findElementByXPath("//*[@id=\"tinynav2\"]").click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
