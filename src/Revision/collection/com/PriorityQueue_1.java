package Revision.collection.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_1 {

	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		queue.add("Arun");
		System.out.println(queue);
		
		//**********offer(Object o)*****************//It will add the element at the end of the queue list
		System.out.println("*********offer(Object o)*************");
		queue.offer("Vijay");
		System.out.println(queue);
		
		//**************remove()**********************//it retrieve and remove the element present in the head(first) of the queue list.
		System.out.println("*************remove()********************");
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		
		//**************peek()***********************//it retrieve the first element, does not remove it. 
		System.out.println("************peek()*****************");
		System.out.println(queue.peek());
		System.out.println(queue);
		
		//***************poll()*********************//it retrieve the first element, but remove that element from the queue.
		System.out.println("*************poll()******************");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		
		
		//****************element()****************//it retrieve the first element from the queue but doest not remove it.
		System.out.println("**************element()*************");
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue);
		
		//Note: get method is not present in queue.
		// so if you want to get the element use iterator and save the retrieve element in list.
		
		Iterator it = queue.iterator();
		ArrayList lst = new ArrayList();
		while(it.hasNext()){
			
			lst.add(it.next());
			
		}
		System.out.println(lst);
		
		
		
		
		
		
		
		
		
		
		

	}

}
