package corejava;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Integer a;
		System.out.println("enter an integer:");
		Scanner scr= new Scanner(System.in);
		a=scr.nextInt();
		if (a%2==0) {
			System.out.println("Given number is even number");
			
		} else {
			System.out.println("Given number is odd number");

		}
		
		
}

}
