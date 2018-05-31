package FileWriting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileWritingUsingXLSX {

	public static void main(String[] args) throws InvalidFormatException, IOException, InterruptedException {
	
		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\writefile\\writeXlsx.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		for(int i=0;i<20;i++){
			Row r = sh.getRow(i);
		
			if(r==null){
				r = sh.createRow(i);
			}
			
			for (int j = 0; j < 20; j++) {
				Cell c = r.getCell(j);

				if (c == null) {
					c = r.createCell(j);
				}

				FileOutputStream fos = new FileOutputStream(file);
				c.setCellValue("Murugan");
				wb.write(fos);
				Thread.sleep(10);
				fos.close();
			}
			
			System.out.println("completed.");
	   }
		
	}

}
