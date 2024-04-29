package basicPrograms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindows { 

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println("title"+driver.getTitle());
		Actions action =new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, 800);");
		Thread.sleep(3000);
		WebElement windowElement = wait.until(ExpectedConditions.presenceOfElementLocated
				(By.xpath("//a[@href='/windows']")));
		action.keyDown(Keys.CONTROL).click(windowElement).keyUp(Keys.CONTROL).perform();
		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		String childWindow="";
		for(String eachWindow:windowHandles) {
			if(!eachWindow.equals(parentWindow)) {
				driver.switchTo().window(eachWindow);
				childWindow=eachWindow;
				System.out.println("child Title"+driver.getTitle());
			}
		}
//		
////		closing parent window
		driver.switchTo().window(parentWindow);
		driver.close();
		
		
		
		driver.switchTo().window(childWindow);
//		closing child window
//		driver.close();
//		driver.get("https://letcode.in/windows");
		WebElement multipleBtn = wait.until(ExpectedConditions.
				presenceOfElementLocated(By.xpath("//button[@id='multi']")));
		multipleBtn.click();
		Set<String> allWindow = driver.getWindowHandles();
		
		for(String eachWindow:allWindow) {
			driver.switchTo().window(eachWindow);
			System.out.println("title"+driver.getTitle());
			driver.close();
		}
		
	}
}
