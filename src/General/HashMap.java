package General;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class HashMap {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		
		
		File f = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\New.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties pro = new Properties();
		pro.load(fis);
		fis.close();
		
		Enumeration en = pro.keys();
		
		while(en.hasMoreElements()){
			String key = (String)en.nextElement();
			String value = pro.getProperty(key);
			System.out.println("key and value:" +key);
		}
		
		System.out.println("Write Properties file");
		
		FileOutputStream fos = new FileOutputStream(f);
		pro.setProperty("math", "first");
		pro.setProperty("jeeva", "second");
		pro.store(fos,	null);
		
		
		
		
		
		
		
		
		
	}

}
