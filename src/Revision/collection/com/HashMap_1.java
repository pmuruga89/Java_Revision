package Revision.collection.com;

import java.util.HashMap;
import java.util.Map;

public class HashMap_1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		}  
		
		//***************containsKey(Object key)****************//will verify whether the key is present in the hashmap.
		System.out.println("***************containsKey(Object key)****************");
		System.out.println(hm.containsKey(100));
		
		//**************containsValue(Object value)**************//will verify whether the value is present in the hashmap.
		System.out.println("**************containsValue(Object value)*************");
		System.out.println(hm.containsValue("Amit"));
		
		//**************isEmpty()******************//will check whether the hash map is empty
		System.out.println("**************isEmpty()******************");
		System.out.println(hm.isEmpty());
		
		//****************entrySet()**************//will return set of keys and values in the hashmap.
		System.out.println("****************entrySet()**************");
		System.out.println(hm.entrySet());
		
		
		//****************keySet()******************//will return only keys in the hash map.
		System.out.println("****************keySet()******************");
		System.out.println(hm.keySet());
		
		//***************value()*****************//will return only value in the hash map.
		System.out.println("***************value()****************");
		System.out.println(hm.values());
		
		
		//***************put(Object key, Object value)********************//will insert the value in hash set.
		System.out.println("***************put(Object key, Object value)********************");
		hm.put(103, "murugan");
		System.out.println(hm.entrySet());
		
		//***************size()*****************
		System.out.println("***************size()*****************");
		System.out.println(hm.size());
		
		hm.put(108, "murugan");		
		
		
		
		
		
		
		
		
		
		
		
	}	

}
