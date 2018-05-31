package FileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVfileRead {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Java_Revision\\readfile\\csvFile.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
		
	
		
/*		//Note: storing into StringBuffer.
		StringBuffer sb = new StringBuffer();
		String line = null;
		while((line = br.readLine())!=null){
			sb.append(line+"\n");
			
		}
		br.close();
		System.out.println(sb);
		
		//storing into array.
		String all = sb.toString();
		String arr[] = all.split(",");
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
*/		
	}

}
