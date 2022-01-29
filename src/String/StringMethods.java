 /*   
  
18) String intern - 
19) boolean isEmpty  
21) char[] toCharArray() 
23) String toString()
*/


package String;

import java.util.Arrays;
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
	//2) String valueOf(anyDT value) : Overloaded method [done]// get conevreted intoString 
	
	static void valueOf() {
		char ch='e';
		int d= 787;
		String s="Amruta";
		
		String str = String.valueOf("hsgfhsvfhsfd");
		String str2= s.valueOf("this is on revriablename");// this is also possible 
		// also we can use concat to convert into string e.g. String = ch+""; 
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
	
	//4) int indexOf(char ch)  //overloaded 
	static void indexOf() {
		String str= "eeH*el*lo gm";
		
		System.out.println(str.indexOf('e', 2));
		System.out.println(str.indexOf('l'));//2
		System.out.println(str.indexOf(1));//-1
		System.out.println(str.indexOf('z'));
		System.out.println(str.indexOf('*'));
		System.out.println("new1: "+str.indexOf("gm"));
		
	}
	//5) int lastIndexOf(char ch)//overloaded method 
		static void lastIndexOf() {
		String str= " GnGood*MorGNni*ng";
		
		System.out.println("new "+str.lastIndexOf("GN"));
		System.out.println(str.lastIndexOf('z'));
		System.out.println(str.lastIndexOf(' '));
	}
	//6) String toLowerCase() [done]
	static void toLowerCase() {
		String str= "GOOD MONRING";
		System.out.println(str.toLowerCase());
		
	}
	
	//7) String toUpperCase() [done]
	static void toUpperCase() {
		String str="Go2od Mor4ning";
		String str1="234234&&";
		System.out.println(str.toUpperCase());
		System.out.println(str1.toUpperCase());
	}
	
	//8) replace() overloaded method of "String" , ch...class, DO NOT accept Regex
	final static void replace() {
		String str= "Good monring all lets statr class at 5 pm";
		System.out.println(str.replace(" ",""));
		System.out.println(str.replace("Good", "best"));
		System.out.println(str.replace('o', '@'));
	}
		
	//9 replace first, can accept string, char, regex 
	static void replaceFirst() {
		String str= "Good  monring  all alllets statr class at 5 pm";
		//System.out.println(str.replaceFirst("all", "1"));
		
		System.out.println(str.replaceFirst("\\s+", " "));// to remove extra spaces 
	}
	// 10. replace ALL : string, char , regext 
	static void replaceAll() {
		String str= "  Good  monring         all alllets           statr class at 5 pm";
		System.out.println(str.replaceAll("\\s+", " "));
		System.out.println(str.replaceAll("\\s+", " "));//to have only single space 
	}
	
	
	//11) split gets store in array   .. parameter STRINGONLY
	static void split() {
		String str="we are bright are future ";
		String arry[]= str.split("a");
		String num="10 20 30";
		String[] arry1= num.split(" ");
		System.out.println(Arrays.toString(arry));
		//System.out.println(Arrays.toString(arry1));
		
	}
	//11) length 
	static void length() {
		String str="we/are/bright";
		String str2="";
		System.out.println(str2.length());
	}
	//12) substring : overloaded  , either starindex  or start and end both 
	static void substring() {
		String str="we/are/bright";
		String str2="";
		System.out.println(str.substring(1));
		//System.out.println(str.substring(-1));// rund time error string indexout of bond
		System.out.println(str.substring(1,4));//1 including, 4 excluding 
		System.out.println("hi");
	}
	
	//13) compareTo  first mismatch  match ASCII value compaire
	static void compareTo() {
		int x= 'm';
		int x1=' ';
		int xx= 'M';
		System.out.println("m->" +x+"  M->"+xx+  "  space-->"+x1);
		
		String str1= "Good morning";
		String str4= "Good morning";
		String str2= "Good MoArning";
		String str3= "";
		System.out.println(str1.compareTo(str2));// m- M..  109-77= 32
		System.out.println(str2.compareTo(str1));// M-m = -32
		System.out.println(str2.compareTo(str3)); //  Str2 length will be print as there is nothing is second string
		System.out.println(str3.compareTo(str2));
		System.out.println(str1.compareTo(str4));
		if(str1.compareTo(str2)==0)
			System.out.println("Identical");
		else
			System.out.println("Unidentical");
		
	}
	
	//14) trim 
	
	//15) stratwith //overloaded method 
	static void startsWith  () {
		String str= "bhabhkri";
		
		System.out.println(str.startsWith("bh", 3));
	}
	//16) endswith 
		static void endsWith  () {
			String str= "bhabhkri";
			System.out.println(str.endsWith("kri"));
		}
		//17) contains
		static void contains() {
			String str= "hhgghgh";
			System.out.println(str.contains(""));
		}
		
		
	public static void main(String[] args) {
		//charAt();
		//valueOf();
		//equals();
		//indexOf();
		//lastIndexOf();
		//toLowerCase();
		//toUpperCase();
		//replace();
		//replaceFirst();
		//replaceAll();
		//split();
		//length();
		//substring();
		//compareTo();
		startsWith();
		//endsWith();
		//contains();
		
		char ch='c';
		System.out.println(Character.isAlphabetic(ch));
		System.out.println(Character.isDigit(ch));
		Character.toLowerCase(ch);
		Character.toUpperCase(ch);
		String b= "Bhakti";
		StringBuffer sb= new StringBuffer(b);
		sb.reverse();
		b= sb.toString();
		System.out.println(b);

	}
	 
	   
	  

}
