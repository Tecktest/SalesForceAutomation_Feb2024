package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC34_RandonScenarioLogin {

	// Test case 33 in sheet - Verify if the firstname and lastname of the loggedin user is displayed


	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(4000);
		randonscenario_34();
	}

	public static void randonscenario_34() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a")).click();
		Thread.sleep(2000);

		boolean status = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")).isDisplayed();
		if (status) {
			System.out.println("User First and Last name is visible");
		}
		driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")).click();
		// String landingUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "User: Sujyot Abcd ~ Salesforce - Developer Edition";

		// Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		if (actualTitle == expectedTitle) {
			System.out.println("The landing page is same as 'My Profile' page");
		}
		else {
			System.out.println("Not the same page");
		}

	}
}