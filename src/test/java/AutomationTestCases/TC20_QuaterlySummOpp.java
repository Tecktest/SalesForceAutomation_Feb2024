package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC20_QuaterlySummOpp {
	// TC 19 in sheet.Test Quarterly Summary Report

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		QuaterlySummReport_20();
	}

	public static void QuaterlySummReport_20() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"quarter_q\"]/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"open\"]/option[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Run Report']")).click();
	}

}