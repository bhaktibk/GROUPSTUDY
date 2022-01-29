/*Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/

package InterviewProgram;

public class SecondLargestWord {

	void tofindSecondLargestWord(String input) {
		String[] array1 = input.split(" ");
		String firstLarge = "";
		String sceondLarge = "";
		for (int i = 0; i < array1.length; i++) {
			if (array1[i].length() > sceondLarge.length()) {
				if (array1[i].length() < firstLarge.length())
					sceondLarge = array1[i];
				else {
					sceondLarge = firstLarge;
					firstLarge = array1[i];
				}
			}
		}
		System.out.println(sceondLarge);
	}

	// Find second largest number in array
	void secondLargestNumFromArray(int[] num) {
		int max1 = 0;
		int max2 = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max2) {
				if (num[i] < max1)
					max2 = num[i];
				else {
					max2 = max1;
					max1 = num[i];
				}
			}
		}
		System.out.println("Max 1: " + max1);
		System.out.println("Max 2: " + max2);
	}

	public static void main(String[] args) {
		int[] num = { 12, 30, 40, 10, 9, 50, 45 };
		String str = "this Welcome to the Roayabost family";
		String str1 = "Welcome to the family";
		SecondLargestWord a1 = new SecondLargestWord();
		// a1.tofindSecondLargestWord(str);
		// a1.tofindSecondLargestWord(str1);
		a1.secondLargestNumFromArray(num);
	}

}
