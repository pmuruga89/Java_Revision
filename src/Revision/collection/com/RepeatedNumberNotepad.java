package Revision.collection.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class RepeatedNumberNotepad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\Eclipse-project\\Revision01\\Java_Revision\\src\\Revision\\RepeatedNumber.txt");
		FileWriter fw = new FileWriter("D:\\Eclipse-project\\Revision01\\Java_Revision\\src\\Revision\\RepeatedNumberWrite.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		StringBuffer sb = new StringBuffer();
		String line = null;
		
		while((line=br.readLine())!=null){
			sb.append(line);
		}
		br.close();
		char[] arr = sb.toString().toCharArray();
		System.out.println(arr);
		
		HashSet hs = new HashSet();
		for(int i=0;i<arr.length;i++){
			hs.add(arr[i]);
			
		}
		System.out.println(hs);
		Object arr1[] = hs.toArray();
	
		int ctr=0;
		ArrayList lst = new ArrayList();
		for(int a=0;a<arr1.length;a++){
			for(int b=0;b<arr.length;b++){
				if(arr1[a].equals(arr[b])){
					ctr=ctr+1;
				}
			}
			lst.add(ctr);
			ctr=0;
		}
		for(int c=0;c<arr1.length;c++){
			System.out.println("Number: "+arr1[c] +" Occurance: "+lst.get(c));
			String s = "Number: "+arr1[c]+"Occurance: "+ lst.get(c)+"";
			bw.write(s);
			bw.newLine();
			//bw.write("\n");
			//bw.write("Hello Murugan");
			
		}
		bw.close();		
	}

}
