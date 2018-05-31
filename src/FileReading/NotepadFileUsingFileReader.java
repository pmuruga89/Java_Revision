package FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NotepadFileUsingFileReader {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\readfile\\notepadFileReaderClass.txt");
		FileReader fr = new FileReader(file);
		
		int line;
		while((line = fr.read())!=-1){
			System.out.print((char)line);
		}
		
		fr.close();
		
		
		
	}

}
