/*HashMap Methods

1. get(Object key)
--> Return value if key is valid
--> return null if key not present in map

2. put(Object key, Object value)
--> return previous assciate value, if key coming for the first time then it will return null.
--> you can pass null as well.

3. containsKey(Object key)
--> return true if key present in Map
--> return false if the passed key has a different data type than expected.
	if created Map<Character, Integer> and in key you map.containsKey("a") then it will return false.
	
4. containsValue(Object key)
--> same as above

5. isEmpty()
--> If map does not holding any value then return true, which is equivalent to 	map.size() == 0

6. clear()
--> Clear will remove all the entry from the map.

7. entrySet()

8. keySet()

9. putAll(map1);

10. replace(key, value)
--> if key found then it will return previous assciate value
--> if key not found then it will return null.

11. replace(key, oldValue, newValue)
--> if key and value matches then it will update it and return true
--> if either option is flase then it will return flase.*/
package Execption;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class exceptiontest {
	
	public static void main(String[] args) {
		

 
		HashMap sp= new HashMap();
		sp.put(1, "Amruta");
		sp.put(2, "Hashada");
		sp.put(3, "java");
		sp.put(3, "xyz");
		sp.put(2, "ABC");
		sp.put( null, "yyy");
		sp.put( null, 1);
		System.out.println(sp);
		
		System.out.println(sp.get(3)); //get  object 
		
		System.out.println(sp.containsKey(-2));
		System.out.println(sp.containsValue("ABC"));
		System.out.println(sp.containsValue("Bhakti"));
		System.out.println("Empty--> "+sp.isEmpty());
		
		//sysosp.clear();
		System.out.println(sp);
		HashMap<Character, Integer> sp1= new HashMap();
		
		 String str= "varsvha";
		 
		// char[] ch= str.toCharArray();
		 
		 for (int i=0; i< str.length(); i++ ) {
			 Character ch1= str.charAt(i);
			 if (sp1.containsKey(ch1)) {
				 int num = sp1.get(ch1);
				 sp1.put(ch1,++num );
			 }else {
				 sp1.put(ch1,1);
			 }	 
		 }
		 
		 System.out.println(sp1);
		 /*Assignment 47 : 6th Oct'2021

		 Program 1: find frequency of each char from string
		 	i/p : "varsha"
		 	o/p : v = 1
		 		  a = 2
		 		  r = 1
		 		  s = 1
		 		  h = 1

		 Program 2: find frequency of each word from line
		 	i/p : "hi good morning hello good morning"
		 	o/p : hi = 1
		 		  good = 2
		 		  morning = 2
		 		  hello = 1*/
		 
		 
		
	}

}
