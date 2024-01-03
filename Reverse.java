import java.util.Scanner;

/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String revStr = ""; 
		
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);			
		}
		// int i = str.length()-1;
		// while (i >= 0) {
		// 	revStr += str.charAt(i);
		// 	i--;
		// }
		System.out.println(revStr);
		System.out.println("The middle character is " + revStr.charAt(revStr.length() / 2));
	}
}
