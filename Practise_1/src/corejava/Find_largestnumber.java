package corejava;

public class Find_largestnumber {

	public static void main(String[] args) {
		int n[]=new int[]{30, 56, 46, 78 , 8, 98, 100, 86};
		int smallnumber= n[0];
		int largestnumber=n[0];
		System.out.println(n.length);
		for (int i = 1; i < n.length; i++) {
			if (n[i]>largestnumber) {
				largestnumber=n[i];
				
			}
			else if(n[i]<smallnumber)
				smallnumber=n[i];
			{
				
			}
			
		}
		System.out.println("Largestnumber:"+largestnumber);
		System.out.println("smallestnumber:"+smallnumber);

	}

}
