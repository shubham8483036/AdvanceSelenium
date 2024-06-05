package DataDrivenTestng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class instagramDataProvider {

	public static Object[][] insta() throws EncryptedDocumentException, IOException{
		Object [][] obj=new Object[2][2];
		FileInputStream fls= new FileInputStream("C:\\Users\\Dell\\Desktop\\framework\\insta.xlsx");
		Workbook work = WorkbookFactory.create(fls);
		Sheet sheet = work.getSheet("Sheet1");
		obj [0][0]=sheet.getRow(0).getCell(0).toString();
		obj[0][1]=sheet.getRow(0).getCell(1).toString();
		return obj;
	}
}
