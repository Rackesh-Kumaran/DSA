package java_DSA;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		
		System.out.println("Enter the inputs");
		
		
		Scanner Scan = new Scanner (System.in);
		
		
		
		int num1 = Scan.nextInt();
		int num2 = Scan.nextInt();
		int num3 = Scan.nextInt();
		
		int sum = num1+num2+num3;
		
		if(sum == 180) {
			System.out.println(" triangle is formed"+" "+sum);
		}
		else {
			System.out.println(" triangle is not formed"+" "+sum);
		}
	
		
		
	}
	

}
