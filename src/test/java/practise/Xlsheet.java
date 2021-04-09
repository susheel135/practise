package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Xlsheet {
@Test(dataProvider="readData")
public void dataReadingFromSheet(Object sno,String Name,String Class) throws IOException {
	System.out.println(sno+"=="+Name+"=="+Class);
}
@DataProvider
public Object[][] readData() throws IOException{
FileInputStream f =	new FileInputStream(new File("c:\\Users\\user\\Desktop\\testing.xlsx"));
XSSFWorkbook book = new XSSFWorkbook(f);
Sheet sheet =book.getSheet("Sheet2");
Row row = sheet.getRow(0);
int lstRow = sheet.getLastRowNum();
int lstCol = sheet.getRow(0).getLastCellNum();
System.out.println(sheet.getLastRowNum());
System.out.println(sheet.getRow(0).getLastCellNum());
Object[][] objs = new Object[lstRow][lstCol];
for(int i=1;i<lstRow+1;i++) {	
for(int j=0;j<lstCol;j++) {
	try {
		objs[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue(); 
	}catch(Exception e) {
		objs[i-1][j] = sheet.getRow(i).getCell(j).getNumericCellValue();
	}
}
}
return objs;	
}
//@Test
public void method() throws IOException {
	FileInputStream f =	new FileInputStream(new File("c:\\Users\\user\\Desktop\\testing.xlsx"));
	XSSFWorkbook book = new XSSFWorkbook(f);
	Sheet sheet =book.getSheet("Sheet2");
	Row row = sheet.getRow(0);
	int lstRow = sheet.getLastRowNum();
	int lstCol = sheet.getRow(0).getLastCellNum();
	System.out.println(sheet.getLastRowNum());
	System.out.println(sheet.getRow(0).getLastCellNum());
	Object[][] objs = new Object[lstRow][lstCol];
	for(int i=1;i<lstRow+1;i++) {	
	for(int j=0;j<lstCol;j++) {
		try {
			System.out.println(sheet.getRow(i).getCell(j).getStringCellValue()); 
		}catch(Exception e) {
			System.out.println(sheet.getRow(i).getCell(j).getNumericCellValue());

		}
	}
	}
}
}
