package Execption;

public class MultipleTryCatchDemo {
	MultipleTryCatchDemo obj1;

	void process() {

		int x = 2 * 10;
		System.out.println(x);
		try {
			obj1.m1();
			x = 2 / 0;// THIS LINE WONT GET EXECUTED
			System.out.println("1st try block");
		}
		/*
		 * catch(ArithmeticException ae) { System.out.println(" Arithmetic Exception");
		 * }
		 */
		catch (NullPointerException ae) {

			try {
				// int a[]= {1,2,3,4};
				int xx = 8 / 0;
				System.out.println("Dision Result " + xx);
			} catch (NullPointerException aa) {
				System.out.println("May be we are operating on null reference");
			}

			System.out.println("NullPointer Exception");
		}

		catch (ArithmeticException aaa) {
			System.out.println("May be you are operating on out of index value");
		}
	}

	void m1() {
		System.out.println("Inside MA METHOD");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultipleTryCatchDemo().process();

	}

}