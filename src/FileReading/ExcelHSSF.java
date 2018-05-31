package FileReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class ExcelHSSF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\readfile\\readXls.xls");
		FileInputStream fis = new FileInputStream(file);
		
		HSSFWorkbook hsf = new HSSFWorkbook(fis);// it read only .xls. not xlsx format
		//HSSFSheet hs = hsf.getSheet("Sheet1"); 
		HSSFSheet sh = hsf.getSheetAt(0);
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
