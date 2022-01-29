/*J
J A 
J A V 
J A V A
*/

package InterviewProgram;

public class Patternt {
	
	static void print(int rows){
		 char ch= 74, ch1=65, ch2= 86 ; 
		 
		for (int i=1; i<=rows; i++){
			
			int count=1;
			for (int j=1 ; j<=i; j++){
				if (count >=5) {
					count=1;
				}	
				 switch (count) {
					 case 1:
						 System.out.print(ch);
						 count++;
						 break;	
					case 2: 
					case 4:	
						System.out.print(ch1);
						 count++;
						break;
					case 3: 
						System.out.print(ch2);
						 count++;
						break;	
				 }
			}
			System.out.println();	
		}	
	}

	
	
	public static void main(String[] args) {
		print(4);
		
	}
}
