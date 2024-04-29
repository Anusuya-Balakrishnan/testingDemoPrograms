package basicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		Thread.sleep(2000);
		WebElement selectElement = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select dropDownElement=new Select(selectElement);
		Thread.sleep(2000);
		dropDownElement.selectByVisibleText("Apple");
		Select superHeroDropDown=new Select(driver.findElement(By.xpath("//select[@id='superheros']")));
		Thread.sleep(2000);
		if(superHeroDropDown.isMultiple()) {
			superHeroDropDown.selectByValue("im");
			superHeroDropDown.selectByValue("sm");
			superHeroDropDown.selectByValue("ih");
		}
		
		
		Select languageDropDown=new Select(driver.findElement(By.xpath("//select[@id='lang']")));
		List<WebElement> options=languageDropDown.getOptions();
		for (WebElement element:options) {
			System.out.println(element.getAttribute("value")+" "+element.getText());
		}
		
		languageDropDown.selectByIndex(options.size()-1);
		
		
		Select countryDropDown=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		countryDropDown.selectByValue("India");
		System.out.println(countryDropDown.getFirstSelectedOption().getAttribute("value"));
		
		
		
		
		
//		WebElement fullNameElement = driver.findElement(By.xpath("//input[@id='fullName']"));
//		fullNameElement.sendKeys("Hello");
//		
//		WebElement getTextElement = driver.findElement(By.xpath("//input[@id='getMe']"));
//		String text = getTextElement.getAttribute("value");
//		System.out.println("text="+text);
//		driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
//		WebElement confirmElement = driver.findElement(By.xpath("//input[@id='noEdit']"));
//		System.out.println("Element is enabled or not "+confirmElement.isEnabled());
//		
//		WebElement element = driver.findElement(By.xpath("//input[@id='dontwrite']"));
////		element.sendKeys("Hello world");
//		System.out.println("readonly"+element.getAttribute("readonly"));
		
	}
}
