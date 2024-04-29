package testngExamplePrograms;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example2 {
	
	
	@BeforeSuite
	public void test1() {
		System.out.println("before Suite");
	}

	@AfterSuite
	public void test2() {
		System.out.println("after suite");
	}
	@Test()
	@Parameters({"number1","number2"})
	public void test(int a,int b) {
		System.out.println("In Example2,test method is running a="+a+"b="+b);
	}
}
