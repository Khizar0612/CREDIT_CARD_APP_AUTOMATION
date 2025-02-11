package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

	private By getStartedBtn = By.xpath("//android.view.ViewGroup[@content-desc=\"Get Started\"]");
	private By usernameFieldLocator = By.xpath(
			"//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username or email\"]");
	private By passwordFieldLocator = By
			.xpath("//android.widget.EditText[@resource-id='text-input-outlined' and @text='Enter your password']");
	private By submitLoginButtonLocator = By.xpath("(//android.widget.TextView[@text='Login'])[2]");

}
