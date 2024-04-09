package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC27_CreateContactsView {
	// TC 26 in sheet.Create new view in the Contact Page

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");		
		driver.findElement(By.id("Login")).click();		
		CreateContactsView_27();
	}

	public static void CreateContactsView_27() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("exampleview");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-uidsfdc='4']")).click();
	}

}