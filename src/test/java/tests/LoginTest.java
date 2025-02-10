package tests;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseClass{
	
	@Test
	public void test1() throws InterruptedException {
				
			Thread.sleep(5000); 
		
			WebElement getStartedBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Get Started\"]"));
			getStartedBtn.click();
	
			Thread.sleep(5000); 
			
	        WebElement username = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your username or email\"]"));
	        username.sendKeys("Khan804");
	
			Thread.sleep(5000); 
	        
	        WebElement password = driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"text-input-outlined\" and @text=\"Enter your password\"]"));
	        password.sendKeys("Civic@123");
	
			Thread.sleep(5000); 

	        WebElement loginbtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]"));
	        loginbtn.click();
	
	        Thread.sleep(5000);       
		}

}
