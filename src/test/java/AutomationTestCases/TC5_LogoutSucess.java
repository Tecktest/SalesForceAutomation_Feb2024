package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_LogoutSucess {

	// TC4B in sheet - ValidateLoginErrorMessage

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		logoutSuccess_3();
	}

	public static void logoutSuccess_3() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();

	}

}