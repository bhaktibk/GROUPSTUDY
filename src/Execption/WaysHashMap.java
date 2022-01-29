package Execption;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class WaysHashMap {
	public static void main(String[] args) {
		 HashMap<String, Integer> hm= new HashMap(); 
			hm.put("b", 1);
			hm.put("c", 2);
			hm.put("a", 2);
			
			Set <String > str= hm.keySet();// key
			for (String keyVlaue: str) {
				System.out.println(keyVlaue + " "+hm.get(keyVlaue));
			}
			
			Iterator<String> itr1= str.iterator();
			while (itr1.hasNext()) {
				String keyVlaue=  itr1.next();
				System.out.println(keyVlaue +" "+hm.get(keyVlaue));
				
			}
			
			for (Entry<String, Integer> x: hm.entrySet()) {
				System.out.println(x.getKey() +" "+x.getValue());
			}
			
			//Collection<Integer> numbersValues=  hm.values();
		
	/// m1 by using keySet 	
			System.out.println ("------------");
		
		for (String num: str){
			System.out.println (num + " "+hm.get(num));
		}
		System.out.println ("------------");
	// iterator

		Iterator<String>  itr= str.iterator();
		while (itr.hasNext()){
			String name= itr.next();
			 System.out.println(name+" "+hm.get(name));
		}
		System.out.println ("------------");
	//EntrySet 

	for (Entry<String, Integer> n : hm.entrySet()){
		System.out.println(n.getKey()+" "+ n.getValue());
	}
	}

}
