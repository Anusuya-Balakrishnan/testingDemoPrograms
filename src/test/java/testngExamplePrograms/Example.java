package testngExamplePrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	
	@Test()
	@Parameters({"number1","number2"})
	public void test1(int a,int b) {
		System.out.println("test1");
		System.out.println("parameter value is"+a+"and "+b);
	}
	
	@Test()
	@Parameters({"number1","number2"})
	public void test2(int x,int y) {
		System.out.println("test2 and x="+x+"and y= "+y);
		
		System.out.println("program completed");
	}
	
	@Test()
	public void test3() {
		System.out.println("test3");
		
	}
	
	
	@BeforeTest
	public void test4() {
		System.out.println("Before test");
	}
	
	@AfterTest
	public void test5() {
		System.out.println("after test");
	}
	
	@BeforeMethod
	public void test6() {
		System.out.println("before Method");
	}

	@AfterMethod
	public void test7() {
		System.out.println("after Method");
	}
	
	@BeforeClass
	public void test8() {
		System.out.println("before class");
	}
	@AfterClass
	public void test9() {
		System.out.println("after class");
	}
	
}
