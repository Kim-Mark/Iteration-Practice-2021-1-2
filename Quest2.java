import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		String pw = "kkk";
		String input;
		int val = 0;
		
		Scanner sc = new Scanner(System.in);

		while(val < 3) {
			System.out.print("Enter the password: ");
			input = sc.next();
			if(pw == input) {
				System.out.print("Welcome!!");
			}
			else {
				System.out.println("Try again.");
				val += 1;
			}
		}
		

	}

}
