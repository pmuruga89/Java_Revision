package FileReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\PropertiesFile\\readProperties.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		
		Enumeration en = pro.propertyNames();
		
		while(en.hasMoreElements()){
			String keys = (String)en.nextElement();
			String value = pro.getProperty(keys);
			
			System.out.println("Keys: and value: "+keys +" "+value);
		}

	}

}
