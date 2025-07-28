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
