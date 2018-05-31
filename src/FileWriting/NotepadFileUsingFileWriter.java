package FileWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NotepadFileUsingFileWriter {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\writefile\\notepadFileWriterClass.txt");
		FileWriter fw = new FileWriter(file);
		
		fw.write("murugan");
		fw.write("jeeva");
		
		fw.close();
	}

}
