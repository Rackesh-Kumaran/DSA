package java_DSA;

import java.util.Scanner;


public class Problem3 {
	public static void main(String[] args) {
		
		System.out.println("Enter the inputs : ");
		
		Scanner scan = new Scanner(System.in);
		
		int Grade = scan.nextInt();
		
		if(Grade >= 90 ) {
			System.out.println("Grade A" + " " + Grade);
		}
		else if(Grade >= 80){
			System.out.println("Grade B" + " " + Grade);
		}
		else if(Grade >= 60) {
			System.out.println("Grade C" + " " + Grade);
		}
		else if(Grade >= 35) {
			System.out.println("Grade D" + " " + Grade);
		}
		else {
			System.out.println("Fail" + " " + Grade);
		}
		
	}

}
