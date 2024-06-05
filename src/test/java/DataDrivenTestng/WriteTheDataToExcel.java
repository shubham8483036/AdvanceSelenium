package DataDrivenTestng;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteTheDataToExcel {
	@Test
	public void writeDataToExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fls=new FileInputStream("C:\\Users\\Dell\\Desktop\\framework\\writeData.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		Sheet sheet = wb.getSheet("sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(2);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("abc");
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Dell\\Desktop\\framework\\writeData.xlsx");
		wb.close();
		
		
		
	}
}
