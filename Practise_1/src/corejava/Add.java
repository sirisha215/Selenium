package corejava;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Integer a , b , c;
		//a=20;
		//b=30;
		System.out.println("enter two integers:");
		Scanner scr= new Scanner(System.in);
		a=scr.nextInt();
		b=scr.nextInt();
		c=a+b;
		System.out.println("Addition of two numbers:"+c);
		c=a-b;
		System.out.println("Substraction of two numbers:"+c);
		c=a*b;
		System.out.println("Multiply two numbers:" +c);
		
		
	}

}
