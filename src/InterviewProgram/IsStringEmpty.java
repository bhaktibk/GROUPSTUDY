/*
We can check if the string is empty or not using the following methods
1. str.isEmpty();
2.if(str=="")
sop("String is empty");
3.if(str==null)
sop("String is empty"); */

package InterviewProgram;

public class IsStringEmpty {
	static String strinstance;
	
	public static void main(String[] args) {
		String str=""; 
		System.out.println(strinstance);
		if(str.isEmpty())
			System.out.println("String is empty1");
		if(str=="")
			System.out.println("String is empty2");
		if(strinstance==null)
			System.out.println("String is empty3");
		else
			System.out.println("hi");
	}
	 

}
