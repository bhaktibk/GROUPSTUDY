/*print first non repeating character from a string
 * String str= "Hello"
 * output= Heo
*/
package InterviewProgram;

public class DuplicateCharFromString {
	//Get non repeating char
	void getNonrepeatingCharFromString(String str) {
		System.out.println("Non repetating characters");
		for (int i=0; i< str.length();i++) {
			
				 if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
					 System.out.println(str.charAt(i));
				 }
		}
	//	
		
	}
	// Get repeating char
	void getrepeatingCharFromString(String str) {
		System.out.println("Repetating characters");
		for (int i=0; i< str.length();i++) {
			int count=0;
			for (int j=i+1; j<str.length();j++) {
				if (str.charAt(i)==str.charAt(j)) {
					count++;
					 
				}	
			}
			if (count==1)
				System.out.println(str.charAt(i));
			 
		}
	}	
		
		 
				 
	
	public static void main(String[] args) {
		String str= "Bhiaktiki";
		DuplicateCharFromString d= new DuplicateCharFromString();
		d.getrepeatingCharFromString(str);
		d.getNonrepeatingCharFromString(str);
	
	}
}
