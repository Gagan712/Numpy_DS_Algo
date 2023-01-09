package utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readXLfile {
	
	public String[][] getData(String excelsheetname) throws EncryptedDocumentException, IOException {
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Register.xlsx");
		FileInputStream fis = new FileInputStream(f) ;
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetname = wb.getSheet(excelsheetname);
		int totalrows = sheetname.getLastRowNum();
		System.out.println(totalrows);
		Row rowcells = sheetname.getRow(0);
		int totalcel = rowcells.getLastCellNum();
		System.out.println(totalcel);
		DataFormatter format = new DataFormatter();
		//List<Map<String, String>> excelRows = new ArrayList<Map<String, String>>();
		String[][] testdata = new String[totalrows][totalcel];
		
		for(int i=1; i<=totalrows;i++) {
			for (int j=0;j<totalcel;j++) {
				testdata[i-1][j] = format.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.println(testdata[i-1][j]);
			}
			
		}
		return testdata;
		
		
}

	
	
}

