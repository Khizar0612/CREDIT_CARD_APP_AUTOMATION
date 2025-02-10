package testCases;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_UR_044 extends Base{

	@Test
	public void test() throws InterruptedException {
		
		Thread.sleep(5000);

		WebElement getStartedBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Get Started\"]"));
		getStartedBtn.click();
		Thread.sleep(5000);

		WebElement forgetUserIdLink = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Forget Password?\"]"));
		forgetUserIdLink.click();
		Thread.sleep(5000);

		WebElement email = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your email address\"]"));
		email.sendKeys("ksaeediconsultcom.pk");
		Thread.sleep(5000);

		WebElement mobNum = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your mobile number\"]"));
		mobNum.sendKeys("03324567880");
		Thread.sleep(5000);

		WebElement sendBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Send\"]"));
		sendBtn.click();

	}
	
}