package String;

public class primeNo {
	public static void main(String[] args) {
		int count=0;
		int n=2;

		while (count<5){
			boolean flag= false;
			for (int i=2; i<= n/2;i++){
				if (n%i==0){
					flag=true;
					
					break;
				}
			}
			if (flag==false) {
				System.out.println("Prime no " +n);
				count++;
			}
			n++;
		}
		String str= "bhakti";
		StringBuffer str2= new StringBuffer("Vaishnavi");// string gets convereted into string buffer
		String str3= str2.toString(); // stringBuffer gets converted into String 
	
		str2.reverse();
		System.out.println(str2);
	}	

}
