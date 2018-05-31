package PracticeProgram;

import java.util.Scanner;

public class EvenAddFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		
		int a = sc.nextInt();
		int b = a%2;
		System.out.println(b);
		if(b==0){
			System.out.println("The given number is Even");
		}else{
			System.out.println("The given number is Add");
		}

	}

}
