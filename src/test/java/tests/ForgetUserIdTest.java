package tests;

import org.testng.annotations.Test;
import Jdbc.Jdbc;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgetUserIdTest extends BaseClass {

	@Test
	public void test1() throws InterruptedException {

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

		WebElement mobNum = driver.findElement(By.xpath(
				"//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your mobile number\"]"));
		mobNum.sendKeys("03324567880");

		Thread.sleep(5000);

		WebElement sendBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Send\"]"));
		sendBtn.click();

		Thread.sleep(10000);

		String otp = Jdbc.JdbcConnection();
		System.out.println("Fetched OTP: " + otp); // For debugging

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace(); // Handle interruption
		}

		if (otp != null && otp.length() == 6) {
			String[] otpDigits = OTPUtil.extractDigits(otp);

			WebElement otp1 = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[1]")));
			otp1.sendKeys(otpDigits[0]);
			WebElement otp2 = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[2]")));
			otp2.sendKeys(otpDigits[1]);
			WebElement otp3 = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[3]")));
			otp3.sendKeys(otpDigits[2]);
			WebElement otp4 = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[4]")));
			otp4.sendKeys(otpDigits[3]);
			WebElement otp5 = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[5]")));
			otp5.sendKeys(otpDigits[4]);
			WebElement otp6 = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[6]")));
			otp6.sendKeys(otpDigits[5]);

			WebElement verifyOTP = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Verify OTP\"]"));
			verifyOTP.click();
		} else {
			System.out.println("Invalid OTP fetched: " + otp);
		}
		Thread.sleep(1000);

		WebElement verifyOTP = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Verify OTP\"]"));
		verifyOTP.click();
		Thread.sleep(2000);

//		WebElement successMsg = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Ok\"]"));

//		Thread.sleep(2000);
//		String actualText = successMsg.getText();
//		String expectedText = "Your username has been sent to the registered email!";
//		Assert.assertEquals(actualText, expectedText);
//		Thread.sleep(1000);

//		String success = successMsg.getText();
//		String expectedText = "Success";
//		Assert.assertEquals(success, expectedText);
//		Thread.sleep(1000);

	}
}
