package Revision.collection.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_1_CommonForCollection {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		// Let see the basic collection method
		
		//******* add( Object o) method*********
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		//****** addAll(Collection c)******** add all the specified element in the invoking list at the end.
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Murugan");
		list1.add("mathi");
		list1.add("Jeeva");
		System.out.println("Before addAll list " +list);
		list.addAll(list1);
		System.out.println("After addAll list " +list);
		
		//***** removeAll(Collection c)******delete all the specified element in the invoking list
		System.out.println("****Remove All****");
		//list.removeAll(list1);
		System.out.println(list);
		
		//*****retainAll(Collection c)****** delete all the element present in the invoking list except the specified element. 
		System.out.println("****Retain All****");
		System.out.println(list);
		list1.add("kumar");
		System.out.println(list1);
		list.retainAll(list1);
		System.out.println(list);
		
		//*******remove(Objecg c)********* remove specified element
		System.out.println("****Remove(Object c)****");
		//list.remove("Murugan");
		System.out.println(list);
		
		//*******remove(int i)******Remove index value
		System.out.println("******remove(4)*****");
		//list.remove(4);
		System.out.println(list);
		
		
		//********size()******* will return size of the current list
		System.out.println("*****size()*******");
		System.out.println(list.size());
		//List and array both are same in list we use .size(), but in array have to use .length() method
		String arr[] = {"Ravi", "Vijay", "Ravi", "Ajay", "jeeva"};
		System.out.println(arr.length);
		
		//*******contains(Object c)******** verify the presence of specific elements in the invoking list
		System.out.println("*******contains(Object c)******");
		System.out.println(list);
		System.out.println(list.contains("jeeva"));
		
		
		//*********containsAll( Collection c)********* verify the present of specific list in the invokin list, it will not check by element order
		System.out.println("********containsAll(Collection c)**********");
		System.out.println(list);
		System.out.println(list1);
		System.out.println(list.containsAll(list1));
		list.add("Murugan");
		list.add("mathi");
		System.out.println(list.containsAll(list1));
		
		//*************equals(Object c)************ it is used to check the object equality, mean values not an address.
		System.out.println("*****equals(Object c)*******");
		System.out.println(list);
		System.out.println(list1);
		System.out.println((list.get(4)).equals(list1.get(0)));
		
		//************hashCode()********** will return hash code.
		System.out.println("****hashCode()*******");
		System.out.println(list.get(0).hashCode());
		System.out.println(list.get(1).hashCode());
		
		//*****iterator()*********
		System.out.println("***iterator()*******");
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//Suppose if the list has only one value then what will happen. Nothing will happen
		//.hashNext() will return boolean value and .next() will return the current value.
		ArrayList list2 = new ArrayList();
		list2.add("Hello");
		Iterator itr1 = list2.iterator();
		System.out.println(itr1.hasNext());
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		//********clear()*********** It is used to delete all the elements in the specified list
		System.out.println("******clear()********");
		System.out.println(list);
		list.clear();
		System.out.println(list);

		//*********toArray()**********It is used to convert Array list into array. 
		Object a[] = list1.toArray();//here we have to use Object array not string array because collection hold only the object
		
		ArrayList<String> lst = new ArrayList<String>();//Cannot use String array instead of of Object array even though changing array list into generic.  
		lst.add("murugan");
		lst.add("mathi");
		lst.add("jeeva");
		//String arr[] = lst.toArray(); //throw error
		
		//************isEmpty()********** It is used to check whether the list is empty or not
		System.out.println("*********isEmpty()*******");
		System.out.println(list.isEmpty());
		
		//****************List Iterator**************
		ListIterator litr  = lst.listIterator();//It will iterate forward and backward direction but if we want to perform hasPrevious(), hasNext() should be performed. 
		System.out.println("*********List Iterator*********");
		System.out.println(lst);
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		System.out.println("*********hasPrevious()*********");
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
	}

}
