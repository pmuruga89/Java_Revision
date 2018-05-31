package Revision.collection.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N number:");
		int n = sc.nextInt();
		System.out.println("Enter the Repeated Number");
		int arr[] = new int[n];
		for(int a=0;a<n;a++){
			int num = sc.nextInt();
			arr[a] = num;
		}
		//int arr[] = {1,2,3,1,2,3,5,5,5,5,6,7,8,9,8};
	
		HashSet hs = new HashSet();
		
		for(int i=0;i<arr.length;i++){
			hs.add(arr[i]);
		}
		System.out.println(hs.size());
		Object[] arr1 = hs.toArray();	
		System.out.println(arr1.length);
		
		int ctr=0;
		ArrayList lst = new ArrayList();
		for(int j =0;j<arr1.length;j++){
			
			for(int k=0;k<arr.length;k++){
				
				if(arr1[j].equals(arr[k])){
					ctr= ctr+1;
					
				}
			}
			lst.add(ctr);
			ctr=0;
		}
		for(int i=0;i<arr1.length;i++){
			System.out.println("Number: "+arr1[i] +" Occurance: "+lst.get(i));
		}
	}
}
