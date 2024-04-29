package basicPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://oceanacademy.co.in/");
//		Thread.sleep(5000);
//		
		
//		mouse action methods example
		
//		Actions action=new Actions(driver);
//		WebElement popupElement = driver.findElement(By.xpath("//div[@class='pop-up-div']"));
//		if(popupElement.isEnabled()) {
//			WebElement closeElement = driver.findElement(By.xpath("//div[@class='c-icon']"));
//			action.click(closeElement).perform();
//		}
//		
//		Thread.sleep(2000);
//		WebElement aboutElement = driver.findElement(By.xpath("//a[text()='About Us']"));
//		action.moveToElement(aboutElement).perform();
		
		
//		drag and drop action example 
		
		
//		driver.get("https://letcode.in/dropable");
//		Actions action=new Actions(driver);
//		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
//		action.dragAndDrop(sourceElement, targetElement).perform();
		
		driver.get("https://bookcart.azurewebsites.net/login");
		Actions action=new Actions(driver);
		WebElement userNameElement = driver.findElement(By.xpath("//input[@id='mat-input-0']"));

		action.sendKeys(userNameElement,"").keyDown(Keys.SHIFT).sendKeys("abcd").keyUp(Keys.SHIFT).sendKeys("xyz").perform();
		
		
	}
}


















