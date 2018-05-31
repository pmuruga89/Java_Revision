package FileReading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NotepadReadUsingReadAllByte {

	public static void main(String[] args) throws IOException {
		
	String s = new String (Files.readAllBytes(Paths.get("D:\\Eclipse-project\\Revision01\\Java_Revision\\readfile\\notepadFileReaderClass.txt")));

	System.out.println(s);
	String currentDir = System.getProperty("user.dir");
	
	System.out.println(System.getProperties());
	
	}

}
