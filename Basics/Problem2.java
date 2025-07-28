Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.

If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.

Input: 45 45 45

Expected Output: 

Triangle cannot be formed

Explanation -> We are getting 3 inputs, that is three angles of triangle, but here the sum of three angles that is 45+45+45 is not equal to 180 so Triangle cannot be formed is the output.





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
