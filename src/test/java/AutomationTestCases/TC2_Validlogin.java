package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_Validlogin {
	
	//Test case 2 - Login to SFDC

	static WebDriver driver;

	public static void main(String[] args) throws Exception {		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");		
		validLogin_2();
	}

	public static void validLogin_2() throws Exception {		
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
}
}