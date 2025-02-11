package tests;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.touch.action.TouchAction;
//import io.appium.java_client.touch.offset.PointOption;
//import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {

	protected AndroidDriver driver;

	@BeforeTest
	public void setUp() throws MalformedURLException, URISyntaxException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:deviceName", "Redmi 10C");
		cap.setCapability("appium:automationName", "UiAutomator2");

		cap.setCapability("appium:app",
				"C:\\Users\\ICA-4024\\Downloads\\application-1dcb5b9b-3352-4356-ab31-64a480be13f1.apk");

		URL url = URI.create("http://127.0.0.1:4723/").toURL();

		driver = new AndroidDriver(url, cap);
	}

//    public void swipeMobileScreenDown() {
//        Dimension screenSize = driver.manage().window().getSize();
//        int startX = screenSize.width / 2;
//        int startY = screenSize.height / 4;
//        int endX = startX;
//        int endY = screenSize.height * 3 / 4;
//        swipe(startX, startY, endX, endY);
//    }

//    private void swipe(int startX, int startY, int endX, int endY) {
//        io.appium.java_client.TouchAction action = new io.appium.java_client.TouchAction(driver);  // No need for wildcard or casting
//        
//        action.press(PointOption.point(startX, startY))  // Press on start point
//              .waitAction()                               // Wait for action to register
//              .moveTo(PointOption.point(endX, endY))      // Move to end point
//              .release()                                   // Release touch
//              .perform();                                  // Perform the swipe action
//    }

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
			
		}
	}
}
