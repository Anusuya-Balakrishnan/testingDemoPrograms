package testngExamplePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {

	@Test
	public void data() throws FileNotFoundException {
		
		
		try {
			FileInputStream file=new FileInputStream("data.xlsx");
			XSSFWorkbook excelFile = new XSSFWorkbook(file);
			XSSFSheet sheet = excelFile.getSheet("Sheet1");
		
			Object[][] arrayData=new Object[4][2];
			
//			{{1,12},{2,45},{},{}}
			int noOfRows=sheet.getLastRowNum();
			for(int i=0;i<=noOfRows;i++) {
				XSSFRow row = sheet.getRow(i);
				int noOfColumn=row.getLastCellNum();
				for (int j=0;j<noOfColumn;j++) {
					arrayData[i][j]=(int)row.getCell(j).getNumericCellValue();
					System.out.println("data"+row.getCell(j).getNumericCellValue());
				}
			}
			for(int i=0;i<arrayData.length;i++) {
				
				
				for (int j=0;j<arrayData[i].length;j++) {
					System.out.print(arrayData[i][j]+" ");	
				}
				System.out.println(" ");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
