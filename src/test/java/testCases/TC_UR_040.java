package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_UR_040 extends Base {

	@Test
	public void test() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Thread.sleep(5000);

		WebElement getStartedBtn = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Get Started\"]"));
		getStartedBtn.click();
		Thread.sleep(5000);

		WebElement forgetUserIdLink = driver
				.findElement(By.xpath("//android.widget.TextView[@text=\"Forget Username?\"]"));
		forgetUserIdLink.click();
		Thread.sleep(5000);

		WebElement email = driver.findElement(By.xpath(
				"//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your email address\"]"));
		email.sendKeys("ksaeed@iconsult.com.pk");
		Thread.sleep(5000);

		WebElement mobNum = driver.findElement(By.xpath(
				"//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your mobile number\"]"));
		mobNum.sendKeys("03324567880");
		Thread.sleep(5000);

		WebElement sendBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Send\"]"));
		sendBtn.click();
		Thread.sleep(10000);

		WebElement otp1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[1]")));
		otp1.sendKeys("1");
		WebElement otp2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[2]")));
		otp2.sendKeys("1");
		WebElement otp3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[3]")));
		otp3.sendKeys("0");
		WebElement otp4 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[4]")));
		otp4.sendKeys("5");
		WebElement otp5 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[5]")));
		otp5.sendKeys("9");
		WebElement otp6 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[6]")));
		otp6.sendKeys("1");

		Thread.sleep(1000);
		WebElement verifyOTP = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Verify OTP\"]"));
		verifyOTP.click();

		WebElement text = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Invalid OTP\"]"));
		String actualText = text.getText();
		String expectedText = "Invalid OTP";
		Assert.assertEquals(actualText, expectedText);
		Thread.sleep(2000);

	}
}