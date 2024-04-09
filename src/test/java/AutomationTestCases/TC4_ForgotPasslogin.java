package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_ForgotPasslogin {
	// TestCase 4 (4A in sheet) - Test forgot password
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		forgotPassword_4B();
	}

	public static void forgotPassword_4B() throws Exception {
		driver.findElement(By.id("username")).sendKeys("123");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]")).click();

	}

}
