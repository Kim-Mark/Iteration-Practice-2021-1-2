import java.util.Scanner;

public class Quest3 {

	public static void main(String[] args) {
		int i;
		int cnt = 1;
		int sum = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		i = sc.nextInt();
		
		System.out.println("Value \t\t Sum");
		while(cnt <= i) {
			System.out.println(cnt + "\t\t" + sum);
			cnt += 1;
			sum += cnt;

		}

	}

}
