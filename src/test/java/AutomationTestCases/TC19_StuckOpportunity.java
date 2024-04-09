package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC19_StuckOpportunity {
	// TC 18 in sheet.Test Stuck Opportunities Report
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		ViewStuckOpport_19();
	}

	public static void ViewStuckOpport_19() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a")).click();

	}

}