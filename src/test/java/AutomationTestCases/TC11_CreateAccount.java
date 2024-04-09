package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC11_CreateAccount {
	// TC 10 in sheet.Create an Account
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		CreateAccount_11();
	}

	public static void CreateAccount_11() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='new']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("acc2")).sendKeys("TechnologyTest");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"acc6\"]/option[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"00NHn00000Gcr5Z\"]/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]")).click();
		
		}
	
	
}