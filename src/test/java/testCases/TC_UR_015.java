package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import Jdbc.Jdbc;
import io.appium.java_client.AppiumBy;
import tests.OTPUtil;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_UR_015 extends Base{

	@Test
	public void test() throws InterruptedException {
		
		Thread.sleep(5000); 
	
		WebElement getStartedBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Get Started\"]"));
		getStartedBtn.click();
		Thread.sleep(2000); 
		
		WebElement register = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Register\"]"));
        register.click();
        Thread.sleep(2000);  
        
        WebElement plasticCard = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Registration with Plastic Card\"]"));
        plasticCard.click();
        Thread.sleep(2000);
                
        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(new UiSelector().text(\"I have read through the TERMS & CONDITION\"))"
        ));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
        WebElement chkBox = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//android.widget.TextView[@text='I have read through the TERMS & CONDITION']")
        ));

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
        num.sendKeys("03347890899");
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

		Thread.sleep(10000);
		String otp = Jdbc.JdbcConnection();
		System.out.println("Fetched OTP: " + otp);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (otp != null && otp.length() == 6) {
			String[] otpDigits = OTPUtil.extractDigits(otp);
        
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
}
