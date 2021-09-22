/*1. move all zeros to end of the array
	int a[] = {5,0,3,6,9,5,0,6,0,3,6}

*/
package InterviewProgram;

import java.util.Arrays;

public class MoveAllZeroAtEnd {
	//method1:  zero to move at end
	void moveAllZeroAtEnd(int[] input) {
		 
		int x=0;
		int output[]= new int[input.length];
		for (int i=0; i< input.length; i ++) {
			if(input[i]!=0){
				output[x]=input[i];
				x++;
			}
		}
		System.out.println(Arrays.toString(output));	
	}
	//to move zero at start
	
	void tomoveZeroAtStart(String input[]) {
		
		
		
	}
	//
	
	
	public static void main (String[] hjhj) {
		int a[] = {5,0,3,6,9,5,0,6,0,3,6};
		MoveAllZeroAtEnd p= new MoveAllZeroAtEnd();
		p.moveAllZeroAtEnd(a);
	}
}
