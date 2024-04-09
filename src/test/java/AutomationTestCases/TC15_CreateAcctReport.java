package AutomationTestCases;

import java.awt.Window;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.*;

public class TC15_CreateAcctReport {
	// TC 14 in sheet.Create account report

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		CreateAcctReport_15();
	}

	public static void CreateAcctReport_15() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);

		// Select dateFiled = new
		// Select(driver.findElement(By.xpath("//input[@name='dateColumn']")));
		// dateFiled.selectByVisibleText("Created Date");
		// Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ext-gen20\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ext-gen265\"]/div[3]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"ext-gen152\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ext-gen281\"]")).click();
		Thread.sleep(3000);

		WebElement endDate = driver.findElement(By.xpath("//*[@id=\"ext-comp-1045\"]"));
		endDate.clear();
		driver.findElement(By.xpath("//*[@id=\"ext-gen154\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ext-comp-1114\"]/tbody/tr[2]/td[2]/em")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ext-gen49\"]")).click();
		Thread.sleep(3000);

		Set<String> editWindowhandles = driver.getWindowHandles();
		for (String handle : editWindowhandles) {
			driver.switchTo().window(handle);
			System.out.println(handle);
		}

		driver.findElement(By.xpath("//*[@id=\"saveReportDlg_reportNameField\"]")).sendKeys("newTodayReport");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"saveReportDlg_DeveloperName\"]")).sendKeys("");
		Thread.sleep(4000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(
		ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"dlgSaveAndRun\"]/tbody/tr[2]/td[2]/em")));

		driver.findElement(By.xpath("//*[@id=\"dlgSaveAndRun\"]/tbody/tr[2]/td[2]/em")).click();

	}
}