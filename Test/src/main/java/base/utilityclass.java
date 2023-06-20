package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass {

	public static String fetchdt(int rowindex,int colindex) throws IOException
	{
		
		FileInputStream file1= new FileInputStream("C:\\Users\\hp\\Desktop\\A.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file1);
		XSSFSheet sheet=book.getSheet("TestData");
		
		String data=sheet.getRow(rowindex).getCell(colindex).getStringCellValue();
		
		return data;
	
}
	
	public static void Screenshot(WebDriver driver,String filename) throws IOException {
		
		TakesScreenshot sc=(TakesScreenshot)driver;
	File src =sc.getScreenshotAs(OutputType.FILE);
	File dest= new File("E:\\Screenhots\\"+filename+".jpg");
		
	FileHandler.copy(src, dest); 		
		
	}

}
