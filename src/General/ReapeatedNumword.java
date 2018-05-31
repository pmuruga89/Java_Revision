package General;

import java.util.Scanner;

public class ReapeatedNumword {
	
	int input(int a){
		System.out.println("int");
		return a;
	}
	String input(String a){
		System.out.println("String ");
		return a;
	}
	
	public static void main(String args[]){
		
		ReapeatedNumword rn = new ReapeatedNumword();
		int n=-1; String s=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		if(sc.hasNextInt()){
			n = sc.nextInt();
			rn.input(n);
		}else if(sc.hasNextLine()){
			s=sc.nextLine();	
			rn.input(s);
		}else if(sc.hasNextLine()){
			s=sc.nextLine();	
			rn.input(s);
		}
		
			
		
	}
}
