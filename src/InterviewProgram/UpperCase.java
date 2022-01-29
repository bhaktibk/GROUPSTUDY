/*PrintUpperCAse
 * hint ch =charAt(index)*/

package InterviewProgram;

public class UpperCase {
	
	//to print uppercase 
	void toPrintUpperCase() {
		String str= "Priya Son@takket";	
		for(int i=0; i<str.length(); i++) {
			char ch1= str.charAt(i);
			if (Character.isUpperCase(ch1)) {
				System.out.println(ch1+ " ");
			}
		}
	}
	// 1) PrintlowerCase 
	// 2) PrintDigits 
	// 3) Print  sepecial character 
	 

	
	public static void main(String[] args) {
		//to print uppercase 
	 
			 
	}
		
}
	
	
