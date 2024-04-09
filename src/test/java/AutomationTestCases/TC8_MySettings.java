package AutomationTestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC8_MySettings extends TC2_Validlogin {

	// TC 7 in excel - Select "My settings" option from user menu for <username> drop down

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		
		userMysetting_8();
	}

	public static void userMysetting_8() throws Exception {
		
		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"PersonalInfo\"]/a")).click();
		Thread.sleep(2000);
		
	//WebDriverWait wait1 = new WebDriverWait(driver,null);
	//wait1.until(ExpectedConditions.visibilityOf(loginHistory));
	//loginHistory.click();
		driver.findElement(By.xpath("//*[@id=\"LoginHistory_font\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"EmailSetup\"]/a")).click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"EmailSettings_font\"]")).click();		
		Thread.sleep(2000);
		WebElement emailName= driver.findElement(By.xpath("//input[@id='sender_name']"));
		emailName.clear();
		emailName.sendKeys("testName");		
		Thread.sleep(2000);
		WebElement sendEmail=driver.findElement(By.xpath("//input[@id='sender_email']"));
		sendEmail.clear();
		sendEmail.sendKeys("sujyot.mohanty@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='auto_bcc0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"CalendarAndReminders_font\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Reminders_font\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='testbtn']")).click();
		
		
	
		
		
		
		
		
	}

}