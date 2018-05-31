package Revision.collection.com;

import java.util.Arrays;

public class ArrayCopyAndCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = new int[4];
		
		arr[0] = 10;
		arr[1]	= 11;
		arr[2] = 18;
		arr[3] = 5;
		
		int ar[];
		//Array Copy
		ar = Arrays.copyOf(arr, arr.length);
		System.out.println(ar[3]);
		
		//Array compare
		System.out.println(Arrays.equals(arr, ar));
		
	}

}
