Prob 3: 

Given mark of student, Print the Grade

Grade A if mark is greater than or equal to 90

Grade B if mark is greater than or equal to 80

Grade C if mark if greater than or equal to 60

Grade D if mark if greaer than or equal to 35

Fail if mark is lesser than 35


Input: 95

Expected Output:

Grade A

Explanation: Here 95 is greater than or equal to 90 so its Grade A




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
