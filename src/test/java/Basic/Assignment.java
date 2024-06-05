package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Assignment{

    @Test
    public void readData() throws EncryptedDocumentException, IOException {

        File path = new File("C:\\Users\\Saurabh\\OneDrive\\Desktop\\qspider\\Advance Selenium\\PrimeOdd.xlsx");

        FileInputStream fls = new FileInputStream(path);

        Workbook wb = WorkbookFactory.create(fls);

        Sheet sheet = wb.getSheet("Sheet1");

        int row = sheet.getPhysicalNumberOfRows();
        int column = sheet.getRow(0).getPhysicalNumberOfCells();

        for (int i = 0; i < row; i++) 
        {
        	
            for (int j = 0; j < column; j++)
            	
            {
                String data = sheet.getRow(i).getCell(j).toString();
                double number = Double.parseDouble(data); // Parse as double instead of int
                
                
                if (isOdd(number))
                	
                  {
                    System.out.println(number + " is odd number");
                  } 
                
                
                if (isPrime(number))
                	
                  {
                    System.out.println(number + " is Prime Number");
                  }
            }
        }

    }
    
    
    

    // Method to check if a number is odd
    private boolean isOdd(double num)
    {
        return num % 2 != 0;
    }

    
    
    
    // Method to check if a number is prime
    public static boolean isPrime(double no)
	 {
	 	int i;
	 	for( i=2;i<no;i++)
	 	{
	 		
	 		if(no%i==0)
	 		{
	 			return false;
	 		}
	 	}


	 	return true;
	 

	 }
  }