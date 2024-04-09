package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC6_UserMenu extends TC2_Validlogin {

	// Test case 5(in excel). Select user menu for <username> drop down

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		Thread.sleep(4000);
		driver.findElement(By.id("Login")).click();		
		userMenu_6();
	}

	public static void userMenu_6() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"userNav-arrow\"]")).click();
			
		//driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]")).click();
		
	}

}