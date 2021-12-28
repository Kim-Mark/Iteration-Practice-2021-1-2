import java.util.Scanner;

public class Quest6 {

	public static void main(String[] args) {
		int people = 10;
		int sum = 0;
		int pay;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(i <= people) {
			System.out.print(i  + "'st customer's payment: ");
			pay = sc.nextInt();
			sum += pay;
			i += 1;
		}
		System.out.print("Total income is " + sum + "won");
	}

}
