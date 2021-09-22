/*Anagram means 
 * str1= cat, act 
*/
package InterviewProgram;

public class Anagram {
	//method 1 to find anagram
	void isAnagram(String s1, String s2) {
		
		int sum1=0;
		int sum2=0;
		if (s1.length()== s2.length()) {
			for (int i=0; i < s1.length(); i++) {
				sum1+=s1.charAt(i);
				sum2+=s2.charAt(i);
			}
			if (sum1==sum2)
				System.out.println("Anagram");
			else 
				System.out.println("not Anagram");
		}else 
			System.out.println("Not anagram");
		
	}
	

	public static void main(String[] args) {
		Anagram a= new Anagram();
		a.isAnagram("cat", "atc");
		a.isAnagram("cat", "ats");
	}
}
