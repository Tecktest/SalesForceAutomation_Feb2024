package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Invalidlogin {
	
	//TestCase 1 - Navigate to SFDC

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");

		 invalidLogin_1();
		// validLogin_2();
		// rememberMe_3();
		// logoutSuccess_3();
		// forgotPassword_4A();
		// invalidLogin_4B();
	}

	public static void invalidLogin_1() throws Exception {
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(4000);
	}

}
