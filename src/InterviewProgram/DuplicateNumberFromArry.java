/*Find duplicate number from integer array
 * int [] input={10, 20,11, 30, 10, 9,5,11}
 * 
 * expected: 10, 11
*/
package InterviewProgram;

public class DuplicateNumberFromArry {
	
	void findDuplicateNum(int[] input) {
		
		for (int i=0; i< input.length; i++) {
			int count=0;
			for (int j=i+1; j<input.length;j++) {
				if (input[i]==input[j]) 
					count++;
			}
			if(count==1)
				System.out.println(input[i]);
		}
		 
	}
	
	public static void main(String[] args) {
		int [] input={10,30,20,12,5,10,90,12,5};
		int [] input1={10,2,20,8,5,10,90,12,12};
		int [] input3={10,0,10,8,0,10,90,12,12};
		DuplicateNumberFromArry num1= new DuplicateNumberFromArry();
		num1.findDuplicateNum(input);
		System.out.println("-------------");
		num1.findDuplicateNum(input1);
		System.out.println("-------------");
		num1.findDuplicateNum(input3);
	}

}
