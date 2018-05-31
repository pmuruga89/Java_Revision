package FileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NotePadFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Eclipse-project\\Revision01\\Java_Revision\\readfile\\notepad.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		while((line = br.readLine())!=null){
			//line = br.readLine(); Note: dont use this line because aready we called readLine on 'while' condition so if you use it will read from second line.
			System.out.println(line);
		}
		br.close();
		
		
/*		//Storing into string buffer and returning it.
		StringBuffer sb = new StringBuffer();
		String line = null;
		while((line = br.readLine())!=null){
			sb.append(line+"\n");
		}
		br.close();
		System.out.println(sb);
*/
		
/*		//Storing StringBuffer value into String array.
		StringBuffer sb = new StringBuffer();
		String line = null;
		while((line = br.readLine())!=null){
			sb.append(line+";");
		}
		br.close();
		String all = sb.toString();
		String arr[] = all.split(";");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
*/
	}

}
