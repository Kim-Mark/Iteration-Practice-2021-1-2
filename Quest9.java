import java.util.Random;
import java.util.Scanner;

public class Quest9 {

	public static void main(String[] args) {
		
		int num;
		int input;
		int effort = 0;
		
		Random rand = new Random();
		num = rand.nextInt(101) + 1;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			input = sc.nextInt();
			effort += 1;
			if(num > input) {
				System.out.println("Wrong. Up.");
			}
			else if(num < input) {
				System.out.println("Wrong Down.");
			}
		} while(num != input);
		System.out.println("Answer. Attempt count is " + effort);
		

	}

}
