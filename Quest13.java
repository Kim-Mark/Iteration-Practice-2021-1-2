import java.util.Scanner;

public class Quest13 {

	public static void main(String[] args) {
		// 0���� ū ���� n �Է� �ޱ�
		int num;
		int i;
		int j;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the positice integer: ");
		num = sc.nextInt();
		
		while(num < 0) {
			System.out.print("Enter the positice integer: ");
			num = sc.nextInt();
		}
		for(i = 1; i <= num; i++) {
			for(j = 1; j <= num; j++) {
				if(i % j == 0 && i > j) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		

	}

}
