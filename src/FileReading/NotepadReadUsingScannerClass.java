package FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NotepadReadUsingScannerClass {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\readfile\\notepadScannerClass.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		sc.close();

	}

}
