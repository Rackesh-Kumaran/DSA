Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.


Input:  2 Name y

Expected Output:

2

Name

y



package java_DSA;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		
		System.out.println("Enter the inputs:");
		
		Scanner scan = new Scanner(System.in);
		
		int Number = scan.nextInt();
		
		String Words = scan.next();
		
		char letter = scan.next().charAt(0);
		
		System.out.println(Number);
		System.out.println(Words);
		System.out.println(letter);
		
		
				
	}

}
