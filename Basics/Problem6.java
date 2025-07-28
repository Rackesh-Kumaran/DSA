package java_DSA;

import java.util.Scanner;

public class Problem6 {
	
	public static void main(String[] args) {
		System.out.println("enter the inputs : ");
		
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();

		for(int i=1;i<=10;i++) {
			System.out.println(X * i);
		}
		
	}

}
