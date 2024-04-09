package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC29_MyContacts {
	// TC 28 in sheet.Check 'My contacts' view in the Contact Page

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");		
		driver.findElement(By.id("Login")).click();		
		MyContacts_29();
	}

	public static void MyContacts_29() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fcf\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[7]")).click();
		
		//Select
		Thread.sleep(2000);
	
	}

}