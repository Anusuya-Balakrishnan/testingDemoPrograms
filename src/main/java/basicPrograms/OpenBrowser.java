package basicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {


public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	RemoteWebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.saucelabs.com/am/XUI/#login/");
	Thread.sleep(2000);
	 WebElement element = driver.findElement(By.partialLinkText("I forgot"));
	Thread.sleep(2000);
	element.click();
//	System.out.println(element.getText());
//	for (WebElement element:elements) {
//		System.out.println("element"+element);
//	}
	
//	<div class="container">
//	
//	<p class="" id="" name="" style="">Hello</p>
//	<div>Java</div>
//	</div>
	
//	.container div{
//		
//	}
//	driver.findElement(By.cssSelector("div.container div"));
	
//	classname
//	tagname
//	name
//	linktext
//	partiallinktext
//	cssSelector
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	driver.get("https://demoqa.com/text-box");
//	Thread.sleep(2000);
//	WebElement userNameElement = driver.findElement(ById.id("userName"));
//	Thread.sleep(2000);
//	userNameElement.sendKeys("Thamizh");
//	WebElement userEmailElement = driver.findElement(By.id("userEmail"));
//	Thread.sleep(2000);
//	userEmailElement.sendKeys("thamizh@gmail.com");
//	WebElement currentAddressElement = driver.findElement(By.id("currentAddress"));
//	Thread.sleep(2000);
//	currentAddressElement.sendKeys("pondy");
//	WebElement permanentAddressElement = driver.findElement(By.id("permanentAddress"));
//	Thread.sleep(2000);
//	permanentAddressElement.sendKeys("pondy");
//	WebElement submitButton = driver.findElement(By.id("submit"));
//	Thread.sleep(2000);
//	submitButton.click();
}

}
