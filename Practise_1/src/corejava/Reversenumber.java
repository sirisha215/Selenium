package corejava;

public class Reversenumber {

	public static void main(String[] args) {
	 int i= 1234;
	 int reverseno=0;
	 int temp=0;
	 while (i>0) {
		 temp=i%10;
		 i=i/10;
		 reverseno=reverseno*10 + temp;
		 
		
		
	}
	 System.out.println("reverseno is"+reverseno);
	 


	}

}
