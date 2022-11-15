package application;
import java.util.Scanner;

public class GCD {
	
	/**
	 * Error to output if either input is not positive
	 */
	static final String E_POSITIVE = "Inputs must both be positive.";

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		int b = 0;

		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		
		if(a <= 0 || b <= 0) {
			
			System.out.println(E_POSITIVE);
			
			System.exit(1);
		}
		
		int output = gcd(a,b);
		
		
		System.out.println("The GCD of " + a + " and " + b + " is " +output);
	}
	
	/**
	 * Returns the greatest common denominator (gcd) of two positive integers
	 * 
	 * @param num1 integer 1
	 * @param num2 integer 2
	 * @return gcd of integers 1 and 2
	 */
	public static int gcd(int num1, int num2) {
		
		
		while (num1 != num2) {
			
			if(num1 > num2) {
				
				num1 = num1 - num2;
			
			} else {
				num2 = num2 - num1;
			}
			
		}
		
		return num2;
	}


}
