package AutomationTestCases;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC38_RandonBlockCalender {

	// Test case 37 in sheet - Blocking an event in the calender with weekly
	// recurrance

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		validLogin_2(); // common login page
		randomBlockCalen_38();

	}

	public static void randomBlockCalen_38() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a")).click();
		Thread.sleep(2000);
		// 4:00 pm link
		driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a")).click();
		Thread.sleep(2000);

		// select "other" from combo box
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

		// Selecting end time 7:00 pm
		driver.findElement(By.xpath("//*[@id=\"timePickerItem_38\"]")).click();
		Thread.sleep(2000);

		// select "Recurrence" checkbox
		driver.findElement(By.xpath("//input[@id='IsRecurrence']")).click();
		Thread.sleep(2000);

		// select "Frequency" weekly
		
		//WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("rectypeftw")));
		
		driver.findElement(By.xpath("//input[@id='rectypeftw']")).click();
		Thread.sleep(2000);

		// select "Every" 1
	
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("wi")));
		
		// select day
		driver.findElement(By.xpath("//input[@id='1']")).click();
		Thread.sleep(2000);
		
		//sat option deselect as it by default
		WebElement satOpt = driver.findElement(By.xpath("//input[@id='64']"));		
		if(satOpt.isSelected()) {
			satOpt.click();	
		}	
	
		//driver.findElement(By.xpath("//input[@id='recdd1']")).click();
		Thread.sleep(2000);		

		// select End date
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY");
		Date dt = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(dt);
		cl.add(Calendar.DAY_OF_YEAR, 15);
		dt = cl.getTime();

		String str = df.format(dt);
		System.out.println("adding 15 days to toda's date   " + str);

		WebElement recurreDate = driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		recurreDate.sendKeys(str);
		Thread.sleep(2000);
		
		//click save button
		
		driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]")).click();
		
	//Actions actions = new Actions(driver);		
	//WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
      // actions.moveToElement(saveButton).click().build().perform();

		
	driver.findElement(By.xpath("//*[@id=\"bCalDiv\"]/div/div[2]/span[2]/a[3]/img")).click();
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