package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC35_RandonLastname {

	// Test case 34 in sheet - Verify the edited lastname is updated at various places

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(4000);
		randomLastname_35();
	}

	public static void randomLastname_35() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")).click();
		driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("contactInfoContentId");
		
		driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("ABCDE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Save All']")).click();	
		//driver.switchTo().defaultContent();

	}
}