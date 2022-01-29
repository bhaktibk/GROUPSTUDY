package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateArrayNumber {
	public static void main(String[] args) {
		Integer a[]= {2,4,5,6,2,5,7};
		ArrayList<Integer> al= new ArrayList (Arrays.asList(a)) ;
		HashSet<Integer> output= new HashSet();
		for (int i=0; i< al.size(); i++){
			int num= al.get(i);
			if (al.indexOf(al.get(i)) != al.lastIndexOf(al.get(i))) {
				output.add(num);
			}	 
		}
		System.out.println(output);
	}
}
