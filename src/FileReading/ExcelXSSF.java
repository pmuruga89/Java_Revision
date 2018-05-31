package FileReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelXSSF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\readfile\\read_Copy_Date.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook xsb = new XSSFWorkbook(fis);//will read only .xlsx file. not .xls
		XSSFSheet sh = xsb.getSheetAt(0);
		int totalRowCount = sh.getLastRowNum();
		
		for(int i=0;i<totalRowCount;i++){
			int cellCount = sh.getRow(i).getLastCellNum();
			for(int j=0;j<cellCount;j++){
				if((sh.getRow(i).getCell(j).getCellType())==XSSFCell.CELL_TYPE_STRING){
					System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
				}else if((sh.getRow(i).getCell(j).getCellType())==XSSFCell.CELL_TYPE_NUMERIC){
				System.out.println(sh.getRow(i).getCell(j).getNumericCellValue());
					
				}else if((sh.getRow(i).getCell(j).getCellType())==XSSFCell.CELL_TYPE_NUMERIC){
					System.out.println(sh.getRow(i).getCell(j).getDateCellValue());
				}
			}
		}
		
		
	}

}
