package basicPrograms;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertBoxHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement simpleAlertBtn = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath("//button[@id='accept']")));
		simpleAlertBtn.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement confirmAlertBtn = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath("//button[@id='confirm']")));
		confirmAlertBtn.click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		confirmAlert.dismiss();
		Thread.sleep(2000);

		 WebElement promptAlertBtn = wait.until(ExpectedConditions.
					presenceOfElementLocated(By.xpath("//button[@id='prompt']")));
		 promptAlertBtn.click();
		 Thread.sleep(2000);
		 Alert promptAlert = driver.switchTo().alert();
		 System.out.println(promptAlert.getText());
		 promptAlert.sendKeys("Hello java");
		 Thread.sleep(2000);
		 promptAlert.accept();
		 Thread.sleep(2000);
		 WebElement modernAlertBtn = wait.until(ExpectedConditions.
					presenceOfElementLocated(By.xpath("//button[@id='modern']")));
		 modernAlertBtn.click();
		 Thread.sleep(2000);
		 WebElement closeBtn = wait.until(ExpectedConditions.
				 presenceOfElementLocated(By.xpath("//button[@aria-label='close']")));
		 Thread.sleep(2000);
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
		 File source = scrShot.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(source,new File("test.png"));
		 closeBtn.click();
		 Thread.sleep(2000);
		 
		 
		 driver.quit();

	}
}
