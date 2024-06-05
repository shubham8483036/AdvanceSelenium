package com.crm.productExternalData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DWSExcelUtility {
	
	public String efUtil(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream eutil = new FileInputStream("C:\\Users\\Dell\\Desktop\\framework\\DWS.xlsx");
		
		Workbook wb = WorkbookFactory.create(eutil);
		
		Sheet sh = wb.getSheet("Sheet6");
		
		String data1 = sh.getRow(0).getCell(0).toString();
         return data1;
	}	 
    
}