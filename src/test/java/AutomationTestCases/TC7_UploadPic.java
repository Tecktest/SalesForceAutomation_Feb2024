package AutomationTestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC7_UploadPic extends TC2_Validlogin {

	// TC 6 in excel - Upload picture in profile

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sujyot@eclerx.apm");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("testing#123");
		driver.findElement(By.id("Login")).click();

		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]")).click();

		//userUpdateLastname();
		//userUpdatePost();
		//userUploadFile();
		userPicUpload_7();
	}

	public static void userUpdateLastname() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img")).click();
		Thread.sleep(2000);

		Set<String> editWindowhandles = driver.getWindowHandles();
		for (String handle : editWindowhandles) {
			driver.switchTo().window(handle);
			System.out.println(handle);
		}

		driver.switchTo().frame("contactInfoContentId");
		driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a")).click();
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.clear();
		lastName.sendKeys("NewLastName");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		driver.switchTo().defaultContent();
	}

	public static void userUpdatePost() throws Exception {
		userUpdateLastname();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']")).click();
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_43_contents\"]/iframe")));
		driver.findElement(By.xpath("//body")).sendKeys("testing the post part");
		// driver.findElement(By.cssSelector("body")).sendKeys("testing the post part");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		Thread.sleep(2000);
	}

	public static void userUploadFile() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"publisherAttachContentPost\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"chatterUploadFileAction\"]")).click();
		Thread.sleep(2000);
		WebElement uploadFile = driver.findElement(By.xpath("//*[@id=\"chatterFile\"]"));
		uploadFile.sendKeys("C:\\Users\\pradh\\OneDrive\\Desktop\\assign_apr1.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"publishersharebutton\"]")).click();
	}

	public static void userPicUpload_7() throws Exception {

		WebElement ele = driver.findElement(By.xpath("//*[@id=\"uploadLink\"]"));

		// hover over the image
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		action.click().build().perform();

		// driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"uploadPhotoContentId\"]/iframe")));
		driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]")).click();
		WebElement uploadImage = driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']"));
		uploadImage.sendKeys("C:\\Users\\pradh\\OneDrive\\Desktop\\rose.jpg");
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadBtn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"j_id0:j_id7:save\"]")).click();
		driver.switchTo().defaultContent();

	}

}