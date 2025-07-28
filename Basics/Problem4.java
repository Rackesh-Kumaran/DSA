package java_DSA;

import java.util.Scanner;

public class Problem4 {
	public static void main (String[] args) {
		System.out.println("Enter the inputs: ");
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		switch(size)
		{
		case 29:
			System.out.println("Medium");
			break;
		case 30:
			System.out.println("size is 29 then its small");
			break;
		case 38:
			System.out.println("Large");
			break;
		case 42:
			System.out.println("XLarge");
			break;
		default:
			System.out.println(" Invalid ");
			break;
			
		}
		
			
	}

}
