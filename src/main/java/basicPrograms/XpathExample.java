package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://oceanacademy.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement popupElement = driver.findElement(By.xpath("//div[@class='pop-up-div']"));
		if(popupElement.isEnabled()) {
			WebElement closeElement = driver.findElement(By.xpath("//div[@class='c-icon']"));
			closeElement.click();
		}
		WebElement jobPortalElement=driver.findElement(By.xpath("//a[contains(@href,'/job-portal')]"));
//		WebElement jobPortalElement = driver.findElement(By.xpath("//a[contains(text(),'Portal')]"));
		Thread.sleep(2000);
		jobPortalElement.click();
//		WebElement courseElement = driver.findElement(By.xpath("//a[@id='courses']"));
		
//		//div[contains(@class,'c-icon')]
//		Thread.sleep(2000);
//		courseElement.click();
	
	}

}
