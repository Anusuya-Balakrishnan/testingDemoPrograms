package testngExamplePrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {
 
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data= {{"java",12},{"python",45},{"reactjs",78},{"html",98}};
		return data;
	}
	
	
	@Test(dataProvider = "getData")
	public void test(String value,int num) {
		System.out.println("data="+value+"num="+num);
	}
}








