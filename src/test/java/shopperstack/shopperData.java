package shopperstack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import DataDrivenTestng.ShopperLogin;

public class shopperData {
	public static  Object[][] ShopperLo() throws EncryptedDocumentException, IOException 
	{
		
		Object[][] obj=new Object[1][1];
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\framework\\SHOPPER.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		obj[0][0]=sheet.getRow(0).getCell(0).toString();
		obj[0][1]=sheet.getRow(0).getCell(1).toString();

		
			return obj;
}
	
}
