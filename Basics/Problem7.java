Prob 7:

Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

Nandy

Raja

5

Expected output:

NandyRaja

NandyRaja

NandyRaja

NandyRaja

NandyRaja

Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times.










package java_DSA;

import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		
		System.out.println("Enter the inputs : ");
		
		Scanner scan = new Scanner(System.in);
		
		String First = scan.next();
		String last = scan.next();
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println(First+last);
		}
		
	}

}
