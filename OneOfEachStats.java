import java.util.Random;
import java.util.Scanner;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		int numKids2 = 0;
		int numKids3 = 0;
		int numkids4more = 0;
		int totalChildren = 0;
		String  comminChild = "";
		for (int i = 0; i < T; i++) {

			//String str = "";
			int count = 0;
			boolean boy = false;
			boolean girl = false;
			while(boy == false || girl == false){
				double rnd = generator.nextDouble();;
				if(rnd > 0.5){
					
					girl = true;
				}else{
					
					boy = true;
				}
				count++;
			}
				totalChildren +=count;
			if(count == 2){
				numKids2++;
			}else if(count == 3){
				numKids3++;
			}else{
				numkids4more++;
			}
		}
			double average = ((double)totalChildren / T) ;

			int max = (Math.max(Math.max(numKids2, numKids3),numkids4more));
			if(max == numKids2){
				comminChild = "2";
			}else if (max == numKids3) {
				comminChild = "3";
			}else{
				comminChild = "4 or more";
			}
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children:" + numKids2);
		System.out.println("Number of families with 3 children:" + numKids3);
		System.out.println("Number of families with 4 or more children:" + numkids4more);
		System.out.println("The most common number of children is " + comminChild + ".");
	}
}
