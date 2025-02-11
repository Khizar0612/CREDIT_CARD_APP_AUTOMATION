package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.BaseClass;

public class TC_UR_001 extends BaseClass {
	@Test
	public void test() throws InterruptedException {

		Thread.sleep(5000);
		WebElement getStartedBtn = driver
				.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Get Started\"]"));
		getStartedBtn.click();
		Thread.sleep(2000);

	}
}
