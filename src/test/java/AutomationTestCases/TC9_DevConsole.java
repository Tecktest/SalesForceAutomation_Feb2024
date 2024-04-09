package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC9_DevConsole {

	// TC 8 in sheet.Select "Developers Console" option from user menu for
	// <username> drop down

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		UserMenuDevCon_9();
	}

	public static void UserMenuDevCon_9() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]")).click();
		//Thread.sleep(4000);
		//for (String winhandle: driver.getWindowHandles()) {
		String winhandle = driver.getWindowHandle();
		    driver.switchTo().window(winhandle);
		    System.out.println("Window Switch");        
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("(//button[span[contains(text(),'Close')]])[1]")).click();
		}
	
	
}