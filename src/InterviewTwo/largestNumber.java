package InterviewTwo;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value ");
		int a=sc.nextInt();
		
		System.out.println("Enter b value ");
		int b=sc.nextInt();
		
		System.out.println("Enter c value ");
		int c=sc.nextInt();
		
//		if ( a>b && a>c) {
//			System.out.println(a +" Greatest of three numbers ");
//		}
//	
//		
//
//		if ( b>a && b>c) {
//			System.out.println(b +" Greatest of three numbers ");
//		}
//	
//
//		if ( c>a && c>b) {
//			System.out.println(c +" Greatest of three numbers ");
//		}
	
		
	      int largest = c>(a>b?a:b)?c:(a>b?a:b);
	      System.out.println(largest + "  is largest number  ");
		
		
		
		
		
		
	}

}
