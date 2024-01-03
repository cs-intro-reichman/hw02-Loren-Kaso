import java.util.Scanner;

/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i = 1; i <= num / 2; i++) {
			if(num % i == 0){
				System.out.println(i);
			}
		}
		System.out.println(num);
	}
}
