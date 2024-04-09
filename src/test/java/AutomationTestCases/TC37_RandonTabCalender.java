package AutomationTestCases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC37_RandonTabCalender {

	// Test case 36 in sheet - Blocking an event in the calender

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		validLogin_2(); // common login page
		randomtabCalend_37();
	}

	public static void randomtabCalend_37() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a")).click();
		Thread.sleep(2000);
		// 8:00 pm link
		driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a")).click();
		Thread.sleep(2000);

		//select "other" from combo box
		String originalWindow = driver.getWindowHandle();
		assert driver.getWindowHandles().size() == 1;

		driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img")).click();
		Thread.sleep(2000);
		Set<String> handle = driver.getWindowHandles();

		for (String handles : handle) {
			if (!originalWindow.equals(handles)) {
				driver.switchTo().window(handles);
				break;
			}
		}
		driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.switchTo().window(originalWindow);

		driver.findElement(By.xpath("//*[@id=\"EndDateTime_time\"]")).click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("simpleTimePicker")));
		
		//Selecting end time 11:00 pm
		driver.findElement(By.xpath("//*[@id=\"timePickerItem_46\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]")).click();
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