package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumBy;


public class SignUpPlasticTest extends BaseClass{
	
	@Test
		public void test1() throws InterruptedException {
		
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
			WebElement getStartedBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"Get Started\"]")));
	        getStartedBtn.click();
			Thread.sleep(2000); 
			
	        WebElement register = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Register\"]"));
	        register.click();
	        Thread.sleep(2000);  
	        
	        WebElement plstcCard = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Registration with Plastic Card\"]"));
	        plstcCard.click();
	        Thread.sleep(2000);
	        
//	        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\").instance(18)").click();
//	        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\").instance(18))")).click();
	        
	        driver.findElement(AppiumBy.androidUIAutomator(
	        	    "new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(new UiSelector().className(\"android.widget.CheckBox\").instance(21))"
	        	)).click();
	        Thread.sleep(2000);
	        
//	        WebElement chkBox = driver.findElement(By.xpath("//android.widget.CheckBox/android.view.ViewGroup/android.view.ViewGroup"));
//	        chkBox.click();
	        
//	        swipeMobileScreenDown();
	        
	        WebElement registerBtn = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Next\"]"));
	        registerBtn.click();
	        Thread.sleep(2000);
	        
	        WebElement firstName = driver.findElement(By.xpath(""));
	        firstName.sendKeys("Ali");
            Thread.sleep(2000);
            
            WebElement lastName = driver.findElement(By.xpath(""));
            lastName.sendKeys("Khan");
            Thread.sleep(2000);

            WebElement num = driver.findElement(By.xpath(""));
            num.sendKeys("03347890899");
            Thread.sleep(2000);
            
            WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Confirm your password\"]"));
            username.sendKeys("Ali09");
            Thread.sleep(2000);
            
            WebElement checkBox = driver.findElement(By.xpath(""));
            checkBox.click();
            Thread.sleep(2000);
            
            
            WebElement nextBtn = driver.findElement(By.xpath(""));
            nextBtn.click();
            
            
            
            
//            WebElement text = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]"));
//            String actualText = text.getText();
//            String expectedText = "Customer Registered successfully";
//            Assert.assertEquals(actualText, expectedText);
//            Thread.sleep(2000);
	        
	        
		}

}
