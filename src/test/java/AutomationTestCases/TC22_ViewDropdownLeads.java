package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC22_ViewDropdownLeads {
	// TC 21 in sheet.Validate 'View' drop down list contents
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		LeadsViewDrop_22();
	}

	public static void LeadsViewDrop_22() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a")).click();	
		driver.findElement(By.xpath("//*[@id=\"fcf\"]")).click();	
	}
	
	
}