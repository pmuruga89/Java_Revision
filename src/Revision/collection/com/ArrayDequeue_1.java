package Revision.collection.com;

import java.util.ArrayDeque;

public class ArrayDequeue_1 {

	public static void main(String[] args) {
		ArrayDeque deque=new ArrayDeque();  
	    deque.offer("arvind");  
	    deque.offer("vimal");  
	    deque.add("mukul");  
	    deque.add("arun");
	    System.out.println(deque);

	    //**********addAll(Collection c)***************//add all the element at last
	    System.out.println("**********addAll(Collection c)***************");
	    ArrayDeque ad = new ArrayDeque();
	    ad.add("murugan");
	    ad.add("jeeva");
	    ad.add("mathi");
	    System.out.println(deque);
	    deque.addAll(ad);
	    System.out.println(deque);
	    
	    //************addFirst(Object o)********************//add element at 0th (head) index (first) position
	    System.out.println("************addFirst(Object o)********************");
	    deque.addFirst("murugan");
	    System.out.println(deque);
	    
	    //************addLast(Object o)**********//add element at last position (tail)
	    System.out.println("**********addLast(Object o)********");
	    deque.addLast("arun");
	    System.out.println(deque);
	    
	    //**********element()********************//it will give first position in the given list
	    System.out.println("**********element()************");
	    System.out.println(deque.element());
	    
	    //*****************getFirst()*****************//will give first position in the list
	    System.out.println("*****************getFirst()*****************");
	    System.out.println(deque.getFirst());
	    
	    //****************getLast()******************//will give last position in the given list
	    System.out.println("***************getLast()*****************");
	    System.out.println(deque);
	    System.out.println(deque.getLast());
	   
	    //*****************isEmpty()**************//will check whether given list is empty or not
	    System.out.println("*****************isEmpty()********");
	    System.out.println(deque.isEmpty());
	    
	    
	    //*****************contains(Object o)***********************//will check the whether the specified object is present in the list or not.
	    System.out.println("*****************contains(Object o)***********************");
	    System.out.println(deque.contains("murugan"));
	    
	    //****************containsAll(Collection c)***************//will check whether the specified collectin is present in the given list or not
	    System.out.println("****************containsAll(Collection c)*************");
	    System.out.println(deque.containsAll(ad));
	    
	    
	    //***************offer(Object c)******************//it will add the element in the last position in the give list
	    System.out.println("***************offer(Object c)******************");
	    System.out.println(ad);
	    System.out.println(ad.offer("arun"));
	    System.out.println(ad);
	    
	    //***************offerFirst(Object o)****************//will add the element in the first position
	    System.out.println("***************offerFirst(Object o)****************");
	    System.out.println(ad);
	    System.out.println(ad.offerFirst("arun"));
	    System.out.println(ad);
	    
	    //*****************offerLast(Object o)***********//will add the element in the last position
	    System.out.println("*************offerLast(Object o)**********");
	    System.out.println(ad);
	    ad.offerLast("Hello");
	    System.out.println(ad);
	    
	    //****************remove()***************//it will remove the first element in the list
	    System.out.println("*************remove()***************");
	    System.out.println(ad);
	    System.out.println(ad.remove());
	    System.out.println(ad);
	    
	    //**********removeFirst()************//will remove the first element in the list
	    System.out.println("**********removeFirst()**********");
	    System.out.println(ad);
	    ad.removeFirst();
	    System.out.println(ad);
	    
	    //**************removeLast()*********************//will remove the last element in the list
	    System.out.println("**************removeLast()************");
	    System.out.println(ad);
	    ad.removeLast();
	    System.out.println(ad);
	    
	    //*****************peek()***********//it will give the first element but does not remove it
	    System.out.println("**************peek()**********");
	    System.out.println(ad);
	    System.out.println(ad.peek());
	    System.out.println(ad);
	    
	    //***************poll()***************//it will give the first element and remove it from the list
	    System.out.println("***************poll()************");
	    System.out.println(ad);
	    System.out.println(ad.poll());
	    System.out.println(ad);
	    
	    //************peekFirst()****************//will return first element but not remove it
	    System.out.println("***************peekFirst()************");
	    System.out.println(ad);
	    System.out.println(ad.peekFirst());
	    System.out.println(ad);
	    
	    //************peekLast()****************//will return last element but not remove it
	    System.out.println("***************peekLast()************");
	    System.out.println(ad);
	    System.out.println(ad.peekLast());
	    System.out.println(ad);
	    
	    
	    //***********pollFirst()***************//will return the first element and remove it from the list
	    System.out.println("***********pollFirst()**************");
	    System.out.println(ad);
	    System.out.println(ad.pollFirst());
	    System.out.println(ad);
	    
	    //**************pollLast()**************//will return the last element and remove it from the list 
	    System.out.println("**************pollLast()*************");
	    ad.offer("murugan");
	    System.out.println(ad);
	    System.out.println(ad.pollLast());
	    System.out.println(ad);
	    
	    
	    //*************retainAll(Collectin c)**********************//it will remove all the element present in the invoking list except the specified element
	    System.out.println("*************retainAll(Collectin c)********************");
	    ad.add("murugan");
	    System.out.println(deque);
	    System.out.println(ad);
	    //here deque is invoking list
	    // ad is specified list
	    //so it will retain the all the element present in the ad[specified element] if the same element present in the invoking list[deque].
	    deque.retainAll(ad);
	    System.out.println(deque);
	    System.out.println(ad);
	    
	    //****************clear()**************// it will delete all the element in the list
	    System.out.println("****************clear()**************");
	    System.out.println(ad);
	    ad.clear();
	    System.out.println(ad);
	}

}
