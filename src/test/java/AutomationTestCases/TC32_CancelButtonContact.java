package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC32_CancelButtonContact {
	// TC 31 in sheet.Check the Cancel button works fine in Create New View


	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		CancelButtonContacts_32();
	}

	public static void CancelButtonContacts_32() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("abcde");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("fghi");
		Thread.sleep(4000);			
		driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[2]")).click();

	}

}