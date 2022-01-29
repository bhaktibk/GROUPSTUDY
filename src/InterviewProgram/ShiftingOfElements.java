/*8. Shift the first element of array to last position and shift the rest towards left.
*/
package InterviewProgram;

public class ShiftingOfElements {
	
	void shiftelementNnumberofTime(String str, int num) {
		String output="";
		for (int i=0; i < num; i++) {
			output=shiftElements(str, num);
		}
		System.out.println(output);
	}
	
	String shiftElements(String str, int num) {
		String output="";
		for (int i=num; i< str.length(); i++ ) {
			output+=str.charAt(i);
		}
		for (int i=0; i<num; i++)
			output+=str.charAt(i);
		System.out.println(output);
		return output;
		
	}

	public static void main(String[] args) {
		
		
		ShiftingOfElements s= new  ShiftingOfElements();
		s.shiftElements("Bhakti", 2);
		
		
	}
}
