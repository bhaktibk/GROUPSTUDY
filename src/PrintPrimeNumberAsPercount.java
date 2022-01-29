// write a program we will provide how many numbres : 2 prime numbers : 2,3 ,   3 + 2,3,5 


public class PrintPrimeNumberAsPercount {
	

	boolean verifyNumberprime(int number) {
		boolean status = true;
		
		for (int index = 2; index < number; index++) {

			if (number % index == 0) {
				status = false;
				
				break;
			}
		}
		if (status == true) {
			System.out.println(number + " is prime");
			 
			return true;

		} else {
			 
			return false;
		}
	}
	
	void printPrimNumbers(int n) {
		
		int number=2;
		
		for (int count=0; count<n; count++) {
			boolean status=verifyNumberprime(number);
			if (status==true) {
				count++;
			}	
			number++;
			
		}	
		
	}
	

	public static void main(String[] arg) {
		PrintPrimeNumberAsPercount p1 = new PrintPrimeNumberAsPercount();
		
		p1.printPrimNumbers(10);
		System.out.println("End");
	}

}
