package Revision.collection.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1 {

	public static void main(String[] args) {
		 HashSet set=new HashSet();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");//Try to Add duplicate value but will not store this values.  
		  set.add("Ajay");  
		  set.add("ravi");//Try to Add duplicate small char' but it will store.
		  System.out.println(set);
		 
		  //*****************addAll(Collection c)**********//will add collection in the list
		 System.out.println("***************addAll(Collection c)*********");
		  HashSet hs = new HashSet();
		  hs.add("murugan");
		  hs.add("jeeva");
		  hs.add("mathi");
		  hs.add("");//will allow null values
		  hs.add("");
		  System.out.println(set);
		  System.out.println(hs);
		  set.addAll(hs);
		  System.out.println(set);
		  
		  //******************contains(Object o)************// will check whether the specified object is present or not in the set
		  System.out.println("******************contains(Object o)**********");
		  System.out.println(set.contains("murugan"));
		  
		  //******************containsAll(Collection c)************// will check whether the specified collection is present or not in the set
		  System.out.println("******************containsAll(Collection c)**********");
		  System.out.println(set.containsAll(hs));
		  
		  //****************remove(Object o)*******************//will remove the specified element in the set.
		  System.out.println("****************remove()*******************");
		  System.out.println(set);
		  set.remove("murugan");
		  System.out.println(set);
		  
		  //************size()******************//return size
		  System.out.println("***********size()*****************");
		  System.out.println(set.size());//index start from '0' 
		  //the collection index start from '0' like array.
		  
		  //*****************iterator()****************
		  System.out.println("**************iterator()*************");
		  System.out.println(set);
		  Iterator it = set.iterator();
		  while(it.hasNext()){
			  System.out.println(it.next());
		  }
		  
		  
	}

}
