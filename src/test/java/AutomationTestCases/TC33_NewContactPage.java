package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC33_NewContactPage {
	// TC 32 in sheet.Check the Save and New button works in New Contact page

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		NewContactsPage_33();
	}

	public static void NewContactsPage_33() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Indian");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("Global Media");
		Thread.sleep(2000);
		
		//getting error msg- Error: Invalid Data.Review all error messages below to correct your data.
		driver.findElement(By.xpath("//input[@tabindex=32]")).click(); 
	}

}