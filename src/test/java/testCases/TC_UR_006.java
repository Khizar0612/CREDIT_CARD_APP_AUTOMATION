package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_UR_006 extends Base {

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

		WebElement plstcCard = driver
				.findElement(By.xpath("//android.widget.TextView[@text=\"Registration with Plastic Card\"]"));
		plstcCard.click();
		Thread.sleep(2000);

	}
}
