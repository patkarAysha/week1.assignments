package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=153,remainder,original;
		int calculated=0;
		original=input;
		while (input>0) {
			remainder=input%10;
			input=input/10;
			calculated=calculated+remainder*remainder*remainder;
			if(calculated == original) {
				System.out.println("The inputed number is an armstrong number");
			}
     	}
	}
}