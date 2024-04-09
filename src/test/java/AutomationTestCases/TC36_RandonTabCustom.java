package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC36_RandonTabCustom {

	// Test case 35 in sheet - Verify the tab customization

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		validLogin_2();
		randomtabCustom_36();
		logoutSuccess_3(); // common logout script
		validLogin_2(); // common login page
	}

	public static void randomtabCustom_36() throws Exception {

		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='customize']")).click();
		Thread.sleep(2000);
		//Authorization form tab
		driver.findElement(By.xpath("//*[@id=\"duel_select_1\"]/option[8]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"duel_select_0_left\"]/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='save']")).click();
		Thread.sleep(2000);
	}

	public static void logoutSuccess_3() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
		Thread.sleep(2000);
	}

	public static void validLogin_2() throws Exception {
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
	}
}