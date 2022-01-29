


public class PrimeNumberInRange2 {
	

	void verifyNumberprime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {

			if (number % index == 0) {
				status = false;
				break;
			}
		}
		if (status == true) {
			System.out.println(number + " is prime");

		} /*else {
			System.out.println(number + " is not Primenumber");
		}*/
	}

	void getPrimeNumberInRange(int startNumber, int endEndNumber) {// 2, 4

		for (int number = startNumber; number <= endEndNumber; number++) {
			verifyNumberprime(number);
		}

	}

	public static void main(String[] arg) {
		PrimeNumberInRange2 p1 = new PrimeNumberInRange2();

		p1.getPrimeNumberInRange(12, 200);
		System.out.println("End");
	}

}
