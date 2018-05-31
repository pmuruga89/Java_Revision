package Revision.collection.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_2 {
	String m,n;
	ArrayList_2(String m, String n){
		this.m = m;
		this.n = n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList lst1 = new ArrayList();
		lst1.add("murugan");
		lst1.add("100");
		lst1.add("jeeva");
		lst1.add("mathi");
		lst1.add("300");
		
		//*******add(int i, Object c)*********** adding an object to the specific index position
		System.out.println("******add(int i, Object c)*********");
		System.out.println(lst1);
		lst1.add(3, "200");
		System.out.println(lst1);
		
		ArrayList lst2 = new ArrayList();
		lst2.add("AAA");
		lst2.add("BBB");
		lst2.add("CCC");
		
		//*******add(int i, Collection c)*****adding an list of an object on specific index position
		System.out.println("*******add(int i, Collection c)****");
		System.out.println(lst1);
		System.out.println(lst2);
		lst1.add(2, lst2);
		System.out.println(lst1);
		System.out.println("Index of '2': "+lst1.get(2));
		
		//******remove(int i)********** remove presence of object from the specified index position
		System.out.println(lst1);
		lst1.remove(2);
		System.out.println(lst1);
		
		//Iterator concept
		Iterator itr = lst1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//For each Loop
		System.out.println("*****For Each Loop");
		for(Object obj: lst1){
			System.out.println(obj);
		}
				
		ListIterator litr  = lst1.listIterator();//It will iterate forward and backward direction but if we want to perform hasPrevious(), hasNext() should be performed. 
		System.out.println("*********List Iterator*********");
		System.out.println(lst1);
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		System.out.println("*********hasPrevious()*********");
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
		
	}

}
