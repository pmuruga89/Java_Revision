package Revision.collection.com;

import java.util.TreeSet;

public class TreeSet_1 {

	public static void main(String[] args) {

		TreeSet tset = new TreeSet();
		tset.add("Ravi");
		tset.add("Vijay");
		tset.add("ravi");
		tset.add("Ajay");
		tset.add("Zebra");
		System.out.println(tset);
	
		//***************first()**********************//will return the first(lowest) element in the tree set
		System.out.println("**************first()********************");
		System.out.println(tset.first());
		
		//***************last()********************//will return the last(highest) element in this sorted set
		System.out.println("**************last()******************");
		System.out.println(tset);
		System.out.println(tset.last());
		
		//**************lower(Object o)********//will return lower element than current element.
		System.out.println("*************lower(Object o)*******");
		System.out.println(tset);
		System.out.println(tset.lower("Vijay"));
		System.out.println(tset.lower("Ajay"));// will return null because there is no lower element after this element.	

		//**************higher(Object o)********//will return higher element than current element.
		System.out.println("**************higher(Object o)*******");
		System.out.println(tset);
		System.out.println(tset.higher("Vijay"));
		
		//*****************descendingSet()************//will perform descending order.
		System.out.println("***************descendingSet()**********");
		System.out.println(tset.descendingSet());

		//**********pollFirst()**************//return first element and remove it
		System.out.println("*********pollFirst()**************");
		System.out.println(tset);
		System.out.println(tset.pollFirst());
		System.out.println(tset);
		
		//**********pollLast()**************//return last element and remove it
		System.out.println("*********pollLast()**************");
		System.out.println(tset);
		System.out.println(tset.pollLast());
		System.out.println(tset);
		
}
}