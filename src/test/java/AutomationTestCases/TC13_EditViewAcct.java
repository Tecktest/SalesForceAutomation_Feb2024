package AutomationTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC13_EditViewAcct {
	// TC 12 in sheet.Edit view

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		EditView_13();
	}

	public static void EditView_13() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a")).click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//*[@id=\"00BHn00000EEgnI_listSelect\"]/option[1]")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("fname")).sendKeys("NewChangedName");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fcol1\"]/option[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fop1\"]/option[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fval1\"]")).sendKeys("a");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")).click();

	}

}