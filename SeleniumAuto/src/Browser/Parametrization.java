package Browser;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
  // static String[] s=new String[3]; // declaring fixed size array 
	public static String getTestData(int row, int cell, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C://Users//hp//Documents//Testing//SeleAutoNotes//TestData.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue(); // it will read excel sheet as (0 row, 0 column) //getStringCellValue() it will read the value from that perticular field
		return value; 
		
		//int rowcount=WorkbookFactory.create(file).getSheet("Credentials").getLastRowNum();
	//int clmncount=WorkbookFactory.create(file).getSheet("Credentials").getRow(0).getLastCellNum();
	//System.out.println(rowcount);			
		/*
		//another method by using array to fetch data but not used at it will fetch all date but not required all For coding 
		for(int i=0; i<=2; i++) 
		{
			FileInputStream file=new FileInputStream("C:\\Users\\hp\\Documents\\Testing\\SeleAutoNotes\\TestData.xlsx");
			String value=WorkbookFactory.create(file).getSheet("Credentials").getRow(i).getCell(1).getStringCellValue(); 
		    s[i]=value;
		}
			return s;	
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String[] data=Parametrization.getTestData();
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
	}*/
	}
}
	











