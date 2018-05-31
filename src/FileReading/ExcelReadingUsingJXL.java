package FileReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReadingUsingJXL {

	public static void main(String[] args) throws IOException, BiffException {
		// Note: Make sure whether the jxl jar is added in this project or not
		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\readfile\\readXls.xls");
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		int row = sh.getRows();
		int col = sh.getColumns();
		
		System.out.println("Row: "+row);
		System.out.println("Column: "+col);
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				
				System.out.println(sh.getCell(i,j).getContents());
			}
		}
		
		
	}

}
