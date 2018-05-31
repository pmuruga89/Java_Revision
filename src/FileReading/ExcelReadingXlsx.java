package FileReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class ExcelReadingXlsx extends FileNotFoundException{

	public static int rowCount(String path){
		int rowNum=-1;
		try{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);//will read both .xls and .xlsx
			Sheet sh = wb.getSheet("Sheet1");
			rowNum = sh.getLastRowNum();
			return rowNum;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return rowNum;
	}
	public static int columnCount(String path, int rownum){
		int colmnCount=-1;
		try{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Sheet1");
			colmnCount = sh.getRow(rownum).getLastCellNum();
			return colmnCount;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return colmnCount;
	}
	public static String getStringCellValue(String path,int row, int cell){
		String cellValue=null;
		try{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Sheet1");
			cellValue = sh.getRow(row).getCell(cell).getStringCellValue();
			return cellValue;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return cellValue;
	}
	public static int getNumericCellValue(String path,int row, int cell){
		int cellValue=-1;
		try{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Sheet1");
			cellValue = (int) sh.getRow(row).getCell(cell).getNumericCellValue();
			return cellValue;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return cellValue;
	}
	public static int getCellType(String path,int row, int cell){
		int type =-1;
		try{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Sheet1");
			type = sh.getRow(row).getCell(cell).getCellType();
			return type;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\Eclipse-project\\Revision01\\Java_Revision\\readfile\\readXls.xls";
		
		
		
		int tatalrowcnt = ExcelReadingXlsx.rowCount(path);
		
		
		for(int i=0;i<tatalrowcnt;i++){
			
			int totalcellcnt = ExcelReadingXlsx.columnCount(path, i);
			
			for(int j=0;j<totalcellcnt;j++){
				
				if(ExcelReadingXlsx.getCellType(path, i, j)==XSSFCell.CELL_TYPE_STRING){
				
				String value = ExcelReadingXlsx.getStringCellValue(path, i, j);
				System.out.println(value);
				}
				System.out.println("************Numeric************");
				if(ExcelReadingXlsx.getCellType(path, i, j)==XSSFCell.CELL_TYPE_NUMERIC){
					System.out.println("Numeric:"+XSSFCell.CELL_TYPE_NUMERIC);
					int value = ExcelReadingXlsx.getNumericCellValue(path, i, j);
					System.out.println(value);
				}
			}
		}
			
		
	}

}
