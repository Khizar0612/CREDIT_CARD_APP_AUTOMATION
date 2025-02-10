package testCases;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_UR_041 extends Base{

	@Test
	public void test() throws InterruptedException {
	
		Thread.sleep(5000);

		WebElement getStartedBtn = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Get Started\"]"));
		getStartedBtn.click();
		Thread.sleep(5000);

		WebElement forgetUserIdLink = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Forget Username?\"]"));
		forgetUserIdLink.click();
		Thread.sleep(5000);

		WebElement email = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your email address\"]"));
		email.sendKeys("ksaeed@iconsult.com.pk");
		Thread.sleep(5000);

		WebElement mobNum = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your mobile number\"]"));
		mobNum.sendKeys("03324567880");
		Thread.sleep(5000);

		WebElement sendBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Send\"]"));
		sendBtn.click();
		Thread.sleep(10000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        WebElement resendOTPLink = wait.until(ExpectedConditions.elementToBeClickable(
            By.id("// android.widget.TextView[@text=\"Resend OTP\"]")));	
		resendOTPLink.click();
				
	}

}