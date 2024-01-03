/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		String outStr = ""; 
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if(num % i == 0){
				sum += i;
				outStr += i + " + "; 
			}
		}
		if(sum == num){
			System.out.println(num + " is a perfect number since " + num + " = " + outStr.substring(0,outStr.length() - 2));
		}else{
			System.out.println(num + " is not perfect number");
		}
	}
}

