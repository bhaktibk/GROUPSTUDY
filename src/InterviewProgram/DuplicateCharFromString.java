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
	}	
	// Get non repeating char m2// to be checked 
		void getNONrepeatingCharFromString(String str) {
			System.out.println("Non-Repetating characters");
			for (int i=0; i< str.length();i++) {
				int count=0;
				for (int j=i+1; j<str.length();j++) {
					if (str.charAt(i)==str.charAt(j)) {
						count++;
						 
					}	
				}
				System.out.println(str.charAt(i) + " --"+count);
				/*if (count==0)
					System.out.println(str.charAt(i));*/
			}
		}	
	
	//	Get repetated char  m1 
		void getOnlyrepeatingCharFromString(String str) {
			System.out.println("Repetating characters");
			for (int i=0; i< str.length();i++) {
				if (str.charAt(i)!='*') {
					 if (str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))) {
						 System.out.println(str.charAt(i));
						 str=str.replace(String.valueOf(str.charAt(i)), "*");
						 
					 }
				} 
			}	
		
	}
	// Get repeating char m2
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
		//d.getrepeatingCharFromString(str);
		d.getNonrepeatingCharFromString(str);
		//d.getOnlyrepeatingCharFromString(str);
		d.getNONrepeatingCharFromString(str);
	
	}
}
