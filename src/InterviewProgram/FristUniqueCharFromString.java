/*get the first unique character from the input string
	String s="Ankita"
	String s2="Amruta"*/

package InterviewProgram;

public class FristUniqueCharFromString {
	
	void findFirstUniqueChar() {
		String s= "Anikita";
		s= s.toLowerCase();
		int i=0;
		for (i=0; i< s.length(); i++) {
			if(s.indexOf(s.charAt(i))== s.lastIndexOf(s.charAt(i)))
				break;
		}
		System.out.println(s.charAt(i));	
	}
	
	public static void main(String[] args) {
		
	}
}
