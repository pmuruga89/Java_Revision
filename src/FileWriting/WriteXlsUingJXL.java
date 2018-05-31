package FileWriting;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class WriteXlsUingJXL {

	public static void main(String[] args) throws BiffException, IOException, WriteException {
		// Note: Make sure whether the jxl jar is added in this project or not

		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\writefile\\writeXls.xls");
		//FileInputStream fis = new FileInputStream(file);
		
		WritableWorkbook wb = Workbook.createWorkbook(file);
		WritableSheet sheet = wb.createSheet("Sheet1", 0);
		
		Label la1 = new Label(0,0,"Murugan");
		sheet.addCell(la1);
		
		Label la2 = new Label(5, 3, "Jeeva");//set the "Jeeva" content in 5th column 3rd row.
		sheet.addCell(la2);
		
		wb.write();
		wb.close();
		System.out.println("Completed");
		
	}

}
