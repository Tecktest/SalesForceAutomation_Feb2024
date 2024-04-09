package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC12_CreateNewView {
	// TC 11 in sheet.Create new view
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		CreateNewView_12();		
	}

	public static void CreateNewView_12() throws Exception {
		
		driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a")).click();	
		Thread.sleep(2000);
		driver.findElement(By.name("fname")).sendKeys("Sunny123");
		Thread.sleep(2000);
		WebElement uniqueName = driver.findElement(By.name("devname"));
		uniqueName.clear();
		uniqueName.sendKeys("Sunny123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='save']")).click();	
		
		}
	
	
}