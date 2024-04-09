package AutomationTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC14_MergeAcct {
	// TC 13 in sheet.Merge accounts

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		MergeAccount_14();
	}

	public static void MergeAccount_14() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='srch']")).sendKeys("to");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]")).click();
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(3000);
		alert.accept();	
	}

}