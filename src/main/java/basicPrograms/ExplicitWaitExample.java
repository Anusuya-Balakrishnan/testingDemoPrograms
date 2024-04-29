package basicPrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitExample {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/waits");
	WebDriverWait  wait =new WebDriverWait(driver, Duration.ofSeconds(10));
//	WebElement buttonElement = driver.findElement(By.xpath("//button[@id='accept']"));
	WebElement buttonElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='accept']")));
	buttonElement.click();
	
	Alert until = wait.until(ExpectedConditions.alertIsPresent());
	System.out.println(until.getText());
	Thread.sleep(2000);
	until.accept();
	
}
}
