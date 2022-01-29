package InterviewProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AllPrograms {
	public static void main(String[] args) {
/*		
		//1. move all zeros to end of the array
		int a[] = {5,0,3,6,9,5,0,6,0,3,6};
		int b[]= new int[a.length];
		int j=0;
		
		for (int i=0; i < a.length; i++){
			if (a[i]!=0){
				b[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
				
		//2.print first non repeating character from a string
		//2: m1
		Integer number[] = {5,0,3,6,9,5,0,6,0,3,6};
		int num=0, count=0;
		ArrayList <Integer> ar1= new ArrayList<Integer> (Arrays.asList(number));
				
		for (int n: ar1){
			if (ar1.contains(n)){
				num=n;
				count++;
				if (count==1) 
					break;
			}	
		}
		
		//m2
				Integer aa[]= {5,0,3,6,9,5,0,6,0,3,6};
				ArrayList<Integer>  numberList= new ArrayList(Arrays.asList(aa));
				for (int n : numberList ) {
					if (numberList.indexOf(n)!=numberList.lastIndexOf(n)) {
						System.out.println("m2 arraylist method "+n);
						break;
					}	

				}


		System.out.println(num);
		//3. Reverse a string

		String str= "Bhakti";
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		str= sb.toString();
		System.out.println(str);
		System.out.println(sb);
		
		//4. Find duplicate elements from an array
		System.out.println("--4. Find duplicate elements from an array----");
		Integer aa1[]= {5,0,3,6,9,5,0,6,0,3,6};
		String[] strname= {"B", "C", "D"};
		for (int n: aa1) {
			int count1=0;
			if (n!=-100) {
				for(int i=0;i <aa1.length; i++) {
					if (n==aa1[i]) {
						count1++;
						aa1[i]=-100;
					}
				}
				if (count1> 1) {
					System.out.println(n);
				}
		}
		
			//m2 
			
	}
		*/
		
		m1();
	 
	}	
	
	static void m1() {
		Integer aa1[]= {5,0,3,6,9,5,0,6,0,3,6};
		System.out.println("Program 4- method2");	
		HashMap<Integer, Integer> hm= new HashMap();
		for (int n: aa1) {
			if (hm.containsKey(n)) {
				int count= hm.get(n);
				hm.put(n, ++count);
			}else {
				hm.put(n, 1);
			}
		}
		
		Set<Integer> keys= hm.keySet();
		for (int num: keys) {
			if (hm.get(num)>1) {
				System.out.println(num);
			}
		}
			
		ArrayList<Integer> ar1= new ArrayList(Arrays.asList(aa1));
		HashSet<Integer> hh= new HashSet();
		//	Integer aa1[]= {5,0,3,6,9,5,0,6,0,3,6};
		System.out.println(ar1.indexOf(3)!=ar1.lastIndexOf(3));
		System.out.println("--------");
		for (int i=0; i< ar1.size(); i++) {
			int n= ar1.get(i);
			if (ar1.indexOf(n)!=ar1.lastIndexOf(n)) {
				System.out.println( n);
				hh.add(n);
				
			}
			 
			
			
		}
		System.out.println("------");
		System.out.println(hh);
	}
}
