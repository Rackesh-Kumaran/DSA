Prob 5:

Write a program which takes two values x and y. Prints x for y number of times.

Input:

2 

3

Expected Output

2

2

2

Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output.









package java_DSA;
import java.util.Scanner;

public class Problem5 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the inputs");
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		for(int i=1;i<=y;i++) {
			System.out.println(x);
			
		}
		
	}

}
