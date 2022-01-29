
/*Remove extra space from String 
	String s="India    is    my country"
	output= Indis is my country*/

package InterviewProgram;

public class RemoveExtraSpace {
	
	public static void main(String[] args) {
		String str= "India    is    my country";
		System.out.println(str.replaceAll("\\s+", " "));
	}

}
