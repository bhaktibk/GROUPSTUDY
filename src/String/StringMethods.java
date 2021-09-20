 /*   
5) int lastIndexOf(char ch) [done]
6) String toLowerCase() [done]
7) String toUpperCase() [done]
8) replace() [done]
9) split [done]
10) replaceAll [done] //  facility to use regx 
11) length [done]
12) substring [done]
13) compareTo [done]// frist mismatch  match ASCII value compaire
14) trim [done]
15) startsWith [done]  //String compare
16) endsWith [done]   //String ends 
17) contains [done] // Provided String/Ch is available 
18) String intern - done   // to pull into COnstance pull
19) boolean isEmpty [done]  //
20) String replaceFirst - [done] //
21) char[] toCharArray() - [done] //
22) boolean equalsIgnoreCase(String str) [done]
23) String toString() -> [done]*/


package String;

import java.util.concurrent.SynchronousQueue;

public class StringMethods {
	// 1) char charAt(int index) [done]
	static void charAt() {
		String str="Harshada";
		char ch= str.charAt(5);//a
		char ch1= str.charAt(9);//no Ce, runtime: java.lang.StringIndexOutOfBoundsException
		char ch2= str.charAt(-1);//no Ce, runtime: java.lang.StringIndexOutOfBoundsException
		System.out.println(ch);		
	
	}
	//2) String valueOf(int num) : Overloaded method [done]// get conevreted intoString 
	
	static void valueOf() {
		char ch='e';
		int d= 787;
		String s="Amruta";
		
		String str = String.valueOf("hsgfhsvfhsfd");
		String str2= s.valueOf("this is on revriablename");// this is also possible 
		
		System.out.println(str);
		System.out.println(str2);
		String num="12e";
		String num1= "10";
		//int n1= Integer.parseInt(num); //NumberFormatException.: as "12e" cant be converted into int
		//System.out.println(num);
				
	}
	//3) boolean equals(String str) [done]
	static void equals() {
		String s= "This";
		System.out.println(s.equals("this"));
		System.out.println(s.equalsIgnoreCase("this"));
		System.out.println(s.equals("This"));
	}
	
	//4) int indexOf(char ch) [done]//
	
	public static void main(String[] args) {
		//charAt();
		//valueOf();
		equals();
	}

}
