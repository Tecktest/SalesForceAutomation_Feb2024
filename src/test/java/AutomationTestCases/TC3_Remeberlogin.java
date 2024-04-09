package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC3_Remeberlogin {

	// Test case 3 - Test the remember username check box

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		logoutSuccess_3();
	}

	public static void rememberMe_3() throws Exception {
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.xpath("//*[@id=\"rememberUn\"]")).click();
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(4000);
	}

	public static void logoutSuccess_3() throws Exception {
		rememberMe_3();
		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();

		Thread.sleep(2000);
	}

}