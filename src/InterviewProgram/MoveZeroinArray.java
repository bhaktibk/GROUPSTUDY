/*1. move all zeros to end of the array
	int a[] = {5,0,3,6,9,5,0,6,0,3,6}

*/
package InterviewProgram;

import java.util.Arrays;

public class MoveZeroinArray {
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
	
	void tomoveZeroAtStart(int input[]) {
		int output[]= new int [input.length];
		int count=0;
		for (int i=0; i< input.length; i++) {
			if (input[i]==0)
				count++;
		}
		for (int i=0; i <input.length; i++) {
			if (input[i]!=0) {
				output[count]=input[i];
				count++;
			}	
		}
		System.out.println(Arrays.toString(output));
	}
	//
	
	
	public static void main (String[] hjhj) {
		int a[] = {5,0,3,-6,9,5,0,6,0,3,6};
		MoveZeroinArray p= new MoveZeroinArray();
		p.moveAllZeroAtEnd(a);
		p.tomoveZeroAtStart(a);
	}
}
