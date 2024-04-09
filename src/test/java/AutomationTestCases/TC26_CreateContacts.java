package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC26_CreateContacts {
	// TC 25 in sheet.Create new contact

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");		
		driver.findElement(By.id("Login")).click();		
		CreateContacts_26();
	}

	public static void CreateContacts_26() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Contact_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("examplelastname");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("accountexample");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]")).click();
	}

}