import java.util.Random;
import java.util.Scanner;

public class Quest8 {

	public static void main(String[] args) {
		int num;
		int input;
		
		Random gen = new Random();
		num = gen.nextInt(11) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter the number you guess: ");
			input = sc.nextInt();
			if(num > input) {
				System.out.println("Wrong.");
				System.out.println("Up.");
			}
			else if(num < input) {
				System.out.println("Wrong.");
				System.out.println("Down.");
			}
			else {
				System.out.println("Answer!!!");
			}
		} while(num != input);
		
	}

}
