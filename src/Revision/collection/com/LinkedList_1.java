package Revision.collection.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_1 {

	public static void main(String[] args) {
		
		  LinkedList<Double> alist=new LinkedList<Double>();  
		  /*alist.add("Ravi");  
		  alist.add("Vijay");  
		  alist.add("Ravi");  
		  alist.add("Ajay");  */
		  
		  alist.add(20);
		  System.out.println(alist);
		 
		  
		// *******addFirst(Object o)************//it will add the object in the 0th index of the linked list
		System.out.println("****addFirst(Object o)*****");
		alist.addFirst("murugan");
		System.out.println(alist);
		
		//************add(int index, Object)********//it will add the object in the specified index position
		System.out.println("********add(int index, Object)******");
		alist.add(1, "jeeva");
		System.out.println(alist);
		
		//********addLast(Object o)**********//it will add the object in the last position of the linked list
		System.out.println("******addLast(Object o)********");
		alist.addLast("mathi");
		System.out.println(alist);
		
		//*********getFirst()**********// it will get the first element in the linked list
		System.out.println("******getFirst()********");
		System.out.println(alist.getFirst());
		
		//*********getLast()*************
		System.out.println("******getLast()*********");
		System.out.println(alist.getLast());
		
	
		//*********boolean contains(Object o)************// will return boolean value if the specified object is present in the linked list. 
		System.out.println("******boolean contains(Object o)********");
		System.out.println(alist.contains("murugan"));
		
		//***********boolean containsAll(Collect c)**********// will return boolean value if the specified list is present in the linked list.
		System.out.println("*********boolean containsAll(Collect c)********");
		LinkedList alist1 =  new LinkedList();
		alist1.add("murugan");
		alist1.add("mathi");
		alist1.add("jeeva");
		System.out.println(alist);
		System.out.println(alist1);
		System.out.println(alist.containsAll(alist1));//true
		alist1.add("hello");
		System.out.println(alist.containsAll(alist1));//false
		
		//**********remove()*************//it will remove the first element in the linked list and return the removed element
		System.out.println("********remove()*********");
		System.out.println(alist1);
		System.out.println(alist1.remove());
		System.out.println(alist1.remove());
		System.out.println(alist1);

		
		//**********remove(Object o)*************//it will remove the specified element in the linked list
		System.out.println("********remove(Object o)*********");
		System.out.println(alist1);
		alist1.remove("hello");
		System.out.println(alist1);
		
		//*********removeFirst()****************//return the first element and remove it from the list
		System.out.println("******removeFirst()****************");
		System.out.println(alist);
		System.out.println(alist.removeFirst());
		
		//********removeLast()*************//return the last element and remove it from the list
		System.out.println("*******removeLast()*************");
		System.out.println(alist);
		System.out.println(alist.removeLast());
		
		//**********removeAll(Collection c)************//remove all the specified collection from the invoking list
		System.out.println("********removeAll(Collection c)************");
		System.out.println(alist);
		alist.removeAll(alist1);
		System.out.println(alist);
		
		//***********removeLastOccurrence(Object o)**********// will remove the last occurrence of the specified object from the list
		LinkedList alist2 = new LinkedList();
		System.out.println("*******removeLastOccurrence(Object o)*******");
		alist2.add("murugan");
		alist2.add("mathi");
		alist2.add("murugan");
		alist2.add("jeeva");
		alist2.add("murugan");
		System.out.println(alist2);
		alist2.removeLastOccurrence("murugan");
		System.out.println(alist2);
		
		//******Following method already seen in ArrayList_1. the all the method in ArrayList_1 which are also common to Linked list
		//size()
		//indexof(Object c)
		//lastIndexOf(Object c)
		//addAll(Collection c)
		//clear()
		//equals()
		//get(int index)
		//isEmpty()
		//iterator()
		
		//*********descendingIterator()************// will return the element from the last index
		System.out.println("********descendingIterator()***********");
		System.out.println(alist);
		
		Iterator it = alist.descendingIterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		//*********Iterator()************//will return the element from the first(0th) index
		Iterator it1 = alist.iterator();
		System.out.println("*******Iterator******");
		while(it1.hasNext()){
			System.out.println(" "+it1.next());
		}
		
		//*************element()**************// will return the first element but does not remove it
		System.out.println("*************element()**************");
		System.out.println(alist);
		System.out.println(alist.element());
		System.out.println(alist);
		
		//**********listIterator(int index)********** will return the element from the starting index.
		System.out.println("*********listIterator(int index)*********");
		System.out.println(alist);
		Iterator it2 = alist.listIterator(2);//it takes index '2' as starting position.
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
						
		//*********offer(Object o)************//will add the element at the last(tail) position in the linked list
		System.out.println("********offer(Object o)**********");
		System.out.println(alist);
		alist.offer("murugan");
		System.out.println(alist);
		
		//**********offerFirst(Object o)*********//will add the element at the first(head) position in the linked list.
		System.out.println("*********offerFirst(Object o)******");
		System.out.println(alist);
		alist.offerFirst("mathi");
		System.out.println(alist);
		
		//**********offerLast(Object o)*********//will add the element at the last(tail) position in the linked list.
		System.out.println("*********offerLast(Object o)******");
		System.out.println(alist);
		alist.offerFirst("mathi");
		System.out.println(alist);
		
		//**********peak()***********//will return the first element not remove it from the linked list.
		System.out.println("*********peak()**********");
		System.out.println(alist);
		System.out.println(alist.peek());
		System.out.println(alist);
		
		//*********poll()************//will return the first element and remove it from the linked list.
		System.out.println("********poll()************");
		System.out.println(alist);
		System.out.println(alist.poll());
		System.out.println(alist);
		System.out.println(alist.poll());
		System.out.println(alist);
		
		//**************peekFirst()**********//will return the first element not remove it from the Linked list
		System.out.println("*************peekFirst()*********");
		System.out.println(alist);
		System.out.println(alist.peekFirst());
		
		//**************peekLast()**********//will return the last element not remove it from the Linked list
		System.out.println("*************peekLast()*********");
		System.out.println(alist);
		System.out.println(alist.peekLast());
		
		//**********pollFirst()*************//will return the first element and remove it from the linked list
		System.out.println("**********pollFirst()*************");
		System.out.println(alist);
		System.out.println(alist.pollFirst());
		System.out.println(alist);
		
		//*****************pollLast()**************//will return the last element and remove it from linked list.
		System.out.println("****************pollLast()************");
		System.out.println(alist);
		System.out.println(alist.pollLast());
		System.out.println(alist);
		
		
		//****************set(int index, Object c)*****************
		System.out.println("***************set(int index, Object c)*************");
		System.out.println(alist);
		alist.set(1, "murugan");
		System.out.println(alist);

		//****************List Iterator**************
		ListIterator litr  = alist.listIterator();//It will iterate forward and backward direction but if we want to perform hasPrevious(), hasNext() should be performed. 
		System.out.println("*********List Iterator*********");
		System.out.println(alist);
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		System.out.println("*********hasPrevious()*********");
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
		
	}

}
