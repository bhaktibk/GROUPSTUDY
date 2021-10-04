/*Reverse a string
input String str= "Priya"
output "ayirP"
*/
package InterviewProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
	
	// reverse string 
	String reverseString(String str) {
		String output="";
		for (int i=str.length()-1; i>=0; i--) {
			output=output+ str.charAt(i);
		}
		return output;
	}
	
	// reverse array 
	void reverseArray (String[] input) {
		int count=0;
		String[] output= new String[input.length];
		for (int i=input.length-1;  i>=0; i--) {
			output[count]= input[i];
			count++;
		}
		System.out.println(Arrays.toString(output));
		
	}
	// to reverse just array elements 
	void reverseArrayElementsOfArray (String [] input) {
		
		for (int i=0;  i< input.length; i++) {
			 input[i]=reverseString(input[i]);
			
		}
		System.out.println(Arrays.toString(input));
		
	}
	
	public static void main(String[] args) {
		String arry1[]= { "Vaishanvi", "Pallavi", "Ganesh", "11", "12.45"};
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter string");
		//String input= scanner.nextLine();
		String str= "I am best";
		String str1=" Priya is v good";
		ReverseString r= new ReverseString();
		//r.reverseString(str);
		//r.reverseString(str1);
		//r.reverseString(input);
		r.reverseArray(arry1);
		r.reverseArrayElementsOfArray(arry1);
		
	}

}
