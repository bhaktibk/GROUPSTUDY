/*22. Write a program to add 0 after every ‘5’ in the 
 * int array for e.g.  {4, 6, 5, 7, 9, 5, 8,5,1}
*/
package InterviewProgram;

import java.util.Arrays;

public class AddZeroAfterPercularNuminArray {
	
	void addZeroafter(int[] numArray, int n) {
		int count=0;
		for (int i=0; i< numArray.length; i++) {
			if(numArray[i]==n)
				count++;
		}
		int[] output= new int[numArray.length+count];
		int index=0;
		for (int i=0; i< numArray.length; i++) {
			if (numArray[i]==n) {
				output[index]=numArray[i];
				output[++index]=0;
				index++;
			}else {
				output[index]=numArray[i];
				index++;
			}	
		}
		System.out.println(Arrays.toString(output));
	}
	
	 
		
	
	
	public static void main(String[] args) {
		int[] numArray={4, 6, 5, 7, 6, 5, 8,5,6};
		AddZeroAfterPercularNuminArray a= new AddZeroAfterPercularNuminArray();
		a.addZeroafter(numArray, 6);
	}
}
