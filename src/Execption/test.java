package Execption;

public class test {
	public static void main(String[] args) {
		int xcase = 3;

		switch (xcase) {
		case 1:
			System.out.println(3);
		case 2:
			System.out.println(3);
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(3);

		}
		
		 int y=8;
		 String yString=  "bhakti is ";
		 System.out.println(yString.startsWith("is"));
		 yString= yString.replaceFirst("b", "yes");
		 System.out.println(yString +"   replev ");
		 String s1= new String ("bhakti");// heap 
		 String s2= "bhakti";
		 System.out.println(s1==s2);// memory 
		 s1=s1.intern();
		 System.out.println(s1==s2);
		 
		 // string in to string Buffer 
		 
		 StringBuffer str3= new StringBuffer(s2);
		 
		 // 
		 String newString= str3.toString();
		 
		 
		 
		 
		 
		
		
	}
 
	

	

}
