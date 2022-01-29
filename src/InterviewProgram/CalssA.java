package InterviewProgram;

import java.io.IOException;
import java.sql.SQLException;

public class CalssA {
	// * int [] input={10, 20,11, 30, 10, 10,11}
	// 10,2011,20
	static void printNumberOnce(int[] input)throws Throwable ,Error, RuntimeException, Exception, IOException, SQLException,ClassNotFoundException, InterruptedException {

		System.out.println("Print all Numbers only once");
		for (int i = 0; i < input.length; i++) {
			int count = 0;
			if (input[i] != -10) {
				for (int j = i + 1; j < input.length; j++) {

					if (input[i] == input[j]) {
						count++;
						input[j] = -10;
					}
				}
				if (count == 0) {
					System.out.println(input[i]);
				} else if (count == 1)
					System.out.println(input[i]);

			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 11, 30, 10, 10, 11 };
		// printNumberOnce(input);
		
		int arr[] = { 1, 2, 3, 4, 5, 1,1,2,  2, 3 };

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (num == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(arr[i]);
			}
		}
		throw new NullPointerException();

	}
}
