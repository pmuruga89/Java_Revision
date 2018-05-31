package FileWriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NotePadWriting {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\writefile\\notepad.txt");
		FileWriter fr = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fr);
        bw.append("Murugan");
        bw.newLine();// for new line.
     
        bw.append("jeeva");
        bw.newLine();
     
        bw.append("mathi");
		
        bw.close();
	}

}
