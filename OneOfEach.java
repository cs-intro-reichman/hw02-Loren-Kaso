
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		String str = "";
		int count = 0;
		boolean boy = false;
		boolean girl = false;
		while(boy == false || girl == false){
			double r = Math.random();
			if(r > 0.5){
				str += "g ";
				girl = true;
			}else{
				str += "b ";
				boy = true;
			}
			count++;
		}
		System.out.println(str);
		System.out.println("You made it... and you now have "+count+ " children.");
	}
}