/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int savePrevNum = min;  
		int numRandom = min + 1;
		int temp = min;
		
		while (numRandom > savePrevNum) {
			savePrevNum = temp;
			numRandom = (int)((Math.random() * (max - min)) + min);
			if(numRandom > savePrevNum)
			System.out.print(numRandom + " ");
			temp = numRandom;
		}
	} 
}

