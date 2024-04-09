package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC25_CreateLeads {
	// TC 24 in sheet.Check "New" button on Leads Home

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");		
		driver.findElement(By.id("Login")).click();		
		LeadsCreate_25();
	}

	public static void LeadsCreate_25() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("abncd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("abncd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]")).click();
	}

}