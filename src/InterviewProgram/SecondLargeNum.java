package InterviewProgram;

import java.util.Arrays;

public class SecondLargeNum {
	// Find second largest number in array 
		void secondLargestNumFromArray(int[] num) {
			int max1=0;
			int max2=0;
			for (int i=0; i< num.length; i++) {
				if(num[i]>max2) {
					if (num[i]<max1)
						max2=num[i];
					else {
						max2=max1;
						max1=num[i];
					}			
				}
			}
			System.out.println("Max 1: "+max1);
			System.out.println("Max 2: "+max2);
		}
		
		//option 2
		void largeNum(int n, int[] number) {
			Arrays.sort(number);
			System.out.println(number[number.length-n]);
		}
		
		public static void main(String[] args) {
		 
			// TODO Auto-generated method stub
			int[] num= {12,52,30,40,10,9,50,45};
			
			SecondLargeNum s= new SecondLargeNum();
			s.secondLargestNumFromArray(num);
			s.largeNum(3, num);

		}

}
