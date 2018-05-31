package FileWriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\PropertiesFile\\writeProperties.properties");
		FileOutputStream fos = new FileOutputStream(file);
				
		Properties pro = new Properties();
		pro.setProperty("p", "murugan");
		pro.setProperty("m", "mathi");
		pro.setProperty("a", "arun");
		pro.store(fos, null);
		
		fos.close();
		System.out.println("values are written in Pro file.");
	}

}
