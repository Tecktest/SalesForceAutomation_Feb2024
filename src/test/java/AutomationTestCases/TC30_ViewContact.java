package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC30_ViewContact {
	// TC 29 in sheet.View a contact in the contact Page

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		ViewContacts_30();
	}

	public static void ViewContacts_30() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")).click();

	}

}