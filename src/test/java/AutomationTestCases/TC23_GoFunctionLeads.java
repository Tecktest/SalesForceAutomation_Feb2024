package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC23_GoFunctionLeads {
	// TC 22 in sheet.Functionality of the Go Button
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		LeadsGoButton_23();
	}

	public static void LeadsGoButton_23() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a")).click();	
		driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[2]")).click();	
		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[1]/input")).click();
	}
	
	
}