package FileWriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVfileWrite {

	public static void main(String[] args) throws IOException {
	
		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\writefile\\csvFile.csv");
		FileWriter fw =  new FileWriter(file);
		BufferedWriter br = new BufferedWriter(fw);
		
		br.write("Murugan");
		br.append(",");//to move control to next cell (ie) it will type the below text in next cell.
		
		br.write("jeeva");
		br.append(",");
	
		br.write("mathi");
		
		br.newLine();
		br.write("Hello");
		br.close();
		
	}

}
