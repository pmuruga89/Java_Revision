package Revision.collection.com;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionS_static_method {
	
	void add(){
		System.out.println("sdfsd");
	}
	public static void main(String args[]){
		
		ArrayList lst = new ArrayList();
		lst.add("murugan");
		lst.add("Jeeva");
		lst.add("zera");
		lst.add("sathya");
		lst.add("mathi");
		lst.add("er");
		System.out.println(lst);
		
		System.out.println("*****Collection sort below*****");
		//To perform sorting the words should be 'small' character otherwise it would take 'Capital' letter as first preference.
		//Note: Collections.sort() ->Return type void method. its we cannot give directly to syso'.
		//System.out.println(Collections.sort(lst));
		Collections.sort(lst);
		System.out.println(lst);
		
		
		System.out.println("****Collection minimum below****");
		//Collections.min() ->Return type is not 'void' so we can use it in syso'.
		System.out.println(Collections.min(lst));
		String min = Collections.min(lst);
		System.out.println("min= "+min);
		
		System.out.println("****Collection Maximum below****");
		//Collections.max(); //->Return type is not 'void' so we can use it in syso'.
		System.out.println(Collections.max(lst));
		String max = Collections.max(lst);
		System.out.println("max= "+max);
		
		System.out.println("****Collection reverse below****");
		//Collections.reverse(); //->Return type is 'void' so we can use it in syso'.
		//System.out.println(Collections.reverse(lst));
		Collections.reverse(lst);
		System.out.println(lst);
		
		System.out.println("****Collection binary search below****");
		//Collections.binarySearch(); //->Return type is not 'void' so we can use it in syso'.
		int i = Collections.binarySearch(lst, "murugan");
		System.out.println(i);
		
		
		System.out.println("****Collection Shuffle below****");
		//Collectionns.shuffle() -> its return type is void
		//System.out.println(Collections.shuffle(lst));
		Collections.shuffle(lst);
		System.out.println(lst);
		
		// To perform 'Copy'
		
		ArrayList lst1 = new ArrayList();
		lst1.add("sumathi");
		lst1.add("thulasi");
		lst1.add("chitra");
		lst1.add("ponnusamy");
		lst1.add("mathi");
		//lst1.add("welcome");
		
		
		System.out.println("****Collection Copy****");
		//To copy the value from source to destination, source should have a sufficient memory location otherwise it will throws exception.
		//source: lst1 ->if have 6 instead of 5 values it would throw error. 
		//dest: lst -> have 5 value
		Collections.copy(lst, lst1);
		System.out.println(lst);
				
		
		System.out.println("****Collection disjoint below****");
		//Returns true if the two specified collections have no elements in common. 
		//Collections.reverse(); //->Return type is not 'void' so we can use it in syso'.
		
		ArrayList lst2 = new ArrayList();
		ArrayList lst3 = new ArrayList();
		
		lst2.add("Muru");
		lst3.add("Jeeva");
		System.out.println(Collections.disjoint(lst2, lst3));//it will return True because it does not has common values.
		
		lst2.add("Jeeva");
		lst3.add("Jeeva");
		System.out.println(Collections.disjoint(lst2, lst3));//it will return false because it has common values.
		
		System.out.println(lst.equals(lst1));
		
		
	}
	
}
