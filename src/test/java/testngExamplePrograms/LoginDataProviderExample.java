package testngExamplePrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProviderExample {
	@DataProvider(name="loginData")
	public Object[][] getData(){
		Object[][] data= {{"standard_user","secret_sauce"},
				{"locked_out_user","secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"},
				};
		return data;
	}
	
	@Test(dataProvider = "loginData")
	public void login(String username,String password) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement usernameElement = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//input[@id='user-name']")));
		usernameElement.sendKeys(username);
		WebElement passwordElement = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//input[@id='password']")));
		passwordElement.sendKeys(password);
		WebElement loginBtnElement = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//input[@id='login-button']")));
		loginBtnElement.click();
	}
}













