package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_UR_011 extends Base {

	@Test
	public void test() throws InterruptedException {

		Thread.sleep(5000);

		WebElement getStartedBtn = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Get Started\"]"));
		getStartedBtn.click();
		Thread.sleep(2000);

		WebElement register = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Register\"]"));
		register.click();
		Thread.sleep(2000);

		WebElement plasticCard = driver
				.findElement(By.xpath("//android.widget.TextView[@text=\"Registration with Plastic Card\"]"));
		plasticCard.click();
		Thread.sleep(2000);

		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(new UiSelector().text(\"I have read through the TERMS & CONDITION\"))"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement chkBox = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//android.widget.TextView[@text='I have read through the TERMS & CONDITION']")));

		chkBox.click();
		Thread.sleep(2000);

		WebElement nextBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]"));
		nextBtn.click();
		Thread.sleep(2000);

		WebElement firstName = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your first name\"]"));
        firstName.sendKeys("Ali");
        Thread.sleep(2000);
        
        WebElement lastName = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your last name\"]"));
        lastName.sendKeys("Khan");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your email address\"]"));
        email.sendKeys("ali@pak.com.pk");
        Thread.sleep(2000);
        
        WebElement num = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your mobile number\"]"));
        num.sendKeys("+9234789089");
        Thread.sleep(2000);
        
        WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username or email\"]"));
        username.sendKeys("Ali09");
        Thread.sleep(2000);
        
        WebElement checkBox = driver.findElement(By.xpath("//android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup"));
        checkBox.click();
        Thread.sleep(2000);        
        
        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(new UiSelector().text(\"Next\"))"));

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)); 
        WebElement nextButton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Next']")));
        nextButton.click();
        
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Field Error')]"));
		String actualText = text.getText();
		String expectedText = "Field Error";
		Assert.assertEquals(actualText, expectedText);
	}
}