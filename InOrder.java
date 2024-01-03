/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int savePrevNum = 0;  
		int temp = 0;
		int numRandom = 1;
		while (numRandom > savePrevNum) {
			savePrevNum = temp;
			numRandom = (int)(Math.random() * 10);
			if(numRandom >= savePrevNum)
			System.out.print(numRandom + " ");
			temp = numRandom;
		}
	} 
}

