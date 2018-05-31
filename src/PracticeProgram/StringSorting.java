package PracticeProgram;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Murugan";
		char c[] = s.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);	
		}
		
		String s2 = "Hello Chennai";
		String str[] = s2.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length;i++){
			System.out.print(sb.append(str[i]).reverse()+" ");
			sb.setLength(0);
		}
		
	}

}
