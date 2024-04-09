package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC17_CreateNewOpportunity {
	// TC 16 in sheet.Create a new Opty
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		CreateOpport_17();
	}

	public static void CreateOpport_17() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("opp3")).sendKeys("exampleOpp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"opp4_lkwgt\"]/img")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("searchFrame");
		driver.findElement(By.xpath("//*[@id=\"lksrch\"]")).sendKeys("TC1");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//input[@name='go']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		
		}
	
	
}