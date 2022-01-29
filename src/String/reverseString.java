package String;

public class reverseString {
	public static void main(String[] args) {
		String str1= "technocredit";
		StringBuffer output= new StringBuffer(str1);
		output.reverse();
		str1= output.toString();
		System.out.println (str1);
		String input="technocredit";
		String output11="";
		for (int i=str1.length()-1; i>= 0; i--){
			char ch= input.charAt(i);
			 output11= output11+ch;
		}
		System.out.println(output11);

	}

}
